package com.shopping.demo.dto;

import com.shopping.demo.dto.base.BaseDto;

import java.util.List;

/**
 * @Author ldc
 * @Date 2020/12/7 15:36
 * @Version 1.0
 */
public class GoodsDto extends BaseDto {

    private Long id;

    private String goodsName;

    private String goodsPrice;

    private String goodsInventoryCount;

    private String goodsSalesCount;

    private List<String> goodsImage;

    private String goodsDetailText;

    private String goodsAddTime;

    private List<String> goodsDetailImage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsAddTime() {
        return goodsAddTime;
    }

    public void setGoodsAddTime(String goodsAddTime) {
        this.goodsAddTime = goodsAddTime;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goods_price) {
        this.goodsPrice = goods_price;
    }

    public String getGoodsInventoryCount() {
        return goodsInventoryCount;
    }

    public void setGoodsInventoryCount(String goodsInventoryCount) {
        this.goodsInventoryCount = goodsInventoryCount;
    }

    public String getGoodsSalesCount() {
        return goodsSalesCount;
    }

    public void setGoodsSalesCount(String goodsSalesCount) {
        this.goodsSalesCount = goodsSalesCount;
    }

    public List<String> getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(List<String> goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsDetailText() {
        return goodsDetailText;
    }

    public void setGoodsDetailText(String goodsDetailText) {
        this.goodsDetailText = goodsDetailText;
    }

    public List<String> getGoodsDetailImage() {
        return goodsDetailImage;
    }

    public void setGoodsDetailImage(List<String> goodsDetailImage) {
        this.goodsDetailImage = goodsDetailImage;
    }

    @Override
    public String toString() {
        return "GoodsDto{" +
                "id='" + id +
                ", goodsName='" + goodsName +
                ", goodsPrice='" + goodsPrice +
                ", goodsInventoryCount='" + goodsInventoryCount +
                ", goodsSalesCount='" + goodsSalesCount +
                ", goodsImage=" + goodsImage +
                ", goodsDetailText='" + goodsDetailText +
                ", goodsDetailImage=" + goodsDetailImage +
                ", goodsAddTime=" + goodsAddTime +
                '}';
    }
}
