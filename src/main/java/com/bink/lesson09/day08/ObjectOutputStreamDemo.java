package com.bink.lesson09.day08;

import java.io.*;

/**
 * @author yangbingkun
 * 2020/9/8 --5:26 下午
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        序列化操作
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Out/person.txt"));
        oos.writeObject(new Person("小美女", 18));
        oos.close();

    }
}
