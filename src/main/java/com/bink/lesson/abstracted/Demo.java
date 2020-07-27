package com.bink.lesson.abstracted;

/**
 * @author yangbingkun
 * 2020/7/24 --5:09 下午
 */
public class Demo {
    public static void main(String[] args) {
        BaseAnimal a = new Dog();
        a.eat();
        BaseAnimal c = new Cat();
        c.eat();
    }
}
