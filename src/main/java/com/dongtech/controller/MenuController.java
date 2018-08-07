package com.dongtech.controller;

import com.dongtech.bean.PermissionInfo;
import com.dongtech.bean.UserInfo;
import com.dongtech.bean.UserRole;
import com.dongtech.mapper.PermissionInfoMapper;
import com.dongtech.mapper.UserInfoMapper;
import com.dongtech.mapper.UserRoleMapper;
import com.dongtech.util.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.relation.Role;
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

    @Autowired
    private PermissionInfoMapper permissionInfoMapper;

    @RequestMapping("/adduserrole")
    public String adduserrole(Model model){
        //查询所有用户信息
        List<UserInfo> userInfos = userInfoMapper.selectAllUser();
        model.addAttribute("userInfos",userInfos);
        //查询权限信息
        List<PermissionInfo> permissionInfos = permissionInfoMapper.selectAllPermission();
        model.addAttribute("permissionInfos",permissionInfos);
        return "menu/adduserrole";
    }

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
    public String roledocument(Model model){
        List<Map<String,Object>> userRoles = userRoleMapper.selectAllRole();
        model.addAttribute("userRoles",userRoles);
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


    @RequestMapping("/edituserprofile")
    public String edituserprofile(Model model){
        Subject subject = SecurityUtils.getSubject();
        UserInfo login = (UserInfo)subject.getPrincipal();
        if(null==login){
            return "menu/index";
        }else {
            System.out.println("当前登陆用户:"+login);
            String username = login.getUsername();
            //根据用户名查询信息
            Map<String, Object> userprofile = userRoleMapper.selectUserProfileByUserName(username);
            //model.addAttribute("userprofile",userprofile);
            Integer id = (Integer) userprofile.get("id")==null?-1:(Integer) userprofile.get("id");
            String name = (String) userprofile.get("username")==null?"没有数据":(String) userprofile.get("username");
            String useraddress = (String) userprofile.get("useraddress")==null?"没有数据":(String) userprofile.get("useraddress");
            Integer age = (Integer) userprofile.get("age")==null?-1:(Integer) userprofile.get("age");
            String worktime = (String) userprofile.get("worktime")==null?"没有数据":(String) userprofile.get("worktime");
            String aboutuser = (String) userprofile.get("aboutuser")==null?"没有数据":(String) userprofile.get("aboutuser");
            Map<String,Object> newMap = new HashMap<>();
            newMap.put("id",id);
            newMap.put("username",name);
            newMap.put("useraddress",useraddress);
            newMap.put("age",age);
            newMap.put("worktime",worktime);
            newMap.put("aboutuser",aboutuser);
            model.addAttribute("userprofile",newMap);
            System.out.println("当前用户信息:"+newMap);
            return "menu/edituserprofile";
        }
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
            Integer id = (Integer) userprofile.get("id")==null?-1:(Integer) userprofile.get("id");
            String name = (String) userprofile.get("username")==null?"没有数据":(String) userprofile.get("username");
            String useraddress = (String) userprofile.get("useraddress")==null?"没有数据":(String) userprofile.get("useraddress");
            Integer age = (Integer) userprofile.get("age")==null?-1:(Integer) userprofile.get("age");
            String worktime = (String) userprofile.get("worktime")==null?"没有数据":(String) userprofile.get("worktime");
            String aboutuser = (String) userprofile.get("aboutuser")==null?"没有数据":(String) userprofile.get("aboutuser");
            Map<String,Object> newMap = new HashMap<>();
            newMap.put("id",id);
            newMap.put("username",name);
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

    @RequestMapping("/edituserrole")
    public String edituserrole(Model model, String roleid){
        if(StringUtil.isNotEmpty(roleid)){
            Integer id = StringUtil.StringToInteger(roleid);
            Map<String,Object> userRole = userRoleMapper.selectRoleByRoleid(id);
            if(null==userRole){
                return "menu/roledocument";
            }else{
                model.addAttribute("userRole",userRole);
                //查询权限信息
                List<PermissionInfo> permissionInfos = permissionInfoMapper.selectAllPermission();
                if(null==permissionInfos){
                    return "menu/roledocument";
                }else{
                    model.addAttribute("permissionInfos",permissionInfos);
                    return "menu/edituserrole";
                }
            }
        }else {
            return "menu/roledocument";
        }
    }
}
