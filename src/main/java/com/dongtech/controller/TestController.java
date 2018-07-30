package com.dongtech.controller;

import com.dongtech.bean.User;
import com.dongtech.mapper.UserMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
@EnableAutoConfiguration
public class TestController {
    @Resource
    private UserMapper userMapper;
    @RequestMapping("/test")
    public String test1(){
        return "hello,test";
    }
    @RequestMapping("/findUser")
    User findUser(@RequestParam String id){
        return userMapper.findUserById(id);
    }
}
