package com.learn;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HomeWork04 {
    public static void main(String[] args) {

        //从现在开始，每隔23天输出一下日期，输出5次
        LocalDate today = LocalDate.now();
        for (int i = 0; i < 5; i++) {
            LocalDate plus = today.plusDays(23);
            today = plus;
            System.out.println(plus);
        }
    }
}
