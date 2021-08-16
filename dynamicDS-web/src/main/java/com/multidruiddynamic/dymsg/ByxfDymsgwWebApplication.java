package com.multidruiddynamic.dymsg;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//@ImportResource(locations = {"classpath:rpc/*.xml"})
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class ByxfDymsgwWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ByxfDymsgwWebApplication.class, args);
    }

}
