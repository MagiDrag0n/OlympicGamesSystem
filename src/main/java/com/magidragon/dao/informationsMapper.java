package com.magidragon.dao;

import com.magidragon.pojo.informations;

import java.util.List;

public interface informationsMapper {
    //增 成员信息
    int addInformations(informations informations);

    //删 成员信息
    int deleteInformationsById(int id);

    //改 成员信息
    int updateInformations(informations informations);

    //查 特定成员信息
    informations queryInformationsById(int id);

    //查 全部成员信息
    List<informations> queryAllInformations();
}
