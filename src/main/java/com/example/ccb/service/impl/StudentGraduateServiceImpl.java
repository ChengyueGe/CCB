package com.example.ccb.service.impl;

import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ccb.common.Block;
import com.example.ccb.common.BloomList;
import com.example.ccb.common.NoobChain;
import com.example.ccb.common.SignStatus;
import com.example.ccb.contract.Graduate;
import com.example.ccb.entity.StudentGrade;
import com.example.ccb.entity.StudentGraduate;
import com.example.ccb.exception.CustomizeException;
import com.example.ccb.exception.ErrorCode;
import com.example.ccb.mapper.StudentGradeMapper;
import com.example.ccb.mapper.StudentGraduateMapper;
import com.example.ccb.service.IStudentGraduateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ccb.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;

import java.math.BigInteger;
import java.util.Base64;
import java.util.List;

import static org.web3j.tx.gas.DefaultGasProvider.GAS_PRICE;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chen
 * @since 2021-06-01
 */
@Service
@Slf4j
public class StudentGraduateServiceImpl extends ServiceImpl<StudentGraduateMapper, StudentGraduate> implements IStudentGraduateService {

    @Autowired
    private StudentGraduateMapper studentGraduateMapper;

    @Autowired
    private StudentGradeMapper studentGradeMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private NoobChain chain;

    @Autowired
    private BloomList bloomList;

    @Autowired
    private Web3j web3j;

    @Value("${redis.publicKeyName}")
    private String pubKeyName;

    @Value("${redis.privateKeyName}")
    private String priKeyName;



    @Override
    public  Graduate loadContract(String pk){
        Credentials credentials = Credentials.create(pk);
        String contractAddress = "0xCF699267437b62DE943e5A62810272F6723a30eF";
        Graduate contract = Graduate.load(
                contractAddress, web3j, credentials,
                GAS_PRICE,new BigInteger("3000000"));
        return contract;
    }

    @Override
    public StudentGraduate getValidGraduateInfo(String certificateNum, String university, String identityNum) throws Exception {
        //1. 根据学历证书编号在区块链查找对应区块
        //区块链不可信直接返回异常
//        if (!chain.isChainValid()) {
//            throw new CustomizeException(ErrorCode.DATA_UNBELIEVABLE);
//        }
        //含有target的区块号
        int blockId = -1;
        Graduate contract = loadContract("000658eadfc028f908e8cf9457304763227afec9c4cc3643c1e8da1a54cedae3");

        //0号1号2号3号特殊处理
        if (certificateNum.equals(contract.cers(1).send().get(1).toString())) {
            blockId = 1;
        }
         else if (certificateNum.equals(contract.cers(2).send().get(1).toString())) {
            blockId = 2;
        } else if (certificateNum.equals(contract.cers(3).send().get(1).toString())) {
            blockId = 3;
        } else {
            blockId = bloomList.search(certificateNum);
        }

        String edata = null;
        if (blockId == -1) {
            return null;
        } else {
            edata = contract.cers(blockId).send().get(0).toString();
        }
        if (edata == null) {
            return null;
        }
        String jsonString = null;
        //2. 使用公钥对内容进行验证，解密失败则说明不是学生或者学校本人操作，数据不安全，直接返回错误
        String encryptedGraduateData = edata;
        //先取出学生的公钥进行验证
        try {
            String studentPubKey = (String)redisUtil.get(identityNum+pubKeyName);
            if (studentPubKey == null) {
                throw new CustomizeException(ErrorCode.KEY_NOT_FOUND);
            }
            RSA rsa = new RSA(null, Base64.getDecoder().decode(studentPubKey));
            //使用学生公钥进行验证
            byte[] ret = rsa.decrypt(Base64.getDecoder().decode(encryptedGraduateData), KeyType.PublicKey);
            ret = Base64.getDecoder().decode(new String(ret));

            //再取出学校的公钥进行验证
            String enterprisePubKey = (String)redisUtil.get(pubKeyName);
            if (enterprisePubKey == null) {
                throw new CustomizeException(ErrorCode.KEY_NOT_FOUND);
            }
            RSA rsa1 = new RSA(null, Base64.getDecoder().decode(enterprisePubKey));
            ret = rsa1.decrypt(ret, KeyType.PublicKey);
            jsonString = new String(ret);
            log.info(jsonString);

        } catch (Exception e) {
            throw new CustomizeException(ErrorCode.DATA_UNBELIEVABLE);
        }


        //3. 把解密得到的json串转化为对象
        StudentGraduate graduateInfo = JSON.parseObject(jsonString, StudentGraduate.class);


        //4. 验证对象的university和identityNum是否正确，正确则返回该条信息
        if (university.equals(graduateInfo.getUniversity())
            && identityNum.equals(graduateInfo.getIdentityNum())) {
            //还需要和数据库的信息进行对比，如果不一致说明存在篡改风险
            graduateInfo.setSignStatus(SignStatus.STUDENT_SIGN);
            StudentGraduate dbInfo = studentGraduateMapper.selectOne(
                    new QueryWrapper<StudentGraduate>()
                            .eq("certificate_num", certificateNum));
            if (dbInfo != null && dbInfo.equals(graduateInfo)) {
                return graduateInfo;
            } else {
                throw new CustomizeException(ErrorCode.DATA_UNBELIEVABLE);
            }
        } else {
            return null;
        }
    }

