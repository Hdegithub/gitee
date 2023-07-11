package com.learn.d710.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[]buffer=new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        System.out.println("请等待数据");
        //接收方
        socket.receive(packet);
        System.out.println("收到数据");
        int packetLength = packet.getLength();
        String s = new String(buffer, 0, packetLength);
        //打印发送方信息
        System.out.println("发送方的IP:"+packet.getSocketAddress()+"发送方的port："+packet.getPort());
        System.out.println("收到了："+s);
    }
}
