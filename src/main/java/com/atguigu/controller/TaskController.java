//package com.atguigu.controller;
//
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//@Component
//public class TaskController {
//    //@Scheduled(fixedDelay = 3000)//定时规则，表示每隔3秒运行一次
//   // @Scheduled(fixedRate= 3000)//定时规则，表示每隔3秒运行一次
//    @Scheduled(cron= "0/5 * * * * *")//定时规则，表示每隔5秒运行一次
//    public void myTask() throws InterruptedException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(simpleDateFormat.format(new Date()));
//       // Thread.sleep(5000);
//    }
//}
