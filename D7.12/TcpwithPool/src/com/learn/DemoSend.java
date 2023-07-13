package com.learn;

import java.io.*;
import java.net.Socket;

public class DemoSend {
    private static String path = "C:\\dev\\tmp\\data.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(path);
             DataInputStream dis = new DataInputStream(fis);
             Socket socket = new Socket("localhost", 7654);
             OutputStream ops = socket.getOutputStream();
             DataOutputStream dos = new DataOutputStream(ops);) {
            dos.writeUTF("张三");
            dos.writeInt(20);
            dos.writeInt(180);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
