package com.learnd15;

public class TestUsb {
    public static void main(String[] args) {
        Usb usba=new JianPan();
        Usb usbb=new ShuBbiao();
        Computer computer=new Computer();
        computer.lianjieUsb(usba);
        computer.Shubiao(usbb);
    }
}
