package com.learnmq.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MySchedule {
    /**
     * cron 借鉴自Linux 的Cron表达式
     * * 第一位，表示秒，取值0-59
     * * 第二位，表示分，取值0-59
     * * 第三位，表示小时，取值0-23
     * * 第四位，日期天/日，取值1-31
     * * 第五位，日期月份，取值1-12
     * * 第六位，星期，取值1-7，1表示星期天，2表示星期一
     * * 第七位，年份，可以留空，取值1970-2099
     */
    @Scheduled(cron = "*/5 * * * * *")
    private void printTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
