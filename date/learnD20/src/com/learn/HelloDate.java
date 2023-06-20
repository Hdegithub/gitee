package com.learn;

import java.util.Date;

public class HelloDate {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        long time=System.currentTimeMillis();
        time=time+60*60*1000;
        System.out.println(time);

        Date newdate=new Date();
        newdate.setTime(time);
        System.out.println("一小时后："+newdate);
    }
}
