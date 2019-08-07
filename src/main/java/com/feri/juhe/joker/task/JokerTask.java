package com.feri.juhe.joker.task;/**
 * @author Feri
 */

import com.alibaba.fastjson.JSON;
import com.feri.juhe.joker.entity.Joker;
import com.feri.juhe.joker.model.JokerJson;
import com.feri.juhe.joker.service.JokerService;
import com.feri.juhe.joker.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 16:35
 */
@Component
public class JokerTask {
    @Autowired
    private JokerService jokerService;
    //基于Spring Task 实现任务调度 定时任务
    @Scheduled(cron = "0/20 * 16 * * ?")
    public void downJoker(){
        String u="http://v.juhe.cn/joke/content/text.php?key=b12d46180eda262ec3a1cec558aa950e&page=1&pagesize=100";
        String json= HttpUtil.getStr(u);
        System.out.println(json);
        if(json!=null){
            JokerJson jokerJson= JSON.parseObject(json,JokerJson.class);
            List<Joker> jokers=jokerJson.getResult().getData();
            jokerService.saveBatch(jokers);
        }
    }
}
