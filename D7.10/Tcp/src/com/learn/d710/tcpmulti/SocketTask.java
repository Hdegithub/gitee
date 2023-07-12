package com.learn.d710.tcpmulti;

import java.net.Socket;

public class PoolTask implements  Runnable{
    private Socket socket;

    public PoolTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
