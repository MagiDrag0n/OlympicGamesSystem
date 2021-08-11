package com.magidragon.service;

import com.magidragon.pojo.information;
import com.magidragon.dao.informationMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class informationServiceImpl implements informationService{
    //Service 调用 Dao  ;  组合Dao
    @Autowired
    private informationMapper informationMapper;
    public void setInformationMapper(informationMapper informationMapper) {
        this.informationMapper = informationMapper;
    }

    @Override
    public int addInformation(String name,
                              String sex,
                              String password,
                              String email,
                              String phone,
                              String major,
                              int privilege) {
        return informationMapper.addInformation(name, sex, password, email, phone, major, privilege);
    }

    @Override
    public int deleteInformationById(int id) {
        return informationMapper.deleteInformationById(id);
    }

    @Override
    public int updateInformation(int id, int privilege) {
        return informationMapper.updateInformation(id, privilege);
    }

    @Override
    public information queryInformationById(int id) {
        return informationMapper.queryInformationById(id);
    }

    @Override
    public List<information> queryAllInformation() {
        return informationMapper.queryAllInformation();
    }
}
