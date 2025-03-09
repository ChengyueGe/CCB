package com.example.ccb;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import com.example.ccb.common.BaseResult;
import com.example.ccb.contract.Graduate;
import com.example.ccb.controller.StudentGraduateController;
import com.example.ccb.service.IStudentGraduateService;
import org.bouncycastle.util.encoders.Hex;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.web3j.abi.*;
import org.web3j.abi.datatypes.*;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.contracts.eip20.generated.ERC20;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.*;
import org.web3j.tx.gas.DefaultGasProvider;

import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.web3j.tx.gas.DefaultGasProvider.GAS_LIMIT;
import static org.web3j.tx.gas.DefaultGasProvider.GAS_PRICE;


@SpringBootTest
@RunWith(SpringRunner.class)
class CcbApplicationTests {

    @Autowired
    private IStudentGraduateService studentGraduateService;
    @Autowired
    private StudentGraduateController sc;
    @Autowired
    private Web3j web3j;

    private RestTemplate restTemplate = new RestTemplate();

    private String url1 = "http://localhost:8432/studentGraduate?studentNum=2018302020004";

    private String url2 = "http://localhost:8432/studentGraduate/student";
    private Object EthGetBalance;


    @Test
    void find(){
//        String str = restTemplate.getForObject(url1, String.class);
//        System.out.println(str);
//        BaseResult a = sc.findStudentGraduate("本科","2018302020004","2018");
//        System.out.println(a.getData());
    }
    @Test
    public void getClientVersion() throws Exception {


       Credentials credentials = Credentials.create("000658eadfc028f908e8cf9457304763227afec9c4cc3643c1e8da1a54cedae3");
       String contractAddress = "0xda4dD7CFaBE1F6EdAe3e158Fb4Df6d7BD4C3087C";
        Graduate contract = Graduate.load(
                contractAddress, web3j, credentials,
                GAS_PRICE,new BigInteger("3000000"));
        System.out.println(contract.cers(1).send().get(1));





    }


    @Test
    void contextLoads() {
        RSA rsa = new RSA();
//        RSA rsa1 = new RSA();

        //获得私钥
//        rsa.getPrivateKey();
//        rsa.getPrivateKeyBase64();
        //获得公钥
//        rsa.getPublicKey();
//        rsa.getPublicKeyBase64();

        //公钥加密，私钥解密
        byte[] encrypt = rsa.encrypt(StrUtil.bytes("我是一段测试aaaa", CharsetUtil.CHARSET_UTF_8), KeyType.PublicKey);
        byte[] decrypt = rsa.decrypt(encrypt, KeyType.PrivateKey);
//        byte[] decrypt = rsa1.decrypt(encrypt, KeyType.PrivateKey);

        //Junit单元测试
        Assert.assertEquals("我是一段测试aaaa", StrUtil.str(decrypt, CharsetUtil.CHARSET_UTF_8));

        //私钥加密，公钥解密
//        byte[] encrypt2 = rsa.encrypt(StrUtil.bytes("我是一段测试aaaa", CharsetUtil.CHARSET_UTF_8), KeyType.PrivateKey);
//        byte[] decrypt2 = rsa.decrypt(encrypt2, KeyType.PublicKey);

        //Junit单元测试
        //Assert.assertEquals("我是一段测试aaaa", StrUtil.str(decrypt2, CharsetUtil.CHARSET_UTF_8));
    }

//    @Test
//    void addRecord() {
//        int n = 100;
//        for (int i = 0; i < n; i++) {
//            StudentGraduate graduateInfo = new StudentGraduate();
//            graduateInfo.setEducation("本科");
//            graduateInfo.setAdmission("2015");
//            graduateInfo.setGraduate("2019");
//            graduateInfo.setGender("女");
//            graduateInfo.setIdentityNum("420111111111111111");
//            graduateInfo.setMajor("软件工程");
//            graduateInfo.setPoliticalStatus("共青团员");
//            graduateInfo.setStudentName("张三三");
//            graduateInfo.setStudentNum("2015000000000");
//            graduateInfo.setStudyForm("全日制");
//            graduateInfo.setUniversity("家里蹲大学");
//            graduateInfo.setSchool("家里蹲学院");
//            BaseResult returnDTO = restTemplate.postForObject(url1, graduateInfo, BaseResult.class);
//            StudentSignDTO studentSignDTO = new StudentSignDTO();
//            if (returnDTO.getData() != null) {
//                int id = (int)((LinkedHashMap)returnDTO.getData()).get("id");
//                studentSignDTO.setGradateInfoId(id);
//                studentSignDTO.setIdentityNum(graduateInfo.getIdentityNum());
//                restTemplate.postForObject(url2, studentSignDTO, BaseResult.class);
//            }
//        }
//    }



}
