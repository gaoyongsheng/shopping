package com.shopping.demo.entity;

import com.shopping.demo.constants.DaoConstant;
import com.shopping.demo.dto.GoodsDto;
import com.shopping.demo.entity.base.BaseModel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * @Author ldc
 * @Date 2020/12/3 17:20
 * @Version 1.0
 */

@Entity
@Table(name = DaoConstant.GOODS_TABLE_NAME)
@Data
public class Goods extends BaseModel<Goods> {

    @Column(name = DaoConstant.GOODS_NAME)
    private String goodsName;

    @Column(name = DaoConstant.GOODS_PRICE)
    private String goodsPrice;

    @Column(name = DaoConstant.GOODS_INVENTORY_COUNT)
    private String goodsInventoryCount;

    @Column(name = DaoConstant.GOODS_SALES_COUNT)
    private String goodsSalesCount;

    @ElementCollection(targetClass = String.class)
    private List<String> goodsImage;

    @Column(name = DaoConstant.GOODS_DETAIL_TEXT)
    private String goodsDetailText;

    @ElementCollection(targetClass = String.class)
    private List<String> goodsDetailImage;

    @Column(name = DaoConstant.GOODS_ADD_TIME)
    private String goodsAddTime;

    @Column(name = DaoConstant.GOODS_USER_ID)
    private Long goodsUserId;

    public Goods(){}

    public Goods(GoodsDto goodsDto){
        this.id = goodsDto.getId();
        this.goodsName = goodsDto.getGoodsName();
        this.goodsPrice = goodsDto.getGoodsPrice();
        this.goodsInventoryCount = goodsDto.getGoodsInventoryCount();
        this.goodsSalesCount = goodsDto.getGoodsSalesCount();
        this.goodsImage = goodsDto.getGoodsImage();
        this.goodsDetailText = goodsDto.getGoodsDetailText();
        this.goodsDetailImage = goodsDto.getGoodsDetailImage();
        this.goodsAddTime = goodsDto.getGoodsAddTime();
    }

    @Override
    public GoodsDto toDto() {
        GoodsDto goodsDto = new GoodsDto();
        goodsDto.setId(id);
        goodsDto.setGoodsName(goodsName);
        goodsDto.setGoodsPrice(goodsPrice);
        goodsDto.setGoodsInventoryCount(goodsInventoryCount);
        goodsDto.setGoodsSalesCount(goodsSalesCount);
        goodsDto.setGoodsImage(goodsImage);
        goodsDto.setGoodsDetailText(goodsDetailText);
        goodsDto.setGoodsDetailImage(goodsDetailImage);
        goodsDto.setGoodsAddTime(goodsAddTime);
        return goodsDto;
    }


}
