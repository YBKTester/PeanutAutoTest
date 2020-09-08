package com.bink.lesson.day0821.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yangbingkun
 * 2020/8/25 --5:17 下午
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        long before = System.currentTimeMillis();
//            读取源文件
        FileInputStream in = new FileInputStream("/Users/yangbingkun/Desktop/WorkSpace/MyCode/PeanutTest/src/main/resources/身份证复印.pdf");
//            写入新文件
        FileOutputStream out = new FileOutputStream("/Users/yangbingkun/Desktop/WorkSpace/MyCode/PeanutTest/src/main/java/com/bink/lesson/day0821/身份证复印件.pdf");
        int len = 0;
        byte[] bytes = new byte[1024];


        while ((len = in.read(bytes)) != -1) {
            System.out.println(len);
            out.write(bytes, 0, len);
        }
        out.close();
        in.close();
        long after = System.currentTimeMillis();
        System.out.println(after - before + "ms");
    }
}
