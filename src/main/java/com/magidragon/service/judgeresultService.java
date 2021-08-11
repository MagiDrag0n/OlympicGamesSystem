package com.magidragon.service;

import com.magidragon.pojo.judgeresult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface judgeresultService {
    //查 全部裁判结果
    List<judgeresult> queryAllJudgeresult();

    //查 特定裁判结果
    List<judgeresult> queryJudgeresultById(int playerID);

    //增 裁判结果
    int addJudgeresult(int gameID,
                       int playerID,
                       String result,
                       int judgeID,
                       String judge_comment);

    //删 裁判结果
    int deleteJudgeresultById(int gameID, int playerID);

    //改 裁判结果
    int updateJudgeresultById(judgeresult judgeresult);
}
