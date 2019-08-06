package com.feri.juhe.joker.task;/**
 * @author Feri
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 16:16
 */
@Component
public class HelloTask {
//    @Scheduled(cron = "0/3 * * ? * *")
    public void hello(){
        System.out.println("醒醒："+System.currentTimeMillis()/1000);
    }
}
