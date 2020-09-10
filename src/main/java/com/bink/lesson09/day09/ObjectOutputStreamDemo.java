package com.bink.lesson09.day09;

import com.bink.lesson09.day08.Person;

import java.io.*;

/**
 * @author yangbingkun
 * 2020/9/8 --5:26 下午
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        序列化操作
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Out/person.txt"));
        oos.writeObject(new Person("小美女", 18));
        oos.close();
//        反序列化：从文本中读取类对象信息
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Out/person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);

        Person person = (Person) o;
        System.out.println(person.getName() + person.getAge());
    }
}
