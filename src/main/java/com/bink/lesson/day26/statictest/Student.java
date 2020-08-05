package com.bink.lesson.day26.statictest;

import lombok.Data;

/**
 * @author yangbingkun
 * 2020/7/22 --4:17 下午
 */
@Data
public class Student {
    private String name;
    private int age;
    private int id;
    static int classRoom;
    private static int idCounter = 0;

    public Student() {
        idCounter++;
    }

    public Student(String name, int age) {
        System.out.println("我是全参数构造方法，我开始执行啦！");
        this.name = name;
        this.age = age;
        this.id = ++idCounter;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public static String getClassRoom() {
//        return classRoom;
//    }
//
//    public static void setClassRoom(String classRoom) {
//        Student.classRoom = classRoom;
//    }

    public void method() {
        System.out.println();
    }

    public static void methodStatic() {
        System.out.println();
    }

    static {
        System.out.println("我是静态代码块，我要执行啦！");
        System.out.println("我只执行一次哟！");
    }
}
