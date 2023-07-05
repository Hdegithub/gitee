package com.learn;

import java.io.*;

public class HomeWork02 {
    public static void main(String[] args) {
        File fileDir = new File("D:\\dev\\study");
        File toFile = new File("D:\\HomeWork");
        searchFile(fileDir, ".png", toFile);
    }

    public static void searchFile(File dir, String tosearchName, File targetDir) {
        if (dir != null && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                //说明不是一个空文件夹
                for (File file : files) {
                    if (file.isFile()) {
                        //遇到文件判断名字
                        if (file.getName().contains(tosearchName)) {
                             System.out.println("找到了" + file.getAbsolutePath());
                            copyFileToDir(file, targetDir);
                        }
                    } else if (file.isDirectory()) {
                        searchFile(file, tosearchName, targetDir);
                    }
                }
            }
        }
    }

    public static void copyFileToDir(File srcFile, File targetDir) {
        File targetFile = new File(targetDir.getAbsolutePath() + File.separator + srcFile.getName());
        try (
                InputStream fis = new FileInputStream(srcFile);
                OutputStream fos = new FileOutputStream(targetFile);
        ) {
            int len = -1;
            byte[] buffer = new byte[200];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制完成 :" + targetFile.getAbsolutePath());
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
