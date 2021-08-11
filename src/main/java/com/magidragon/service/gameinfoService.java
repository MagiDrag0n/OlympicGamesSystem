package com.magidragon.service;

import com.magidragon.pojo.gameinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gameinfoService {
    //查 全部比赛信息
    List<gameinfo> queryAllGameinfo();

    //增 成员信息
    int addGameinfo(int gameID,
                    String gameName,
                    String gameTime,
                    String isFinal);

    //删 成员信息
    int deleteGameinfoById(int gameID);

    //改 成员信息
    //本想设计 更改信息 方法为(@Param("id"）...其余参数)，但需要主要传参的问题太多，决定id在前端隐式传递
    int updateGameinfo(gameinfo gameinfo);
}
