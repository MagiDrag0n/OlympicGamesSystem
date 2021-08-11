package com.magidragon.service;

import com.magidragon.pojo.information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface informationService {
    //增 成员信息
    int addInformation(@Param("name")String name,
                       @Param("sex")String sex,
                       @Param("password")String password,
                       @Param("email")String email,
                       @Param("phone")String phone,
                       @Param("major")String major,
                       @Param("privilege")int privilege);

    //删 成员信息
    int deleteInformationById(int id);

    //改 成员信息
    int updateInformation(@Param("id")int id, @Param("privilege")int privilege);

    //查 特定成员信息
    information queryInformationById(int id);

    //查 全部成员信息
    List<information> queryAllInformation();

}
