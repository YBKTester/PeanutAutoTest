package com.bink.lesson.day27.lesson04;

/**
 * @author yangbingkun
 * 2020/7/27 --2:52 下午
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标！");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标！");
    }

    public void click() {
        System.out.println("鼠标点击！");
    }
}
