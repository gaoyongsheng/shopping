package com.shopping.demo.service.impl;

import com.shopping.demo.constants.ShopExceptionCode;
import com.shopping.demo.cro.GoodsAllCro;
import com.shopping.demo.cro.GoodsCro;
import com.shopping.demo.entity.Goods;
import com.shopping.demo.entity.User;
import com.shopping.demo.exception.MyShopException;
import com.shopping.demo.repository.GoodsRepository;
import com.shopping.demo.service.GoodsService;
import com.shopping.demo.utils.DateTimeUtils;
import com.shopping.demo.utils.ThreadLocalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ldc
 * @Date 2020/12/7 16:29
 * @Version 1.0
 */

@Service
@Transactional
public class GoodsServiceImpl extends AbstractBaseImpl implements GoodsService{

    @Autowired
    GoodsRepository goodsRepository;

    @Override
    public void addOneGoods(GoodsCro goodsCro) {
        Goods goods = new Goods(goodsCro.toDto());
        User curUser = (User)ThreadLocalUtils.get();
        goods.setGoodsUserId(curUser.getId());
        goods.setGoodsAddTime(DateTimeUtils.getSysCurDate());
        goodsRepository.save(goods);
    }

    @Override
    public void addListGoods(List<GoodsCro> goodsCroList) {
        List<Goods> goodsList = new ArrayList<Goods>();
        for(GoodsCro goodsCro : goodsCroList){
            Goods goods = new Goods(goodsCro.toDto());
            User curUser = (User)ThreadLocalUtils.get();
            goods.setGoodsUserId(curUser.getId());
            goods.setGoodsAddTime(DateTimeUtils.getSysCurDate());
            goodsList.add(goods);
        }
        goodsRepository.saveAll(goodsList);
    }

    @Override
    public void deleteGoodsById(Long id) {
        Goods curGoods = findGoodsById(id);
        goodsRepository.deleteById(id);
    }

    @Override
    public void deleteListGoods(List<GoodsCro> goodsCroList) {
        List<Goods> goodsList = new ArrayList<Goods>();
        for(GoodsCro goodsCro : goodsCroList){
            Goods goods = new Goods(goodsCro.toDto());
            User curUser = (User)ThreadLocalUtils.get();
            goods.setGoodsUserId(curUser.getId());
            goods.setGoodsAddTime(DateTimeUtils.getSysCurDate());
            goodsList.add(goods);
        }
        goodsRepository.deleteAll(goodsList);
    }

    @Override
    public Goods findGoodsById(Long id) {
        Goods curGoods = goodsRepository.findGoodsById(id);
        if(null == curGoods){
            throw new MyShopException(ShopExceptionCode.ENTITY_NO_EXISTS,"实体对象不存在");
        }
        return curGoods;
    }

    @Override
    public Page<Goods> findAllGoods(GoodsAllCro goodsAllCro) {
        Pageable pageable = getPageable(goodsAllCro.getOffset(),goodsAllCro.getPageSize());
        Page<Goods> page = goodsRepository.findAll(pageable);
        return page;
    }

    @Override
    public Goods editGoods(GoodsCro goodsCro) {
        Goods curGoods = findGoodsById(goodsCro.getId());
        curGoods.setGoodsName(goodsCro.getGoodsName());
        curGoods.setGoodsPrice(goodsCro.getGoodsPrice());
        curGoods.setGoodsDetailImage(goodsCro.getGoodsDetailImage());
        curGoods.setGoodsInventoryCount(goodsCro.getGoodsInventoryCount());
        curGoods.setGoodsSalesCount(goodsCro.getGoodsSalesCount());
        curGoods.setGoodsImage(goodsCro.getGoodsImage());
        curGoods.setGoodsDetailText(goodsCro.getGoodsDetailText());
        goodsRepository.save(curGoods);
        return curGoods;
    }
}
