package com.studytest;

import java.util.Scanner;

public class JiaYouTest {
    public static void main(String[] args) {
        VipCard vipCard = new VipCard();
        vipCard.setYue(10000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        double cost = scanner.nextDouble();
        vipCard.pay(cost);
    }
}
