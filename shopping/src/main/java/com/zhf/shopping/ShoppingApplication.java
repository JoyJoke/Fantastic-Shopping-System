package com.zhf.shopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"com.zhf.shopping.config.redis", "com.zhf.shopping.exception", "com.zhf.shopping.security", "com.zhf.shopping.service", "com.zhf.shopping.controller"})
//@SpringBootApplication
@MapperScan(basePackages = "com.zhf.shopping.mapper")
@EnableCaching
public class ShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }

}
