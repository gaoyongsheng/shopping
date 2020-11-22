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

  /**
   * 商品表（goods）
   */
  public static final String GOODS_TABLE_NAME = "goods";

  /**
   * 订单表（order）
   */
  public static final String ORDER_TABLE_NAME = "order";

  /**
   * 商品订单中间表（goods_order_middle）
   */
  public static final String GOODS_ORDER_TABLE_NAME = "goods_order_middle";

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
