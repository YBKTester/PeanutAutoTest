package com.bink.lesson.day26.statictest;

/**
 * @author yangbingkun
 * 2020/7/22 --4:22 下午
 */
public class MainTest {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 18);
        Student two = new Student("黄蓉", 18);
        Student.classRoom = 101;
        System.out.println(Student.classRoom);
        System.out.println(one.getId());
        System.out.println(two.getId());
        Student.methodStatic();
        one.method();
    }
}
