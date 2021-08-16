package com.multidruiddynamic.dymsg.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("goods")
public class Goods {
    //商品id
    @TableField("goodsId")
    Long goodsId;

    //商品名称
    @TableField("goodsName")
    private String goodsName;

    //商品标题
    private String subject;

    //商品价格
    private BigDecimal price;

    //库存
    int stock;

}
