package com.bink.lesson.day0813.file;

import java.io.File;

/**
 * java.io.File
 * 与系统无关
 * 创建、删除、获取、判断、遍历、大小
 * file、directory、path
 * 绝对路径、相对路径
 *
 * @author yangbingkun
 * 2020/8/13 --2:25 下午
 */
public class FileUtils {
    public static void main(String[] args) {
//        路径分隔符
        System.out.println(File.pathSeparator);
//        文件名称分隔符
        System.out.println(File.separator);
//        C:/develop/a/a.txt
        String path = "C" + File.pathSeparator + File.separator + "develop" + File.separator + "a" + File.separator + "a.txt";
        System.out.println(path);

        file01();
        file02("root", "hello");
        file03();
    }

    private static void file03() {
        File parent = new File("C://");
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

    private static void file02(String parent, String child) {
//        String parent
//        String child

        File file = new File(parent, child);
        System.out.println(file);
        System.out.println(file.getParent());
        System.out.println();

    }

    private static void file01() {
        //路径
        File file = new File("root//hello");
        System.out.println(file);
    }

}
