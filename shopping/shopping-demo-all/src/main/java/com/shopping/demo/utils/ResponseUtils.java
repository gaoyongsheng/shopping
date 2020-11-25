package com.shopping.demo.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date
 */
public class ResponseUtils {

    public static JSONObject success(Object data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","0");
        jsonObject.put("msg","OK");
        if(null == data){
            jsonObject.put("data","");
        } else {
            jsonObject.put("data",data);
        }
        return jsonObject;
    }

    public static JSONObject failure(String code, String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        jsonObject.put("data","");
        return jsonObject;
    }


}
