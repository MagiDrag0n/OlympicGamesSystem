package com.magidragon.dao;

import com.magidragon.pojo.judgeresult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface judgeresultMapper {
    //查 全部裁判结果
    List<judgeresult> queryAllJudgeresult();

    //查 特定裁判结果
    List<judgeresult> queryJudgeresultById(@Param("playerID") int playerID);

    //增 裁判结果
    int addJudgeresult(@Param("gameID")int gameID,
                       @Param("playerID")int playerID,
                       @Param("result")String result,
                       @Param("judgeID")int judgeID,
                       @Param("judge_comment")String judge_comment);

    //删 裁判结果
    int deleteJudgeresultById(@Param("gameID")int gameID, @Param("playerID") int playerID);

    //改 裁判结果
    int updateJudgeresultById(judgeresult judgeresult);
}
