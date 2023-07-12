package com.learn.d710.tcp;

import com.learn.d710.tcpmulti.SocketTask;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class TcpserverwithpoolTest {
    private static ExecutorService threadpool = new ThreadPoolExecutor(10, 30,
            20, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        //用线程池提高资源利用率
        int port = 9999;

        try (ServerSocket serverSocket = new ServerSocket(port);) {
            System.out.println("server启动:" + port);
            while (true) {
                Socket socket = serverSocket.accept();
                String cname = socket.getInetAddress().getHostAddress() + " " + socket.getPort();
                System.out.println("有人连接上了 " + cname);
                threadpool.execute(new SocketTask(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
