package com.learn;

import java.io.*;

public class Demo {
    private static String path = "C:\\dev\\tmp\\dataOut.txt";

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(9);
            dos.writeUTF("你好");
            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try {
            FileInputStream fis = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fis);
            {
//写的时候的顺序，和读的顺序对应
                int i = dis.readInt();
                String str = dis.readUTF();
                System.out.println(i);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
