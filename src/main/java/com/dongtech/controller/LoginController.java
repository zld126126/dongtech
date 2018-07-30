package com.dongtech.controller;

import com.dongtech.bean.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    //http://localhost:8080/login?username=dongbao&password=123456&rememberMe=false
    @RequestMapping(value="/login")
    public String login(String username, String password,String vcode,Boolean rememberMe){
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);

        return "index/index";
    }
    //http://localhost:8080/index 如果没有token信息则显示403如果有则显示home
    @RequestMapping(value="/index")
    public String index(){
        Subject subject = SecurityUtils.getSubject();
        User principal = (User)subject.getPrincipal();
        if(null==principal){
            return "login";
        }else{
            return "index/index";
        }
    }

}
