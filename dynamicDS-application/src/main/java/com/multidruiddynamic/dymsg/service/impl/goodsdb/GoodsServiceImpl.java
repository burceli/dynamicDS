package com.multidruiddynamic.dymsg.service.impl.goodsdb;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.multidruiddynamic.dymsg.mapper.goodsdb.GoodsMapper;
import com.multidruiddynamic.dymsg.pojo.Goods;
import com.multidruiddynamic.dymsg.service.goodsdb.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods selectOneGoods(Long goodsId) {
        return goodsMapper.selectOneGoods(goodsId);
    }

    @Override
    public IPage<Goods> selectPage(int current, int size) {
        LambdaQueryWrapper<Goods> userLambdaQueryWrapper = Wrappers.lambdaQuery();

        Page<Goods> userPage = new Page<>(current, size);
        IPage<Goods> userIPage = goodsMapper.selectPage(userPage, null);
        System.out.println("总页数： " + userIPage.getPages());
        System.out.println("总记录数： " + userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
        return userIPage;
    }
}
