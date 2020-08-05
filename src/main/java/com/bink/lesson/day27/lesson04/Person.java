package com.bink.lesson.day27.lesson04;

/**
 * @author yangbingkun
 * 2020/7/27 --3:33 下午
 */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "Bink";
    }

    public String getName() {
        return name;
    }
}
