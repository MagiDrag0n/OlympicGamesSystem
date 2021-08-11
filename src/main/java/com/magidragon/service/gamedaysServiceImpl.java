package com.magidragon.service;

import com.magidragon.dao.gamedaysMapper;
import com.magidragon.pojo.gamedays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gamedaysServiceImpl implements gamedaysService{
    @Autowired
    private gamedaysMapper gamedaysMapper;

    public void setGamedaysMapper(com.magidragon.dao.gamedaysMapper gamedaysMapper) {
        this.gamedaysMapper = gamedaysMapper;
    }

    @Override
    public List<gamedays> queryAllGamedays(int id) {
        return gamedaysMapper.queryAllGamedays(id);
    }

    @Override
    public List<gamedays> queryAllMatch() {
        return gamedaysMapper.queryAllMatch();
    }

    @Override
    public int addGamedays(int gameID, int player) {
        return gamedaysMapper.addGamedays(gameID, player);
    }

    @Override
    public int deleteGamedaysById(int id, int gameID) {
        return gamedaysMapper.deleteGamedaysById(id,gameID);
    }

    @Override
    public int updateGamedays(gamedays gamedays) {
        return gamedaysMapper.updateGamedays(gamedays);
    }
}
