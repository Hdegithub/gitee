package com.learn.javaSE2.SE;

import java.io.*;
import java.net.Socket;
import java.util.Collection;

public class ServerRunnable implements Runnable {
    /**
     * 指向当前连接的对方socket(客户端socket)
     */
    private Socket clientSocket;

    public ServerRunnable(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (InputStream ips = clientSocket.getInputStream();
             OutputStream ops = clientSocket.getOutputStream();
             DataInputStream dis = new DataInputStream(ips);
        ) {
            while (true) {
                //消息类型
                int msgType = dis.readInt();
                switch (msgType) {
                    case ChatConstants.MSG_TYPE_LOGIN:
                        //登陆消息
                        String nickName = dis.readUTF();
                        System.out.println("login : " + clientSocket.getRemoteSocketAddress() + " nick:" + nickName);
                        ServerChat.onLineSocketMap.put(clientSocket, nickName);
                        //广播大厅所有人名字
                        //1.拿到所有人名字发出去
                        //2.发出去
                        StringBuilder stringBuilder = new StringBuilder();
                        Collection<String> username = ServerChat.onLineSocketMap.values();
                        for (String names : username) {
                            stringBuilder.append(names + ChatConstants.SPILIT);
                        }
                        stringBuilder.substring(0, stringBuilder.lastIndexOf(ChatConstants.SPILIT));
                        sendMsgtoAll(stringBuilder.toString());
                        break;
                    case ChatConstants.MSG_TYPE_CHAT:
                        break;
                }

            }
        } catch (IOException e) {
            System.out.println("发生异常" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void sendMsgtoAll(String msg) {
        ServerChat.onLineSocketMap.forEach((socket, nick) -> {
            try {
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeInt(ChatConstants.MSG_TYPE_LOGIN);
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
