package com.magidragon.service;

import com.magidragon.pojo.information;
import com.magidragon.dao.informationMapper;
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
    public int addInformation(information information) {
        return informationMapper.addInformation(information);
    }

    @Override
    public int deleteInformationById(int id) {
        return informationMapper.deleteInformationById(id);
    }

    @Override
    public int updateInformation(information information) {
        return informationMapper.updateInformation(information);
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
