package com.learn;

import java.io.*;

public class ByteTest {
    public static void main(String[] args) {
        File file = new File("D:\\d29\\6-29异常和日志框架.pdf");
        File file1 = new File("D:\\IOcopy\\copy");
        InputStream fis = null;
        OutputStream fos = null;
        int count=0;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file1);
            byte[] buffer = new byte[100];
            int len = -1;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("搬运了："+count+"次");
    }
}
