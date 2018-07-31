package com.dongtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 菜单控制
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping("/index")
    public String index(){
        return "menu/index";
    }

    @RequestMapping("/typography")
    public String typography(){
        return "menu/typography";
    }

    @RequestMapping("/calendar")
    public String calendar(){
        return "menu/calendar";
    }

    @RequestMapping("/dropzone")
    public String dropzone(){
        return "menu/dropzone";
    }

    @RequestMapping("/elements")
    public String elements(){
        return "menu/elements";
    }

    @RequestMapping("/faq")
    public String faq(){
        return "menu/faq";
    }

    @RequestMapping("/form-elements")
    public String formElements(){
        return "menu/form-elements";
    }

    @RequestMapping("/form-wizard")
    public String formWizard(){
        return "menu/form-wizard";
    }

    @RequestMapping("/gallery")
    public String gallery(){
        return "menu/gallery";
    }

    @RequestMapping("/grid")
    public String grid(){
        return "menu/grid";
    }

    @RequestMapping("/inbox")
    public String inbox(){
        return "menu/inbox";
    }

    @RequestMapping("/invoice")
    public String invoice(){
        return "menu/invoice";
    }

    @RequestMapping("/jqgrid")
    public String jqgrid(){
        return "menu/jqgrid";
    }

    @RequestMapping("/jquery-ui")
    public String jqueryUi(){
        return "menu/jquery-ui";
    }

    @RequestMapping("/nestable-list")
    public String nestableList(){
        return "menu/nestable-list";
    }

    @RequestMapping("/pricing")
    public String pricing(){
        return "menu/pricing";
    }

    @RequestMapping("/profile")
    public String profile(){
        return "menu/profile";
    }

    @RequestMapping("/tables")
    public String tables(){
        return "menu/tables";
    }

    @RequestMapping("/timeline")
    public String timeline(){
        return "menu/timeline";
    }

    @RequestMapping("/treeview")
    public String treeview(){
        return "menu/treeview";
    }

    @RequestMapping("/widgets")
    public String widgets(){
        return "menu/widgets";
    }

    @RequestMapping("/wysiwyg")
    public String wysiwyg(){
        return "menu/wysiwyg";
    }

    @RequestMapping("/error-404")
    public String error404(){
        return "menu/error-404";
    }

    @RequestMapping("/error-500")
    public String error500(){
        return "menu/error-500";
    }

    @RequestMapping("/blank")
    public String blank(){
        return "menu/blank";
    }

}
