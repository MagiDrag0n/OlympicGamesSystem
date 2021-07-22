package com.magidragon.dao;

import com.magidragon.pojo.information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface informationMapper {
    //增 成员信息
    int addInformation(information information);

    //删 成员信息
    int deleteInformationById(@Param("id") int id);

    //改 成员信息
    int updateInformation(information information);

    //查 特定成员信息
    information queryInformationById(@Param("id") int id);

    //查 全部成员信息
    List<information> queryAllInformation();

}
