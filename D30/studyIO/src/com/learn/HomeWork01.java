package com.learn;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class HomeWork01 {
    public static void main(String[] args) {
        File fileDir = new File("D:\\githejianbo\\banktest");
        File toFile = new File("D:\\lib\\lib");
        searchFile(fileDir, "ATM", toFile);
    }

    //dir(在哪个目录中搜素)tosearchName(要搜索的名字)
    public static void searchFile(File dir, String tosearchName, File outFile) {

        if (dir != null && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                //说明不是一个空文件夹
                try (
                        OutputStream fos = new FileOutputStream(outFile, true);
                ) {
                    for (File file : files) {
                        String filename = file.getName();
                        if (file.isFile()) {
                            //遇到文件判断名字
                            if (file.getName().contains(tosearchName)) {
                                // System.out.println("找到了" + file.getAbsolutePath());
                                String fname = file.getName();
                                String absolutePath = file.getAbsolutePath();
                                fos.write(fname.getBytes(StandardCharsets.UTF_8));
                                fos.write(" ".getBytes(StandardCharsets.UTF_8));
                                fos.write(absolutePath.getBytes(StandardCharsets.UTF_8));
                                fos.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行
                                fos.flush();
                            }
                        } else if (file.isDirectory()) {
                            searchFile(file, tosearchName, outFile);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
