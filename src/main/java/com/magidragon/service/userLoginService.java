package com.magidragon.service;

import com.magidragon.pojo.userLogin;
import org.apache.ibatis.annotations.Param;

public interface userLoginService {
    public userLogin userLogin(String email, String password);
}
