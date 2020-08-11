package com.bink.lesson.day0810.throwable.exception;

import java.io.FileNotFoundException;

/**
 * RuntimeException可以不需要处理
 * 编译异常必须处理
 *
 * @author yangbingkun
 * 2020/8/11 --9:57 上午
 */
public class ThrowsDemo {
    private static final String FILE_NAME = "c:\\a.txt";

    public static void main(String[] args) {
        try {
            readFile("FILE_NAME");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("=================");
            System.out.println(e.toString());
            System.out.println("=================");
            e.printStackTrace();
            System.out.println("文件路径错误！");
        } finally {
            /*
            资源释放
             */
            System.out.println("一定会执行的代码！");
        }
        System.out.println("后续代码！");
    }

    private static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals(FILE_NAME)) {
            throw new FileNotFoundException("文件路径错误！不是" + FILE_NAME);
        }
        System.out.println("路径正确，开始读取文件！！！");
    }
    /*
    Throwable
        String getMessage()     简短描述
        String toString()       详细信息
        void printStackTrace()  最全信息，JVM默认使用
     */
}
