package com.bink.lesson.day0821.io;

import java.io.*;

/**
 * @author yangbingkun
 * 2020/8/21 --4:23 下午
 */
public class IODemo {
    public static void main(String[] args) {
//        FileInputStream
        File file = new File("a.txt");
        try {
            FileOutputStream stream = new FileOutputStream(file);
            FileOutputStream stream2 = new FileOutputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
