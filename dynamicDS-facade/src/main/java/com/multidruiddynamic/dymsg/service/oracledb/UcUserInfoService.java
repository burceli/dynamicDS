package com.multidruiddynamic.dymsg.service.oracledb;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.multidruiddynamic.dymsg.pojo.UcUserInfo;

public interface UcUserInfoService extends IService<UcUserInfo> {
    UcUserInfo selectOneUser(String userId);

    IPage<UcUserInfo> selectPage(int current, int size);
}
