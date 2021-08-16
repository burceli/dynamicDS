package com.multidruiddynamic.dymsg.mapper.orderdb;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.multidruiddynamic.dymsg.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@DS("orderdb")
public interface OrderMapper extends BaseMapper<Order> {
    Order selectOneOrder(Long orderId);
}
