package com.shopping.demo.service;

import com.shopping.demo.cro.GoodsCro;
import com.shopping.demo.entity.Goods;

import java.util.List;

/**
 * @Author ldc
 * @Date 2020/12/7 16:08
 * @Version 1.0
 */

public interface GoodsService {
    
    /**
     * @Author ldc
     * @Description //TODO 
     * @Date 16:17 2020/12/7
     * @Param []
     * @return void
     */
    void addOneGoods(GoodsCro goodsCro);

    /**
     * @Author ldc
     * @Description //TODO 
     * @Date 16:24 2020/12/7
     * @Param [goodsCroList]
     * @return void
     */
    void addListGoods(List<GoodsCro> goodsCroList);
    
    /**
     * @Author ldc
     * @Description //TODO 
     * @Date 16:26 2020/12/7
     * @Param [goodsCro]
     * @return void
     */
    void deleteOneGoods(GoodsCro goodsCro);
    
    /**
     * @Author ldc
     * @Description //TODO 
     * @Date 16:27 2020/12/7
     * @Param [goodsCroList]
     * @return void
     */
    void deleteListGoods(List<GoodsCro> goodsCroList);

    /**
     * @Author ldc
     * @Description //TODO
     * @Date 16:27 2020/12/7
     * @Param [id]
     * @return com.shopping.demo.entity.Goods
     */
    Goods findGoodsById(Long id);
    
    /**
     * @Author ldc
     * @Description //TODO 
     * @Date 16:28 2020/12/7
     * @Param []
     * @return java.util.List<com.shopping.demo.entity.Goods>
     */
    List<Goods> findAllGoods();

    /**
     * @Author ldc
     * @Description //TODO 
     * @Date 16:48 2020/12/7
     * @Param [goodsCro]
     * @return com.shopping.demo.entity.Goods
     */
    Goods editGoods(GoodsCro goodsCro);


}
