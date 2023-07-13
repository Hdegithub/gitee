package com.learn;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Task {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(7654);) {
            System.out.println("服务端启动");
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String name = dis.readUTF();
            int age = dis.readInt();
            int length = dis.readInt();
            System.out.println("学生姓名：" + name + "年龄" + age + "身高" + length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
