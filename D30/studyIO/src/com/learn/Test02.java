package com.learn;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        searchFile(new File("D:\\mylib"), "lib");
    }

    //dir(在哪个目录中搜素)tosearchName(要搜索的名字)
    public static void searchFile(File dir, String tosearchName) {
        if (dir != null && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                //说明不是一个空文件夹
                for (File file : files) {
                    String filename = file.getName();
                    if (file.isFile()) {
                        //遇到文件判断名字
                        if (file.getName().contains(tosearchName)) {
                            System.out.println(file.getAbsolutePath());
                        }
                    } else if (file.isDirectory()) {
                        searchFile(file, tosearchName);
                    }
                }
            }
        }
    }
}
