package com.learn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class DateTest {
    public static void main(String[] args) {
        LocalDateTime jiezhi = LocalDateTime.of(2023, 6, 20, 14, 0, 0);
        LocalDateTime tom = LocalDateTime.of(2023, 6, 20, 14, 0, 10);
        LocalDateTime jerry = LocalDateTime.of(2023, 6, 20, 13, 59, 59);
        boolean isTomOk = tom.isBefore(jiezhi);
        boolean isJerryOk = jerry.isBefore(jiezhi);
        System.out.println("tom:" + isTomOk + " jerry:" + isJerryOk);
    }
}
