package com.bink.lesson.day0811;

/**
 * @author yangbingkun
 * 2020/8/11 --4:15 下午
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
