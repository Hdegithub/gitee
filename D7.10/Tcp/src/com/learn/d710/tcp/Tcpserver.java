package com.learn.d710.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Tcpserver {
    public static void main(String[] args) {
        //服务端等待别人来连接
        //注册端口，绑定端口
        int port=7777;

        try (ServerSocket serverSocket = new ServerSocket(port);) {
            System.out.println("服务端已启动:"+port);
            Socket clientsocket = serverSocket.accept();
            InputStream clientIPS = clientsocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(clientIPS));
            String msg = null;
            while ((msg = br.readLine()) != null) {
                SocketAddress remoteSocketAddress = clientsocket.getRemoteSocketAddress();
                while (true){
                    System.out.println(remoteSocketAddress + " 对方说：" + msg);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
