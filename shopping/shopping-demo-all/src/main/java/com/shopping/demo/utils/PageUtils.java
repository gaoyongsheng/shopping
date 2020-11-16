package com.shopping.demo.utils;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.data.domain.Page;

public class PageUtils {

    /**
     * 利用jpa查询分页结果
     * offset值为-1表示为最后一页，-2表示没有返回数据
     * */
    public static Object getData(Page page){
        JSONObject jsonObject = new JSONObject();
        try {
            if(page.getNumberOfElements() != 0){
                jsonObject.put("offset", page.isLast() ? -1 : page.nextPageable().getPageNumber());
                jsonObject.put("dataList",page.getContent());
                jsonObject.put("totalElements",page.getTotalElements());
                jsonObject.put("totalPages",page.getTotalPages());
            }else{
                jsonObject.put("offset", -2);
                jsonObject.put("dataList","");
                jsonObject.put("totalElements",0);
                jsonObject.put("totalPages",0);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }
}
