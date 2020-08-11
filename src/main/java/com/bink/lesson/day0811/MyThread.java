package com.bink.lesson.day0811;

/**
 * @author yangbingkun
 * 2020/8/11 --3:41 下午
 */
public class MyThread extends Thread {
    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
