package com.magidragon.controller;

import com.magidragon.pojo.judgeresult;
import com.magidragon.service.judgeresultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class judgeresultController {
    @Autowired
    private judgeresultService judgeresultService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/queryAllJudgeresult")
    public List<judgeresult> judgeresult(){
        return judgeresultService.queryAllJudgeresult();
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/queryJudgeresultById")
    public List<judgeresult> judgeresult(@RequestParam int id){
        return judgeresultService.queryJudgeresultById(id);
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/addJudgeresult")
    public Integer addJudgeresult(@RequestParam("gameID")int gameID,
                                  @RequestParam("playerID")int playerID,
                                  @RequestParam("result")String result,
                                  @RequestParam("judgeID")int judgeID,
                                  @RequestParam("judgeComment")String judge_comment){
        return judgeresultService.addJudgeresult(gameID,playerID,result,judgeID,judge_comment);
    }
}
