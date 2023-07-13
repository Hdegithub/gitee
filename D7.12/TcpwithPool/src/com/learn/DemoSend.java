package com.learn;

import java.io.*;
import java.net.Socket;

public class DemoSend {
    private static String path = "C:\\dev\\tmp\\data.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(path);
             DataInputStream dis = new DataInputStream(fis);
             Socket socket = new Socket("192.168.124.1", 7654);
             OutputStream ops = socket.getOutputStream();
             DataOutputStream dos = new DataOutputStream(ops);) {
            dos.writeUTF(dis.readUTF());
            dos.writeInt(dis.readInt());
            dos.writeInt(dis.readInt());
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
