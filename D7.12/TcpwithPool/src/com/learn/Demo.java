package com.learn;

import java.io.*;

public class Demo {
    private static String path = "C:\\dev\\tmp\\data.txt";

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("张三");
            dos.writeInt(20);
            dos.writeInt(180);
            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        read();
    }

    public static void read() {
        try {
            FileInputStream fis = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fis);
            {
                //写的时候的顺序，和读的顺序对应
                String name = dis.readUTF();
                int age = dis.readInt();
                int length = dis.readInt();
                System.out.println("学生姓名：" + name + " 年龄: " + age + " 身高: " + length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
