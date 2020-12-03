package com.shopping.demo.constants;

/**
 * 数据库字段常量.
 */
public class DaoConstant {

    /**
     * 用户表(user)
     */
    public static final String USER_TABLE_NAME = "user";
    public static final String USER_ID = "id";
    public static final String USER_USERNAME = "user_name";//用户名
    public static final String USER_PASSWORD = "password";//密码
    public static final String USER_EMAIL = "email";//邮箱
    public static final String USER_MOBILE_NUM = "mobile_num";//手机号
    public static final String USER_TRUE_NAME = "true_name";//真实姓名
    public static final String USER_AVATAR_ADDR = "avatar_address";//用户头像地址
    public static final String USER_SEX = "sex";//性别  1：男   0：女
    public static final String USER_ADD_TIME = "add_time";//创建日期
    public static final String USER_ROLE = "user_role";//用户角色，卖家:seller,买家：buyer

    /**
     * 地址表（address）
     */
    public static final String ADDRESS_TABLE_NAME = "address";
    public static final String ADDRESS_ID = "id";
    public static final String ADDRESS_NAME = "addr_user"; //收件人名称
    public static final String ADDRESS_MOBILE = "addr_mobile";//收件人手机号
    public static final String ADDRESS_PROVINCE = "addr_province";//收件人所在省
    public static final String ADDRESS_CITY = "addr_city";//收件人所在市
    public static final String ADDRESS_COUNTY = "addr_county";//收件人所在县、区
    public static final String ADDRESS_DETAIL = "addr_detail";//收件人所在的详细地址
    public static final String ADDRESS_USER_ID = "addr_user_id";//address表的外键指向用户表的主键


    /**
     * 商品表（goods）
     */
    public static final String GOODS_TABLE_NAME = "goods";//表名
    public static final String GOODS_ID = "id";//商品id
    public static final String GOODS_NAME = "goods_name";//商品名称
    public static final String GOODS_PRICE = "goods_price";//商品价格
    public static final String GOODS_INVENTORY_COUNT = "goods_inventory_count";//商品当前库存量
    public static final String GOODS_SALES_COUNT = "goods_sales_count";//商品销量
    public static final String GOODS_IMAGE = "goods_image";//商品图片集合
    public static final String GOODS_DETAIL_TEXT = "goods_detail_text";//商品详情描述文本
    public static final String GOODS_DETAIL_IMAGE = "goods_detail_image";//商品详情图片集合
    public static final String GOODS_USER_ID = "goods_user_id";//goods表的外键指向用户表的主键


    /**
     * 订单表（order）
     */
    public static final String ORDER_TABLE_NAME = "order";//表名
    public static final String ORDER_ID = "id";//订单id
    public static final String ORDER_CODE  = "order_code";//订单编号
    public static final String ORDER_STATUS = "order_status";//订单状态 0 待付款 1 待发货 2 待收货 3 完成
    public static final String ORDER_TOTAL_PRICE = "order_total_price";//订单总价
    public static final String ORDER_LIST_GOODS = "order_list_goods";//订单里面的商品列表(包含购买的商品数量)
    public static final String ORDER_USER_ID = "order_user_id";//order表的外键指向用户表的主键


    /**
     * 操作日志表(oper_log)
     */
    public static final String OPER_LOG_TABLE_NAME = "oper_log";
    public static final String OPER_LOG_USER_ID = "user_id"; //用户ID
    public static final String OPER_LOG_USERNAME = "username"; //用户名
    public static final String OPER_LOG_TRUE_NAME = "trueName"; //用户名称
    public static final String OPER_LOG_MOBILE_NUM = "mobile_num"; //手机号
    public static final String OPER_LOG_API_INTERFACE = "api_interface"; //API接口
    public static final String OPER_LOG_API_DESCRIPTION = "api_description"; //API描述
    public static final String OPER_LOG_REQ_DATA = "req_data"; //请求数据
    public static final String OPER_LOG_RET_CODE = "ret_code"; //返回结果吗
    public static final String OPER_LOG_REQ_TIME = "req_time"; //请求时间


}
