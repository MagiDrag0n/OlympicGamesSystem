package com.magidragon.controller;

import com.magidragon.pojo.gamedays;
import com.magidragon.service.gamedaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class gamedaysController {
    @Autowired
    private gamedaysService gamedaysService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("queryAllGamedays")
    public List<gamedays> gamedays(@RequestParam int id){
        return gamedaysService.queryAllGamedays(id);
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/addGamedays")
    public Integer addGamedays(@RequestParam("gameID")int gameID, @RequestParam("players")int players[]){
        for(int i = 0; i < players.length; i++){
            gamedaysService.addGamedays(gameID, players[i]);
        }
        return null;
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/queryAllMatch")
    public List<gamedays> queryAllMatch(){
        return gamedaysService.queryAllMatch();
    }
}
