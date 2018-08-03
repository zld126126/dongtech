package com.dongtech.util;

import java.util.regex.Pattern;

public class StringUtil {
    /**
     * 判断是否是int
     * @param str
     * @return
     */
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    /**
     * String转换为int
     * @param str
     * @return
     */
    public static int StringToInteger(String str){
        int id = Integer.parseInt(str);
        return id;
    }

    public static String NullToString(String str){
        if(null==str){
            str="没有数据";
        }
        return str;
    }

    public static void main(String[] args) {

    }
}
