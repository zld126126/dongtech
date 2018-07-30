package com.dongtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @RequestMapping("/register")
    public String register(String username, String password,String repassword){
        System.out.println(username+":"+password+":"+repassword);
        if(password==repassword){
            return "注册成功";
        }else{
            return "注册失败,请重新注册";
        }
    }
}
