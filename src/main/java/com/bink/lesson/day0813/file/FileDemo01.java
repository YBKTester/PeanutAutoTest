package com.bink.lesson.day0813.file;

import java.io.File;
import java.io.IOException;

/**
 * @author yangbingkun
 * 2020/8/13 --3:07 下午
 */
public class FileDemo01 {
    public static void main(String[] args) {

//        show01();
        show02();
    }

    private static void show02() {
        String path = "file";
        File file = new File(path);
        boolean made = false;
        try {
            made = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(made);
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
    }

    private static void show01() {
        String path = "/Users/yangbingkun/Desktop/WorkSpace/MyCode/PeanutTest/src/main/resources/身份证复印.pdf";

        File file = new File(path);
        System.out.println("文件/路径的据对路径：" + file.getAbsolutePath());
//        System.out.println(file.getAbsolutePath());
//        File file2 = new File("/Users/yangbingkun/Downloads/身份证复印.pdf");
//        System.out.println(file2.getAbsolutePath());
//        System.out.println(file2.length());
//        System.out.println(file2.getName());
        System.out.println("文件长度：" + file.length());
        System.out.println("文件/路径是否存在：" + file.exists());
        if (file.exists()) {
            System.out.println("是否目录：" + file.isDirectory());
            System.out.println("是否文件：" + file.isFile());
        }
    }
}
