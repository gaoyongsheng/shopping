package com.shopping.demo.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class AbstractBaseImpl {
    
    /**
     * @Author ldc
     * @Description //TODO 
     * @Date 16:58 2020/12/7
     * @Param [str]
     * @return java.lang.Long
     */
    public Long strToLong(String str){return Long.parseLong(str);}

    /**
     * 获取pageAble
     * @Param page 页码，当前第几页
     * */
    public Pageable getPageable(int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        return pageable;
    }



}
