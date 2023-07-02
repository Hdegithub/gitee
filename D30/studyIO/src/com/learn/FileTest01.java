package com.learn;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        //文件最后修改时间（时间戳转日期）
        File file = new File("D:\\githejianbo\\6.12test");
        long lastModified = file.lastModified();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String time = formatter.format(lastModified);
        System.out.println(time);
    }
}
