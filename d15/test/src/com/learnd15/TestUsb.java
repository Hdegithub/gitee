package com.learnd15;

import java.util.ArrayList;

public class TestUsb {
    public static void main(String[] args) {
        Usb usba=new JianPan();
        Usb usbb=new ShuBbiao();
        Computer computer=new Computer();
        computer.lianjieUsb(usba);
        computer.Shubiao(usbb);

        ArrayList<Usb>usbs=new ArrayList<>();
        usbs.add(usba);
        usbs.add(usbb);
        for (int i = 0; i < usbs.size(); i++) {
            Usb usb=usbs.get(i);
            usb.jieru();
            usb.bachu();
        }
    }
}
