package com.learn.stream;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt");) {

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello");
            bw.newLine();
            bw.write("测试");
            for (int i = 0; i < 10; i++) {
                bw.write("你好" + i);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
