package com.magidragon.controller;

import com.magidragon.pojo.information;
import com.magidragon.service.informationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/information")
public class informationController {
    //Controller 调用 Service
    @Autowired
    private informationService informationService;

    @RequestMapping("/allInformation")
    public String list(Model model){
        List<information> information = informationService.queryAllInformation();
        model.addAttribute("information",information);
        return "allInformation";
    }




    //informationService,informationServiceImpl
    //调整业务逻辑
}
