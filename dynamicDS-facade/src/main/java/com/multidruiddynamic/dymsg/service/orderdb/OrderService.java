package com.multidruiddynamic.dymsg.service.orderdb;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.multidruiddynamic.dymsg.pojo.Order;

public interface OrderService extends IService<Order> {
    Order selectOneOrder(Long orderId);

    IPage<Order> selectPage(int current, int size);
}
