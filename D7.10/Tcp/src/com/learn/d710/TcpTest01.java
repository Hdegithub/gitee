package com.learn.d710;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TcpTest01 {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("hostname" + localHost.getHostName());
            System.out.println("hostAddress" + localHost.getHostAddress());
            //根据域名获取IP
            InetAddress baidu = InetAddress.getByName("www.baidu.com");
            System.out.println(baidu.getHostName());
            System.out.println(baidu.getHostAddress());
            //ping功能
            byte[] ipbytes = {(byte) 192, (byte) 168, 124, 13};
            InetAddress byAddress = InetAddress.getByAddress(ipbytes);
            boolean isreachable = byAddress.isReachable(2000);
            System.out.println("ping:192.168.124.13是否畅通" + isreachable);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
