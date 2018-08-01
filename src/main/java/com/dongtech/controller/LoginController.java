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

/**
 * 登陆控制
 */
@Controller
public class LoginController {

    //http://localhost:8080/login?username=dongbao&password=123456&rememberMe=false
    @RequestMapping(value="/logincheck")
    public String login(String username, String password,String vcode,String remember){
        //后台判断逻辑
        //记住密码
        boolean rememberMe = false;
        if("0".equals(remember)){

        }else{
            rememberMe = true;
        }
        //用户名

        //密码

        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);

        return "menu/index";
    }

    @RequestMapping(value="/login")
    public String login(){
        return "/login";
    }

    //http://localhost:8080/index 如果没有token信息则显示403如果有则显示home
    @RequestMapping(value="/index")
    public String index(){
        Subject subject = SecurityUtils.getSubject();
        User principal = (User)subject.getPrincipal();
        if(null==principal){
            //如果没有登陆信息,则登陆
            return "/login";
        }else{
            //如果有登陆信息则进入主页
            return "menu/index";
        }
    }

}
