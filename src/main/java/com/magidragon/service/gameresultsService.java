package com.magidragon.service;

import com.magidragon.pojo.gameresults;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gameresultsService {
    //查 全部比赛结果
    List<gameresults> queryAllgameresults();

    //增 比赛结果
    int addGameresults(gameresults gameresults);

    //删 比赛结果
    int deleteGameresultsById(int gameID);

    //改 比赛结果
    int updateGameresults(gameresults gameresults);
}
