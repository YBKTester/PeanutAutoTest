package com.bink.lesson.day27.lesson04;

/**
 * @author yangbingkun
 * 2020/7/27 --2:52 下午
 */
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘！");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘！");
    }

    public void type() {
        System.out.println("键盘输入！");
    }
}
