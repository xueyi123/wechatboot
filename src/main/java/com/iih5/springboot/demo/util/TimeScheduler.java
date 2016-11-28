package com.iih5.springboot.demo.util;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class TimeScheduler {
//    // 处理每N秒执行一次
//    @Scheduled(cron = "*/1 * * * * ?")
//    public void syncToDb() {
//        System.out.println("111111111111111111");
//    }
//
//    //"0 15 10 ? * *" 每天早上10：15触发
//    @Scheduled(cron = "0 7 14 ? * *")
//    public void syncToDb2() {
//        System.out.println("2222222");
//    }
}
