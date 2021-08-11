package com.magidragon.service;

import com.magidragon.dao.gameinfoMapper;
import com.magidragon.pojo.gameinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class gameinfoServiceImpl implements gameinfoService{
    @Autowired
    private gameinfoMapper gameinfoMapper;

    public void setGameinfoMapper(com.magidragon.dao.gameinfoMapper gameinfoMapper) {
        this.gameinfoMapper = gameinfoMapper;
    }


    @Override
    public List<gameinfo> queryAllGameinfo() {
        return gameinfoMapper.queryAllGameinfo();
    }

    @Override
    public int addGameinfo(int gameID,
                           String gameName,
                           String gameTime,
                           String isFinal) {
        return gameinfoMapper.addGameinfo(gameID, gameName, gameTime, isFinal);
    }

    @Override
    public int deleteGameinfoById(int gameID) {
        return gameinfoMapper.deleteGameinfoById(gameID);
    }

    @Override
    public int updateGameinfo(gameinfo gameinfo) {
        return gameinfoMapper.updateGameinfo(gameinfo);
    }
}
