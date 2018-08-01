package com.dongtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 菜单控制
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping("/profiledocument")
    public String profiledocument(){
        return "menu/profiledocument";
    }

    @RequestMapping("/indexdocument")
    public String indexdocument(){
        return "menu/indexdocument";
    }

    @RequestMapping("/index")
    public String index(){
        return "menu/index";
    }

    @RequestMapping("/error-404")
    public String error404(){
        return "menu/error-404";
    }

    @RequestMapping("/error-500")
    public String error500(){
        return "menu/error-500";
    }


}
