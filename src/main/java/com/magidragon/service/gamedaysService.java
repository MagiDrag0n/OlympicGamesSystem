package com.magidragon.service;

import com.magidragon.pojo.gamedays;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gamedaysService {
    //查 指定比赛信息
    List<gamedays> queryAllGamedays(int id);

    //查 全部比赛信息
    List<gamedays> queryAllMatch();

    //增 成员信息
    int addGamedays(int gameID, int player);

    //删 成员信息
    int deleteGamedaysById(int id, int gameID);

    //改 成员信息
    //本想设计 更改信息 方法为(@Param("id"）...其余参数)，但需要主要传参的问题太多，决定id在前端隐式传递
    int updateGamedays(gamedays gamedays);
}
