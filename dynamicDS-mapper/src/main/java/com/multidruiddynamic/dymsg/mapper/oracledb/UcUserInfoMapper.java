package com.multidruiddynamic.dymsg.mapper.oracledb;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.multidruiddynamic.dymsg.pojo.UcUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@DS("oracledb")
public interface UcUserInfoMapper extends BaseMapper<UcUserInfo> {
    UcUserInfo selectOneUser(String userId);


}
