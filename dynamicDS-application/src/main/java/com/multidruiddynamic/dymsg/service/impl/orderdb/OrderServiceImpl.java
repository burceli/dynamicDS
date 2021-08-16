package com.multidruiddynamic.dymsg.service.impl.orderdb;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.multidruiddynamic.dymsg.mapper.orderdb.OrderMapper;
import com.multidruiddynamic.dymsg.pojo.Order;
import com.multidruiddynamic.dymsg.service.orderdb.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order selectOneOrder(Long orderId) {
        return orderMapper.selectOneOrder(orderId);
    }

    @Override
    public IPage<Order> selectPage(int current, int size) {
        LambdaQueryWrapper<Order> userLambdaQueryWrapper = Wrappers.lambdaQuery();

        Page<Order> userPage = new Page<>(current, size);
        IPage<Order> userIPage = orderMapper.selectPage(userPage, null);
        System.out.println("总页数： " + userIPage.getPages());
        System.out.println("总记录数： " + userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
        return userIPage;
    }
}
