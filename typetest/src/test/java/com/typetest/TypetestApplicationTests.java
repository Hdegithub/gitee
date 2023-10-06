package com.typetest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootTest
class TypetestApplicationTests {

    @Test
    void contextLoads() throws ParseException {
        //String转化int
        String s="123";
        int i = Integer.parseInt(s);
        System.out.println(i);

        //int 转变String
        int i1=666;
        String s1 = Integer.toString(i1);
        System.out.println(s1);

        //String  2020-09-01 转变 日期
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=simpleDateFormat.parse("2020-09-01");
        System.out.println(date);

        //LocalDateTime 转变字符串
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String format = dtf.format(now);
        System.out.println(format);
    }

}
