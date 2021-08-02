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
import javax.xml.transform.Result;
import java.util.List;


@Controller
@RequestMapping("/user")
@CrossOrigin
public class userLoginController {
    @Autowired
    private userLoginService userLoginService;

    @RequestMapping(value = "/userLogin")
    @ResponseBody
    public Object userLogin(@RequestParam String email, @RequestParam String password){
        System.out.println("User Logging with "+email+" and "+password);
        System.out.println("Return "+userLoginService.userLogin(email, password));
        return userLoginService.userLogin(email, password);
    }
    //7-30 开发随记。前端使用axios进行跨域交互，GET方法是可以正确交互的。
    // 但是使用POST方法，后端只拿到两个null。
    // axios发送的JSON{"username":"test@test.com","password":"admin"}
    // 经过查找资料得以下总结：
    // 关键： 使用@RequestBody标签接收的JSON数据，参数类型不能用String。
    // ---------------
    // @RequestParam 作用于形参列表上，RequestParam可以接收简单类型的属性，也可以接收对象类型。
    // 在前端传入的是JSON字符串，后台按字符串String参数接收再解析。
    // 请求头contentType设置为 application/x-www-form-urlencoded;charset=utf-8;后台接收请求的方法才可以用String类型。
    // ---------------
    // @RequestBody 作用于形参列表上，用于将前端发送过来固定格式的数据（XML、JSON）封装成对应的JavaBean对象。
    // 封装时使用到的一个对象是系统默认配置的HttpMessageConverter进行解析，然后分装到形参上。
    // 请求头contentType设置为 application/json，后台接收请求的方法的参数要用Map或实体类型。
    // ---------------
    // POST方法NULL结果的原因就在于，我把前端axios的contentType请求头设置成了application/json。
    // 故原用于jsp测试的List<userLogin>类型userLogin方法无法接收前端参数。

//    @Autowired
//    private userLoginService userLoginService;
//
//    @RequestMapping(value = "/login.html",method = RequestMethod.GET)
//    public String userLogin(){
//        return "login";
//    }
//
//    尝试实现登录的业务控制
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
