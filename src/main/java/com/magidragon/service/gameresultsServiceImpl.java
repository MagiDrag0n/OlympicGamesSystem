package com.magidragon.service;

import com.magidragon.dao.gameresultsMapper;
import com.magidragon.pojo.gameresults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gameresultsServiceImpl implements gameresultsService{
    @Autowired
    private gameresultsMapper gameresultsMapper;

    public void setGameresultsMapper(gameresultsMapper gameresultsMapper) {
        this.gameresultsMapper = gameresultsMapper;
    }

    @Override
    public List<gameresults> queryAllgameresults() {
        return gameresultsMapper.queryAllgameresults();
    }

    @Override
    public int addGameresults(gameresults gameresults) {
        return gameresultsMapper.addGameresults(gameresults);
    }

    @Override
    public int deleteGameresultsById(int gameID) {
        return gameresultsMapper.deleteGameresultsById(gameID);
    }

    @Override
    public int updateGameresults(gameresults gameresults) {
        return gameresultsMapper.updateGameresults(gameresults);
    }
}
