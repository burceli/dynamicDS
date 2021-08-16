package com.multidruiddynamic.dymsg.mapper.goodsdb;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.multidruiddynamic.dymsg.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@DS("goodsdb")
public interface GoodsMapper extends BaseMapper<Goods> {
    Goods selectOneGoods(Long goodsId);
}
