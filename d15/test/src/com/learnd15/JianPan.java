package com.learnd15;

public class JianPan extends Usb {
    @Override
    public void jieru() {
        System.out.println("键盘已接入");
    }

    @Override
    public void bachu() {
        System.out.println("键盘已拔出");
    }
}
