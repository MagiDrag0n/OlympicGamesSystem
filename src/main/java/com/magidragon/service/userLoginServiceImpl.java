package com.magidragon.service;

import com.magidragon.dao.userLoginMapper;
import com.magidragon.pojo.userLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userLoginServiceImpl implements userLoginService{
    private userLoginMapper userLoginMapper;
    @Autowired
    public void setUserLoginMapper(userLoginMapper userLoginMapper) {
        this.userLoginMapper = userLoginMapper;
    }

    @Override
    public userLogin userLogin(String email, String password) {
        return userLoginMapper.userLogin(email, password);
    }
}
