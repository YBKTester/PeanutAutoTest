package com.bink.lesson09.day14.stream;

/**
 * @author yangbingkun
 * 2020/9/14 --2:42 下午
 */
public class Person {
    private String name;

    public void printUpper(String s) {
        System.out.println(s.toUpperCase());
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
