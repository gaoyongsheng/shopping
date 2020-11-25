package com.shopping.demo.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class AbstractBaseImpl {


    /**
     * 获取pageAble
     * @Param page 页码，当前第几页
     * */
    public Pageable getPageable(int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        return pageable;
    }



}
