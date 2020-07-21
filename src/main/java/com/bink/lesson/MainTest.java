package com.bink.lesson;

import com.bink.lesson.demo.Person;
import com.bink.lesson.demo.Phone;
import com.bink.lesson.demo.Student;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yangbingkun
 * 2020/7/20 --5:10 下午
 */
public class MainTest {
    public static void main(String[] args) {
//        Phone phone = new Phone("", 20.2, "");
//        phone.setBrand("苹果");
//        phone.setPrice(8848.00);
//        phone.setColor("绿色");
//        phone.call("Bink");
//        phone.sendMessage();
//
//        Person person = new Person();
//        person.name = "王健林";
//        person.sayHello("王思聪");
//        Student student1 = new Student();
//        student1.setName("迪丽热巴");
//        student1.setAge(18);
//        student1.setSex("女");
//        System.out.println(student1.toString());
//        new Student().setName("高圆圆");
//        System.out.println(new Student("杨超越", 18, "女").getName());
//        Scanner scanner = methodReturn();
//        int x = scanner.nextInt();
//        System.out.println(x);
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(2));
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandom(10));
        }

    }


    //    public static Scanner methodReturn() {
//        return new Scanner(System.in);
//    }

    /**
     * @param a int
     * @return int
     */
    public static int getRandom(int a) {
        return new Random().nextInt(a) + 1;
    }
}
