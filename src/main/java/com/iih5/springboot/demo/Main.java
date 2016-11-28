package com.iih5.springboot.demo;

import com.iih5.smartorm.cache.Redis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />  (用@Transactional 注解需要事物的方法即可)
@EnableTransactionManagement
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        while (true){try {Thread.sleep(500000);} catch (InterruptedException e) {}}
    }
}
