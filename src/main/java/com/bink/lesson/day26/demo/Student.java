package com.bink.lesson.day26.demo;

import org.springframework.stereotype.Component;

/**
 * Java Bean
 * 1、成员变量（私有）
 * 2、Getter/Setter
 * 3、无参构造方法
 * 4、全参构造方法
 *
 * @author yangbingkun
 * 2020/7/21 --10:07 上午
 */
@Component
public class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
