package com.geekaca.d12.tcpmulti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerMulti {
    public static void main(String[] args) {
        /**
         * 目标：能够接受多个客户端 client的连接
         */

        int port = 9999;

        try (ServerSocket serverSocket = new ServerSocket(port);) {
            System.out.println("server启动:" + port);
            while (true) {
                //阻塞等待client的连接   ，来一个socket连接，就创建一个socket对象指向对方
                /**
                 * 对这个socket的打开输入流，输出流 通信应该放在一个独立的线程中
                 * 这样不会把cpu大腿保住不让走
                 */
                /**
                 * 大楼门口 有一个保安大爷
                 * 现有情况： 来一个客人，大爷要全程陪同，所以大爷做不了其他事情
                 *
                 * 目标改造： 来一个客人，大爷给你分配一个陪同的人（ServerThread）
                 * 大爷只负责在门口接待
                 */
                Socket socket = serverSocket.accept();
                String cname = socket.getInetAddress().getHostAddress() + " " + socket.getPort();
                System.out.println("有人连接上了 " + cname);
                //把连接上来的客户端socket 交给单独的线程来对接 ，陪同
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
//                String cname = socket.getInetAddress().getHostAddress() + " " + socket.getPort();
//                System.out.println("有人连接上了 " + cname);
//                // 读取客户端的信息
//                InputStream ips = socket.getInputStream();
//                BufferedReader br = new BufferedReader(new InputStreamReader(ips));
//                String str = null;
//                //这里服务端一直在等待 这个客户端发消息，在这里死等，无法脱身，无法继续accept等待其他客户端的连接
//                while( (str = br.readLine()) != null){
//                    System.out.println(cname +" 说：" + str);
//                }
//                //无法执行到此处
//                System.out.println("server 执行到这里");
            }

        } catch (IOException e) {
            System.out.println(" socket异常:" + e.getMessage());
            e.printStackTrace();
        }

    }
}
