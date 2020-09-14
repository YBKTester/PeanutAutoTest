package com.bink.lesson09.day14.reflect;

/**
 * @author yangbingkun
 * 2020/9/14 --4:51 下午
 */
public class Student {
    public String name;
    public int age;

    public void sleep() {
        System.out.println("sleep...");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
