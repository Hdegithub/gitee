package com.d15.homework;

public abstract class Template {
    public abstract void xidouzi();

    public abstract void putin();

    public void poweron() {
        System.out.println("打开电源，打豆浆");
    }

    public void fruitpoweron() {
        System.out.println("打开电源，开始榨汁");
    }

    public void dadoujiang() {
        xidouzi();
        putin();
        poweron();
    }

    public void guozhi() {
        xidouzi();
        putin();
        fruitpoweron();
    }
}
