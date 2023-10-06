package com.learnd15;

public class Computer {
    public void lianjieUsb(Usb jianpan) {
        jianpan.jieru();
        System.out.println("键盘录入");
        jianpan.bachu();
    }

    public void Shubiao(Usb shubiao) {
        shubiao.jieru();
        System.out.println("双击");
        shubiao.bachu();
    }
}
