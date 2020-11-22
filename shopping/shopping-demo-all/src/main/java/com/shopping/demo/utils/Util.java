package com.shopping.demo.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @Author Gao
 * @Date 2020/11/22 16:39
 * @Version 1.0
 */
public class Util {


    public static String getReqBodyStrByHeader(HttpServletRequest request){
        StringBuffer strBuffer = new StringBuffer();
        try {
            BufferedReader bufferedReader = request.getReader();
            String str = null;
            while((str = bufferedReader.readLine()) != null){
                strBuffer.append(str.trim());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return strBuffer.toString();
    }
}