    @Override
    public boolean canGraduate(StudentGraduate studentGraduate,String pk) throws Exception {
        //寻找该学生学历层次下的所有必修成绩
        List<StudentGrade> list = studentGradeMapper.selectList(new QueryWrapper<StudentGrade>()
                                        .eq("student_num", studentGraduate.getStudentNum())
                                        .eq("education", studentGraduate.getEducation())
                                        .eq("course_type", "必修"));
        if (list.isEmpty()) {
            return false;
        }
//        Credentials credentials = Credentials.create(pk);
//        String contractAddress = "0xda4dD7CFaBE1F6EdAe3e158Fb4Df6d7BD4C3087C";
//        Graduate contract = Graduate.load(
//                contractAddress, web3j, credentials,
//                GAS_PRICE,new BigInteger("510000"));
        Graduate contract = loadContract(pk);
        String edu = studentGraduate.getEducation();
        if(edu.equals("本科")) {
            for (StudentGrade studentGrade : list) {
              boolean res = contract.canGraduate_UN(studentGrade.getCourseNum(),studentGrade.getScore(),studentGrade.getIdentityNum()).send().getValue();

              if(!res)
                  return false;
            }
        }else if(studentGraduate.getEducation()=="硕士") {
            for (StudentGrade studentGrade : list) {
                boolean res =  contract.canGraduate_MA(studentGrade.getCourseNum(),studentGrade.getScore(),studentGrade.getIdentityNum()).send().getValue();
                if(!res)
                    return false;
            }
        }else{
            for (StudentGrade studentGrade : list) {
                boolean res =  contract.canGraduate_PH(studentGrade.getCourseNum(),studentGrade.getScore(),studentGrade.getIdentityNum()).send().getValue();
                if(!res)
                    return false;
            }
        }


        //这个地方调用智能合约  成绩 所有的学分
        //key:课程号 value:该课程的最好成绩
//        Map<String, Integer> map = new HashMap<>();
//        for (StudentGrade studentGrade : list) {
//            if (map.get(studentGrade.getCourseNum()) == null) {
//                map.put(studentGrade.getCourseNum(), studentGrade.getScore());
//            } else {
//                //如果哈希表中已经存在课程号，且当前成绩更好，则将用当前的成绩将其覆盖
//                Integer higherScore = Math.max(map.get(studentGrade.getCourseNum()), studentGrade.getScore());
//                map.put(studentGrade.getCourseNum(), higherScore);
//            }
//        }
//
//
//        //最后遍历哈希表，如果仍存在不及格，则无法毕业
//        for (String courseNum : map.keySet()) {
//            if (map.get(courseNum) < 60) {
//                return false;
//            }
//        }
        return true;
    }

    @Override
    public BigInteger addtoChain(String data, String graduate_id, String pk) throws Exception {
        Graduate contract = loadContract(pk);
        contract.createGraduate(data,graduate_id).send();
        return contract.cerCount().send().getValue();
    }


}
