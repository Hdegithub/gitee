package com.learn.d710.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Udpclient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动=======");
        //Udp  通信类  占据本机6666端口
        DatagramSocket socket = new DatagramSocket(6666);
        String str = "你好，udp";
        byte[] buffer = str.getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);
        socket.send(packet);
    }
}
