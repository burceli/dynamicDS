package com.multidruiddynamic.dymsg.service.impl.oracledb;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.multidruiddynamic.dymsg.mapper.oracledb.UcUserInfoMapper;
import com.multidruiddynamic.dymsg.pojo.UcUserInfo;
import com.multidruiddynamic.dymsg.service.oracledb.UcUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UcUserInfoServiceImpl extends ServiceImpl<UcUserInfoMapper, UcUserInfo> implements UcUserInfoService {

    @Autowired
    private UcUserInfoMapper ucUserInfoMapper;


    @Override
    public UcUserInfo selectOneUser(String userId) {
        return ucUserInfoMapper.selectOneUser(userId);
    }

    @Override
    public IPage<UcUserInfo> selectPage(int current, int size) {

        Page<UcUserInfo> userPage = new Page<>(current, size);
        IPage<UcUserInfo> userIPage = ucUserInfoMapper.selectPage(userPage, null);
        System.out.println("总页数： " + userIPage.getPages());
        System.out.println("总记录数： " + userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
        return userIPage;
    }
}
