package com.magidragon.controller;

import com.magidragon.pojo.gameinfo;
import com.magidragon.service.gameinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class gameinfoController {
    @Autowired
    private gameinfoService gameinfoService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/queryAllGameinfo")
    public List<gameinfo> gameinfo(){
        return gameinfoService.queryAllGameinfo();
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/addGameinfo")
    public Integer addGameinfo(@RequestParam("gameID")int gameID,
                               @RequestParam("gameName")String gameName,
                               @RequestParam("gameTime")String gameTime,
                               @RequestParam("isFinal")String isFinal){
        return gameinfoService.addGameinfo(gameID,gameName,gameTime,isFinal); }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/deleteGameById")
    public Integer deleteGameById(@RequestParam("gameID")int gameID){
        return gameinfoService.deleteGameinfoById(gameID);
    }
}
