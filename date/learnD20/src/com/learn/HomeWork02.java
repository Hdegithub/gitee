package com.learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) throws ParseException {
        //设计一个函数，参数是两个字符串 开始时间和结束时间
        // 计算 返回 相差多少秒
        //String startTime , String endTime
        String startTime = "2000年1月1日  0:0:0";
        String endTime = "3000年1月1日  0:0:0";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = simpleDateFormat.parse(startTime);
        Date date1 = simpleDateFormat.parse(endTime);
        long cha = date1.getTime() - date.getTime();
        System.out.println("相差：" + cha + "秒");
    }
}
