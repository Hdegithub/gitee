package com.learn.javaSE2.SE;

import java.io.*;
import java.net.Socket;

public class ClientReader implements Runnable {
    private Socket socket;
    private ClientChat clientChat;

    public ClientReader(Socket socket, ClientChat clientChat) {
        this.socket = socket;
        this.clientChat = clientChat;
    }

    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(this.socket.getInputStream());
            while (true) {
                while (true) {
                    int msgType = dis.readInt();
                    switch (msgType) {
                        case 1:
                            String allNickName = dis.readUTF();
                            String[] allNickNames = allNickName.split("003197♣♣㏘♣④④♣");
                            this.clientChat.onLineUsers.setListData(allNickNames);
                    }
                }
            }
        } catch (IOException var5) {
            System.out.println("发生异常" + var5.getMessage());
            var5.printStackTrace();
        }
    }
}
