package com.d15.homework;

public class DouJiangJi {
    public static void main(String[] args) {
        //模拟 豆浆机过程 水果汁，步骤固定，制作豆浆（子类），制作水果果汁
        //1，清洗豆子
        //2，放入
        //3，开电源，执行打豆浆
        Dadoujiang doujiang = new Dadoujiang();
        doujiang.dadoujiang();

        FruitJuicy fruitJuicy = new FruitJuicy();
        fruitJuicy.guozhi();
    }
}
