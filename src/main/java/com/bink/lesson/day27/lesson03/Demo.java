package com.bink.lesson.day27.lesson03;

/**
 * @author yangbingkun
 * 2020/7/27 --2:14 下午
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();


        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catches();
        }
    }
}
