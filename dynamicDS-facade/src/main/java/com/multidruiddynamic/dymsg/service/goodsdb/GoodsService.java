package com.multidruiddynamic.dymsg.service.goodsdb;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.multidruiddynamic.dymsg.pojo.Goods;

public interface GoodsService extends IService<Goods> {
    Goods selectOneGoods(Long goodsId);

    IPage<Goods> selectPage(int current, int size);
}
