package com.shopping.demo.dto;

import com.shopping.demo.dto.base.BaseDto;

/**
 * @Author ldc
 * @Date 2020/12/10 11:09
 * @Version 1.0
 */
public class OrderDto extends BaseDto {

    private Long Id;

    private String orderCode;

    private String orderStatus;

    private String orderTotalPrice;

    private String orderUserId;

    private String orderAddTime;

    @Override
    public String toString() {
        return "OrderDto{" +
                "Id=" + Id +
                ", orderCode='" + orderCode +
                ", orderStatus='" + orderStatus +
                ", orderTotalPrice='" + orderTotalPrice +
                ", orderUserId='" + orderUserId +
                ", orderAddTime='" + orderAddTime +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(String orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(String orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getOrderAddTime() {
        return orderAddTime;
    }

    public void setOrderAddTime(String orderAddTime) {
        this.orderAddTime = orderAddTime;
    }
}
