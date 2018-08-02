package com.dongtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 菜单控制
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

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
    public String userdocument(){
        return "menu/userdocument";
    }

    /**
     * 用户信息
     * @return
     */
    @RequestMapping("/profiledocument")
    public String profiledocument(){
        return "menu/profiledocument";
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
