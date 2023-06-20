package com.learn;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime mybirth = LocalDateTime.of(2002, 5, 7, 1, 0, 0);
        LocalDateTime plus = mybirth.plusYears(100);
        LocalDateTime today = LocalDateTime.now();
        Duration duration = Duration.between(today, plus);
        long days = duration.toDays();
        System.out.println("还能活：" + days + "天");
    }
}
