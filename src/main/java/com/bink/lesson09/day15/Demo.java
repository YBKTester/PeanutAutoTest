package com.bink.lesson09.day15;

/**
 * @author yangbingkun
 * 2020/9/15 --2:44 下午
 */
public class Demo {
    @Deprecated
    public void say() {
        System.out.println("say...");
    }


    public void sayHello() {
        System.out.println("sayHello...");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void demo() {
        say();
    }
}
