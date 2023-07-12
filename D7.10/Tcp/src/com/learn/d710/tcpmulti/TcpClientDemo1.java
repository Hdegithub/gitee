package com.geekaca.d12.tcpmulti;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientDemo1 {
    public static void main(String[] args) {
        try {
            // 1、创建Socket通信管道请求有服务端的连接  客户端（主动连接服务端）
            // public Socket(String host, int port)
            // 参数一：host 服务端的IP地址
            // 参数二：服务端的端口
            //  客户端 指定了 目标服务器的ip和端口， 没有指定自己要占用的端口，由电脑随机分配
            //建立连接
            Socket socket = new Socket("localhost", 9999);
            // 2、从socket通信管道中得到一个字节输出流 负责向对方发送数据    向外发，输出流
            OutputStream ops = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(ops);
            Scanner scan = new Scanner(System.in);
            while(true){
                System.out.println("请输入信息：");
                String next = scan.next();
                pw.println(next);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
