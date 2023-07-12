package com.learn.d710.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Tcpcliemt {
    public static void main(String[] args) {
        try {
            //建立连接 1
            Socket socket = new Socket("127.0.0.1", 7777);
            //连接到server后，立即读取对方的信息
            InputStream ips = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ips));
            String welcome = br.readLine();
            System.out.println("服务器说：" + welcome);
            //从socket通信管道中得到一个字节输出流，负责向对方发送数据
            OutputStream ops = socket.getOutputStream();
            PrintStream ps = new PrintStream(ops);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请输入发送内容:");
                String str = sc.nextLine();
                ps.println(str);
                ps.flush();
                //socket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
