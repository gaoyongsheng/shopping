package com.shopping.demo.entity;

import com.shopping.demo.constants.DaoConstant;
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
    private Float goods_price;

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

    @Override
    public Object toDto() {
        return null;
    }
}
