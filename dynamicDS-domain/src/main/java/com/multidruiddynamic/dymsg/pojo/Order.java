package com.multidruiddynamic.dymsg.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

//订单模型
@Data
@TableName("orderinfo")
public class Order {
    //订单id
    @TableField("orderId")
    Long orderId;

    //订单编号
    @TableField("orderSn")
    private String orderSn;

    //下单时间
    @TableField("orderTime")
    private String orderTime;

    //订单状态
    @TableField("orderStatus")
    int orderStatus;

    //订单状态
    @TableField("userId")
    int userId;

    //订单价格
    @TableField("price")
    private BigDecimal price;


}
