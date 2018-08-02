package com.dongtech.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtech.bean.UserInfo;
import com.dongtech.mapper.UserInfoMapper;
import com.dongtech.util.DateUtil;
import com.dongtech.util.UUIDUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 注册控制
 */
@Controller
public class RegisterController {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 注册用户
     * @param username
     * @param password
     * @param repassword
     * @return
     */
    @ResponseBody
    @RequestMapping("/register")
    public String register(String username, String password,String repassword,String email){
        //后台判断逻辑

        //用户名和密码校验
        if (null==username||""==username||null==password||""==password||null==repassword||""==repassword||null==email||""==email){
            JSONObject js = new JSONObject();
            js.put("status","1");
            js.put("data","null");
            js.put("msg","注册信息不全,请重新填写");
            System.out.println(js);
            return js.toString();
        }else{
            //两次密码一致
            if(password.equals(repassword)){
                Map<String,Object>map = new HashMap<>();
                map.put("username",username);
                //查询数据库
                UserInfo user = userInfoMapper.selectByUsername(map);
                //如果存在则返回用户名已存在,请重新输入用户名
                if (null==user){
                    //不存在插入一条用户
                    UserInfo userInfo = new UserInfo();
                    userInfo.setId(UUIDUtil.getUUID());
                    userInfo.setEmail(email);
                    userInfo.setUsername(username);
                    userInfo.setPassword(password);
                    userInfo.setWorkstatus("1");
                    userInfo.setWorktime(DateUtil.getnyr());
                    int insert = userInfoMapper.insert(userInfo);
                    if(insert==1){
                        //插入成功
                        JSONObject js = new JSONObject();
                        js.put("status","0");
                        js.put("data","null");
                        js.put("msg","注册成功");
                        System.out.println(js);
                        return js.toString();
                    }else{
                        //插入成功
                        JSONObject js = new JSONObject();
                        js.put("status","1");
                        js.put("data","null");
                        js.put("msg","注册失败,请稍后重试");
                        System.out.println(js);
                        return js.toString();
                    }
                }else{
                    JSONObject js = new JSONObject();
                    js.put("status","1");
                    js.put("data","null");
                    js.put("msg","用户名已存在,请重新输入");
                    System.out.println(js);
                    return js.toString();
                }
            }else{
                JSONObject js = new JSONObject();
                js.put("status","1");
                js.put("data","null");
                js.put("msg","两次密码不一致,请重新输入");
                System.out.println(js);
                return js.toString();
            }
        }
    }
}
