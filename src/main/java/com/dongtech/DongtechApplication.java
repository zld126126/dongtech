package com.dongtech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.dongtech.mapper")	//这里mapper是你的mybatis的mapper目录。
@SpringBootApplication
public class DongtechApplication{

    public static void main(String[] args) {
        SpringApplication.run(DongtechApplication.class, args);
        runOk();

    }
    public static void runOk(){
        System.out.println("////////////////////////////////////////////////////////////////////\n" +
                "//              -------     ----   --   --    -----               //\n" +
                "//              |   _  \\   / __ \\  | \\   |   /   ___              //\n" +
                "//              |  |_|  | | |__| | |  \\  |  |     |               //\n" +
                "//              |      /   \\    /  |   \\ |   \\    |               //\n" +
                "//              -------     ----   -    --    -----               //\n" +
                "//                          启动成功                                //\n" +
                "////////////////////////////////////////////////////////////////////");
    }
}
