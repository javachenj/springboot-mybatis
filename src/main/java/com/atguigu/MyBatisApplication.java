package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@ServletComponentScan
@EnableScheduling
@EnableTransactionManagement//声明式事务
@MapperScan( "com.atguigu.dao")
@SpringBootApplication
public class MyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class,args);
    }
}
