package com.studytest;

public class VipCard extends Card {
    @Override
    public void pay(double money) {
        double costmoney = money * 0.8;
        double lastyue = getYue() - costmoney;
        System.out.println("当前账户：" + getYue() + "消费：" + costmoney + "余额为：" + lastyue);
        setYue(lastyue);
    }
}
