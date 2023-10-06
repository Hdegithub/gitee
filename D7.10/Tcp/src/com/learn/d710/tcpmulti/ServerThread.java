package com.learn.d710.tcpmulti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 定义一个单独的线程类，
 * 为了用他和 连接上来的客户端 进行通信
 * <p>
 * 是一对一关系
 * 有一个客户端的连接，就创建一个线程
 * <p>
 * 相当于一个陪同人
 */
public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //获取客户端的ip 和端口
        String cname = socket.getInetAddress().getHostAddress() + " " + socket.getPort();
        try {
            InputStream ips = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ips));
            String s = null;
            //不断的读取对方的数据
            while ((s = br.readLine()) != null) {
                System.out.println(cname + " : " + s);
            }
        } catch (IOException e) {
            System.out.println(" socket异常：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
