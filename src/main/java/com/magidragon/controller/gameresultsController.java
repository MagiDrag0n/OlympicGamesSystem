package com.magidragon.controller;

import com.magidragon.pojo.gameresults;
import com.magidragon.service.gameresultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class gameresultsController {
    @Autowired
    private gameresultsService gameresultsService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("queryAllGameresults")
    public List<gameresults> gameresults(){
        return gameresultsService.queryAllgameresults();
    }
}
