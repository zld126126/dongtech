package com.dongtech.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtech.bean.User;
import com.dongtech.bean.UserInfo;
import com.dongtech.mapper.UserInfoMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 登陆控制
 */
@Controller
public class LoginController {
    @Autowired
    private UserInfoMapper userInfoMapper;
    //http://localhost:8080/logincheck?username=dongbao&password=123456&rememberMe=false
    @RequestMapping(value="/logincheck")
    @ResponseBody
    public String login(String username, String password,String vcode,String remember){
        //后台判断逻辑

        //记住密码
        boolean rememberMe = false;
        if("1".equals(remember)){
            rememberMe = true;
        }

        //用户名和密码校验
        if (null==username||""==username||null==password||""==password){
            JSONObject js = new JSONObject();
            js.put("status","1");
            js.put("data","null");
            js.put("msg","用户名或密码不正确,请稍后重试");
            System.out.println(js);
            return js.toString();
        }else{
            //准备参数
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("username",username);
            map.put("password",password);
            //查询数据库
            UserInfo userInfo = userInfoMapper.selectByUsernameAndPassword(map);
            if (null==userInfo){
                JSONObject js = new JSONObject();
                js.put("status","1");
                js.put("data","null");
                js.put("msg","用户名或密码不正确,请稍后重试");
                System.out.println(js);
                return js.toString();
            }else{
                UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
                SecurityUtils.getSubject().login(token);

                JSONObject js = new JSONObject();
                js.put("status","0");
                js.put("data","null");
                js.put("msg","登陆成功");
                System.out.println(js);
                return js.toString();
            }
        }
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
