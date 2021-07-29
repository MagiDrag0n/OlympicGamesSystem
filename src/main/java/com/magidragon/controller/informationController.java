package com.magidragon.controller;

import com.magidragon.dao.informationMapper;
import com.magidragon.pojo.information;
import com.magidragon.service.informationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/information")

public class informationController {
    //Controller 调用 Service
    @Autowired
    private informationService informationService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/allInformation")
    public List<information> information(){
        return informationService.queryAllInformation();
    }

    @RequestMapping("/addInformation")
    @ResponseBody
    //Integer -> 返回操作条数
    public Integer addInformation(information information){
        return informationService.addInformation(information);
    }

    @RequestMapping("deleteInformationById")
    @ResponseBody
    public Integer deleteInformationById(int id){
        return informationService.deleteInformationById(id);

    }

    @RequestMapping("updateInformation")
    @ResponseBody
    public Integer updateInformation(information information){
        //information 内的userId是否正确传递？
        return informationService.updateInformation(information);
    }

//    @Autowired
//    private informationService informationService;
////    private informationMapper dao;
//
//    @RequestMapping("/allInformation")
//    public String list(Model model){
//        List<information> information = informationService.queryAllInformation();
//        model.addAttribute("information",information);
//        return "allInformation";
//    }

//    @GetMapping("/allInformation")
//    public List<information> queryAllInformation(){
//        return dao.queryAllInformation();
//    }




    //informationService,informationServiceImpl
    //调整业务逻辑
}
