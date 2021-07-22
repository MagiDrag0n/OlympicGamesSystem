package com.magidragon.dao;

import com.magidragon.pojo.userLogin;
import org.apache.ibatis.annotations.Param;

public interface userLoginMapper {
    public userLogin userLogin(@Param("email")String email,@Param("password")String password);
}
