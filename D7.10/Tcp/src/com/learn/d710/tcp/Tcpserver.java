package com.learn.d710.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Tcpserver {
    public static void main(String[] args) {
        //服务端等待别人来连接
        //注册端口，绑定端口
        int port = 7777;

        try (ServerSocket serverSocket = new ServerSocket(port);) {
            System.out.println("服务端已启动:" + port);
            //阻塞等待连接
            Socket clientsocket = serverSocket.accept();
            //有客户端连接上来，立即发送一句欢迎登陆
            OutputStream outputStream = clientsocket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write("欢迎登陆");
            bw.newLine();
            bw.flush();
            //打开字节输入流  ，为了从对方读取数据
            InputStream clientIPS = clientsocket.getInputStream();
            //事先约定好的，对方发字符串，    做一个转换流   从字节流 转换成字符流（转接口）
            //再包装一层 缓冲流 ：能够以换行符一个个的接收，读取流效率比较高
            BufferedReader br = new BufferedReader(new InputStreamReader(clientIPS));
            //IO操作
            String msg = null;
            while ((msg = br.readLine()) != null) {
                //获取对方的IP信息
                SocketAddress remoteSocketAddress = clientsocket.getRemoteSocketAddress();
                while (true) {
                    System.out.println(remoteSocketAddress + " 对方说：" + msg);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
