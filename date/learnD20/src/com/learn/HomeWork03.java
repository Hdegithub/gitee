package com.learn;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HomeWork03 {
    public static void main(String[] args) {
        //计算2023年有多少个星期二??

        LocalDate ldt = LocalDate.of(2023, 1, 1);
        LocalDate ldt1 = LocalDate.of(2023, 12, 31);
        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
        //一月一号是星期天,12月31是星期天
        int weeks = (int) ChronoUnit.WEEKS.between(ldt, ldt1);//两个时间差的周数
        int day = 0;
        LocalDate ldt2 = LocalDate.of(2023, 1, 1);
        for (int i = 0; i <= weeks; i++) {
            if (ldt2.getDayOfWeek().getValue() == 2) {
                day += 1;
            } else {
                ldt2 = ldt2.plusDays(1);
            }
        }
        System.out.println(ldt + "到" + ldt1 + "的" + "星期二有" + day + "个");
    }
}
