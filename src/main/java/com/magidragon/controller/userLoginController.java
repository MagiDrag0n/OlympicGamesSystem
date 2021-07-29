package com.magidragon.controller;

import com.magidragon.pojo.information;
import com.magidragon.pojo.userLogin;
import com.magidragon.service.userLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/user")
@CrossOrigin
public class userLoginController {
    @Autowired
    private userLoginService userLoginService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public List<userLogin> userLogin(String email, String password){
        return (List<userLogin>) userLoginService.userLogin(email, password);
    }

//    @Autowired
//    private userLoginService userLoginService;
//
//    @RequestMapping(value = "/login.html",method = RequestMethod.GET)
//    public String userLogin(){
//        return "login";
//    }
//
//    @RequestMapping(value = "/login.html",method = RequestMethod.POST)
//    public String userLogin(@RequestParam String email, @RequestParam String password, HttpServletRequest request, HttpSession session){
//        userLogin userLogin = userLoginService.userLogin(email, password);
//        if(userLogin != null){
//            session.setAttribute("user",userLogin);
//            return "redirect:index.html";
////            model.addAttribute("msg","Login Success.");
//        } else {
//            request.setAttribute("msg","用户名或密码错误！");
//            return "login";
////            model.addAttribute("msg","Login Failed.");
//        }
//    }
//    @RequestMapping("userLogOut.html")
//    public String userLogOut(HttpServletRequest request, HttpSession session){
//        session.removeAttribute("user");
//        request.setAttribute("msg","用户已退出登录！");
//        return "login";
//    }
}
