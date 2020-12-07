package com.shopping.demo.controller;

import com.shopping.demo.cro.GoodsCro;
import com.shopping.demo.exception.MyShopException;
import com.shopping.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ldc
 * @Date 2020/12/7 16:35
 * @Version 1.0
 */

@RestController
@RequestMapping("/service/v1")
public class GoodsController extends AbstractBaseCtrl {

    @Autowired
    GoodsService goodsService;

    @PostMapping("/goods.addone")
    public Object addOne(@RequestBody GoodsCro goodsCro){
        goodsService.addOneGoods(goodsCro);
        return success("");
    }

    @GetMapping("/goods.findById/{id}")
    public Object findGoodsById(@PathVariable("id") Long id){
        try{
            return success(goodsService.findGoodsById(id));
        } catch (MyShopException ex){
            return failure(ex.getErrorCode(),ex.getMessage());
        }
    }

}
