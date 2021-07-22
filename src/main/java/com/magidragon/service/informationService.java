package com.magidragon.service;

import com.magidragon.pojo.information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface informationService {
    //增 成员信息
    int addInformation(information information);

    //删 成员信息
    int deleteInformationById(int id);

    //改 成员信息
    int updateInformation(information information);

    //查 特定成员信息
    information queryInformationById(int id);

    //查 全部成员信息
    List<information> queryAllInformation();

}
