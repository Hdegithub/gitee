package com.learnd15;

public class ShuBbiao extends Usb{
    @Override
    public void jieru() {
        System.out.println("鼠标已接入");
    }

    @Override
    public void bachu() {
        System.out.println("鼠标已拔出");
    }
}
