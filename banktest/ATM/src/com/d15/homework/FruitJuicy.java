package com.d15.homework;

public class FruitJuicy extends Template {
    public FruitJuicy() {
        System.out.println("开始做果汁");
    }

    @Override
    public void xidouzi() {
        System.out.println("洗水果");
    }

    @Override
    public void putin() {
        System.out.println("洗好的水果放进机器");
    }
}
