package com.magidragon.dao;

import com.magidragon.pojo.gameresults;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gameresultsMapper {
    //查 全部比赛结果
    List<gameresults> queryAllgameresults();

    //增 比赛结果
    int addGameresults(gameresults gameresults);

    //删 比赛结果
    int deleteGameresultsById(@Param("gameID") int gameID);

    //改 比赛结果
    int updateGameresults(gameresults gameresults);

}
