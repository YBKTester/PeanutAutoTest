package com.bink.lesson09.day09;

import com.bink.lesson09.day08.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangbingkun
 * 2020/9/9 --10:41 上午
 */
public class TestDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Bink1", 18));
        people.add(new Person("Bink2", 19));
        people.add(new Person("Bink3", 20));
        System.out.println(people.toString());
//        序化    存储
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Out/people.txt"));
        oos.writeObject(people);
//        反序化   读取
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Out/people.txt"));
        Object object = ois.readObject();
//      遍历列表
        ArrayList<Person> personArrayList = (ArrayList<Person>) object;
        for (Person person : personArrayList) {
            System.out.println(person);
        }
//      释放资源
        oos.close();
        ois.close();
    }
}
