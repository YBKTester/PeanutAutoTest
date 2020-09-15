package com.bink.lesson09.day15.test;

/**
 * @author yangbingkun
 * 2020/9/15 --4:11 下午
 */
public class Calculator {
    @Check
    public void add() {
        System.out.println("1 + 0 = " + (1));
    }

    @Check
    public void sub() {
        System.out.println("1 - 0 = " + (1));
    }

    @Check
    public void mul() {
        System.out.println("1 * 0 = " + (0));
    }

    @Check
    public void div() {
        System.out.println("1 / 0 = " + (1/0));
    }

    public void show() {
        System.out.println("永无bug。。。");
    }
}
