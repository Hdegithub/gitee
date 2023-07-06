package com.learn.stream;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("D:\\Java单词.txt");
                FileOutputStream fos = new FileOutputStream("C:\\");) {
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int len = -1;
            byte[] buffer = new byte[300];
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
