package com.bink.lesson.lesson03;

/**
 * @author yangbingkun
 * 2020/7/27 --2:14 下午
 */
public class Cat extends Animal {
    int number = 20;

    @Override
    public void method() {
        System.out.println("自雷方法！");
    }

    @Override
    public void show() {
        System.out.println(this.number);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }

    public void catches() {
        System.out.println("猫抓老鼠！");
    }
}
