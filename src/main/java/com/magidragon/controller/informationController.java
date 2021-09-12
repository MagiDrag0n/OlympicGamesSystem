package com.magidragon.controller;

import com.magidragon.dao.informationMapper;
import com.magidragon.pojo.information;
import com.magidragon.service.informationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
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

    @CrossOrigin
    @RequestMapping("/addInformation")
    @ResponseBody
    //Integer -> 返回操作条数
    public Integer addInformation(@RequestParam("name")String name,
                                  @RequestParam("sex")String sex,
                                  @RequestParam("password")String password,
                                  @RequestParam("email")String email,
                                  @RequestParam("phone")String phone,
                                  @RequestParam("major")String major,
                                  @RequestParam("privilege")int privilege){
        System.out.println(name+password+email+phone+major+privilege);
        return informationService.addInformation(name, sex, password, email, phone, major, privilege);
    }

    @RequestMapping("/deleteInformationById")
    @ResponseBody
    public Integer deleteInformationById(int id){
        return informationService.deleteInformationById(id);

    }

    //本来想设计成更新全部信息的，想想没必要，只更改为调整权限等级
    @RequestMapping("/updateInformation")
    @ResponseBody
    public Integer updateInformation(@RequestParam("id")int id,
                                     @RequestParam("privilege")int privilege){
        //information 内的userId是否正确传递？
        return informationService.updateInformation(id,privilege);
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
