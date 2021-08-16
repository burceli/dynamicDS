package com.multidruiddynamic.dymsg.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.multidruiddynamic.dymsg.mapper.goodsdb.GoodsMapper;
import com.multidruiddynamic.dymsg.mapper.oracledb.UcUserInfoMapper;
import com.multidruiddynamic.dymsg.mapper.orderdb.OrderMapper;
import com.multidruiddynamic.dymsg.pojo.Goods;

import javax.annotation.Resource;

import com.multidruiddynamic.dymsg.pojo.Order;
import com.multidruiddynamic.dymsg.pojo.UcUserInfo;
import com.multidruiddynamic.dymsg.service.goodsdb.GoodsService;
import com.multidruiddynamic.dymsg.service.oracledb.UcUserInfoService;
import com.multidruiddynamic.dymsg.service.orderdb.OrderService;
import com.ynet.msg.service.TestJobService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/home")
public class HomeController {

    @Resource
    public GoodsMapper goodsMapper;

    @Resource
    public OrderMapper orderMapper;

    @Resource
    public UcUserInfoMapper ucUserInfoMapper;

    @Autowired
    public GoodsService goodsService;

    @Autowired
    public OrderService orderService;

    @Autowired
    public UcUserInfoService ucUserInfoService;

    @Reference(group = "${dubbo.rpc-msg.group}", version = "${dubbo.rpc-msg.version}")
    public TestJobService testJobService;

    //商品详情 参数:商品id
    @GetMapping("/goodsinfo")
    @ResponseBody
    public Goods goodsInfo(@RequestParam(value = "goodsid", required = true, defaultValue = "0") Long goodsId) {
        Goods goods = goodsMapper.selectOneGoods(goodsId);
        return goods;
    }

    //订单详情 参数：订单id
    @GetMapping("/orderinfo")
    @ResponseBody
    public Order orderInfo(@RequestParam(value = "orderid", required = true, defaultValue = "0") Long orderId) {
        Order order = orderMapper.selectOneOrder(orderId);
        return order;
    }


    @GetMapping("/userinfo")
    @ResponseBody
    public UcUserInfo userinfo(@RequestParam(value = "userId", required = true, defaultValue = "0") String userId) {
        UcUserInfo ucUserInfo = ucUserInfoMapper.selectOneUser(userId);
        return ucUserInfo;
    }


    //商品详情 参数:商品id
    @GetMapping("/goodsinfoPage")
    @ResponseBody
    public IPage<Goods> goodsInfoPage(@RequestParam int current, @RequestParam int size) {
        return goodsService.selectPage(current, size);

    }

    //订单详情 参数：订单id
    @GetMapping("/orderinfoPage")
    @ResponseBody
    public IPage<Order> orderInfoPage(@RequestParam int current, @RequestParam int size) {
        return orderService.selectPage(current, size);
    }


    @GetMapping("/userinfoPage")
    @ResponseBody
    public IPage<UcUserInfo> userinfoPage(@RequestParam int current, @RequestParam int size) {
        return ucUserInfoService.selectPage(current, size);
    }

    @GetMapping("/testJob1")
    @ResponseBody
    public void testJob1() {
        log.info("scheduledTaskFixedRate开始");
        log.info("msg.testJobService................");
        testJobService.testJob1();
        log.info("scheduledTaskFixedRate结束");
    }

}

