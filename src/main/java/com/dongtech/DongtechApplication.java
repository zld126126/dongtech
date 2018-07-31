package com.dongtech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan    //扫描Servlet
@MapperScan("mapper")	//这里mapper是你的mybatis的mapper目录。
@SpringBootApplication
public class DongtechApplication{

    public static void main(String[] args) {
        System.out.println(msg());
        SpringApplication.run(DongtechApplication.class, args);
        System.out.println("" +
                "-------"     +   "\n" +
                "|   _  \\"     +   "\n" +
                "|  |_|  |"+"dongtech启动完毕"     +   "\n" +
                "|      /"     +   "\n" +
                "-------"     +   "\n");
    }

    public static String msg(){
        return("/**\n" +
                " *                             _ooOoo_\n" +
                " *                            o8888888o\n" +
                " *                            88\" . \"88\n" +
                " *                            (| -_- |)\n" +
                " *                            O\\  =  /O\n" +
                " *                         ____/`---'\\____\n" +
                " *                       .'  \\\\|     |//  `.\n" +
                " *                      /  \\\\|||  :  |||//  \\\n" +
                " *                     /  _||||| -:- |||||-  \\\n" +
                " *                     |   | \\\\\\  -  /// |   |\n" +
                " *                     | \\_|  ''\\---/''  |   |\n" +
                " *                     \\  .-\\__  `-`  ___/-. /\n" +
                " *                   ___`. .'  /--.--\\  `. . __\n" +
                " *                .\"\" '<  `.___\\_<|>_/___.'  >'\"\".\n" +
                " *               | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
                " *               \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n" +
                " *          ======`-.____`-.___\\_____/___.-`____.-'======\n" +
                " *                             `=---='\n" +
                " *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n" +
                " *                     佛祖保佑        永无BUG\n" +
                " *            佛曰:\n" +
                " *                   写字楼里写字间，写字间里程序员；\n" +
                " *                   程序人员写程序，又拿程序换酒钱。\n" +
                " *                   酒醒只在网上坐，酒醉还来网下眠；\n" +
                " *                   酒醉酒醒日复日，网上网下年复年。\n" +
                " *                   但愿老死电脑间，不愿鞠躬老板前；\n" +
                " *                   奔驰宝马贵者趣，公交自行程序员。\n" +
                " *                   别人笑我忒疯癫，我笑自己命太贱；\n" +
                " *                   不见满街漂亮妹，哪个归得程序员？\n" +
                " */");
    }
}
