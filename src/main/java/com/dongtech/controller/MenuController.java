package com.dongtech.controller;

import com.dongtech.bean.UserInfo;
import com.dongtech.mapper.UserInfoMapper;
import com.dongtech.mapper.UserRoleMapper;
import com.dongtech.util.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 菜单控制
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;
    /**
     * 权限管理
     * @return
     */
    @RequestMapping("/permissiondocument")
    public String permissiondocument(){
        return "menu/permissiondocument";
    }

    /**
     * 角色管理
     * @return
     */
    @RequestMapping("/roledocument")
    public String roledocument(){
        return "menu/roledocument";
    }

    /**
     * 用户管理
     * @return
     */
    @RequestMapping("/userdocument")
    public String userdocument(Model model){
        List<UserInfo> userInfos = userInfoMapper.selectAllUser();
        model.addAttribute("userInfos",userInfos);
        return "menu/userdocument";
    }

    /**
     * 用户编辑
     * @return
     */
    @RequestMapping("/edituserinfo")
    public String edituserinfo(Model model, String userid){
        //判断是不是数字
        boolean isInt = StringUtil.isInteger(userid);
        if(isInt){
            int id = StringUtil.StringToInteger(userid);
            System.out.println(id);
            //userid="1";
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
            if(null==userInfo){
                return "menu/index";
            }else{
                model.addAttribute("userInfo",userInfo);
                return "menu/edituserinfo";
            }
        }else{
            return "menu/index";
        }
    }

    /**
     * 用户添加
     * @return
     */
    @RequestMapping("/adduserinfo")
    public String adduserinfo(Model model){
        return "menu/adduserinfo";
    }

    /**
     * 用户信息
     * @return
     */
    @RequestMapping("/profiledocument")
    public String profiledocument(Model model){
        Subject subject = SecurityUtils.getSubject();
        UserInfo login = (UserInfo)subject.getPrincipal();
        if(null==login){
            return "menu/index";
        }else{
            System.out.println("当前登陆用户:"+login);
            String username = login.getUsername();
            //根据用户名查询信息
            Map<String, Object> userprofile = userRoleMapper.selectUserProfileByUserName(username);
            //model.addAttribute("userprofile",userprofile);
            String name = StringUtil.NullToString((String) userprofile.get("username"));
            String useraddress = StringUtil.NullToString((String) userprofile.get("useraddress"));
            String age = StringUtil.NullToString((String) userprofile.get("age"));
            String worktime = StringUtil.NullToString((String) userprofile.get("worktime"));
            String aboutuser = StringUtil.NullToString((String) userprofile.get("aboutuser"));
            Map<String,Object> newMap = new HashMap<>();
            newMap.put("name",name);
            newMap.put("useraddress",useraddress);
            newMap.put("age",age);
            newMap.put("worktime",worktime);
            newMap.put("aboutuser",aboutuser);
            model.addAttribute("userprofile",newMap);
            System.out.println("当前用户信息:"+newMap);
            return "menu/profiledocument";
        }

    }

    /**
     * 登录后主页
     * @return
     */
    @RequestMapping("/indexdocument")
    public String indexdocument(){
        return "menu/indexdocument";
    }

    /**
     * 控制台
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "menu/index";
    }

    /**
     * 404
     * @return
     */
    @RequestMapping("/error-404")
    public String error404(){
        return "menu/error-404";
    }

    /**
     * 500
     * @return
     */
    @RequestMapping("/error-500")
    public String error500(){
        return "menu/error-500";
    }


}
