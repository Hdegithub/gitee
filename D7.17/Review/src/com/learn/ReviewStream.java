package com.learn;

import java.io.*;

public class ReviewStream {
    public static void main(String[] args) {
        File file=new File("D:\\Java单词.txt");
        File file1=new File("D:\\Review.txt");
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(file1);
            ) {
                BufferedInputStream bis = new BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                byte[] buf = new byte[1024];
                int len = -1;
                while ((len = bis.read(buf)) != -1) {
                    bos.write(buf, 0, len);
                }
                bos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
