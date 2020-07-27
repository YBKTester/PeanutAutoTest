package com.bink.lesson.lesson03;

/**
 * @author yangbingkun
 * 2020/7/27 --2:14 下午
 */
public class Animal {
    int number = 10;

    public void method() {
        System.out.println("弗雷方法！");
    }

    public void methodFu() {
        System.out.println("弗雷特有方法");
    }

    public void show() {
        System.out.println(this.number);
    }

    public void eat() {
        System.out.println("动物吃东西！");
    }
}
