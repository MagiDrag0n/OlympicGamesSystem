package com.magidragon.service;

import com.magidragon.dao.judgeresultMapper;
import com.magidragon.pojo.judgeresult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class judgeresultServiceImpl implements judgeresultService{
    @Autowired
    private com.magidragon.dao.judgeresultMapper judgeresultMapper;

    @Override
    public List<judgeresult> queryAllJudgeresult() {
        return judgeresultMapper.queryAllJudgeresult();
    }

    @Override
    public List<judgeresult> queryJudgeresultById(int playerID) {
        return judgeresultMapper.queryJudgeresultById(playerID);
    }

    @Override
    public int addJudgeresult(int gameID,
                              int playerID,
                              String result,
                              int judgeID,
                              String judge_comment) {
        return judgeresultMapper.addJudgeresult(gameID,playerID,result,judgeID,judge_comment);
    }

    @Override
    public int deleteJudgeresultById(int gameID, int playerID) {
        return judgeresultMapper.deleteJudgeresultById(gameID,playerID);
    }

    @Override
    public int updateJudgeresultById(judgeresult judgeresult) {
        return judgeresultMapper.updateJudgeresultById(judgeresult);
    }
}
