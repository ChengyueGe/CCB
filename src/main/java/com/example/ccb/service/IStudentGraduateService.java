package com.example.ccb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.ccb.contract.Graduate;
import com.example.ccb.entity.StudentGraduate;

import java.math.BigInteger;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chen
 * @since 2021-06-01
 */
public interface IStudentGraduateService extends IService<StudentGraduate> {

    StudentGraduate getValidGraduateInfo(String certificateNum, String university, String identityNum) throws Exception;

    boolean canGraduate(StudentGraduate studentGraduate,String pk) throws Exception;

    BigInteger addtoChain(String data, String graduate_id, String pk) throws Exception;

    Graduate loadContract(String pk);


}
