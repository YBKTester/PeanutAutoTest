package com.bink.lesson.day0810;

import java.util.Objects;

/**
 * @author yangbingkun
 * 2020/8/10 --10:29 上午
 */
public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "名字是：'" + name + '\'' +
                ",年龄是：" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name, int age) {
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
}
