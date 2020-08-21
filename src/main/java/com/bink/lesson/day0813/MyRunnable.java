package com.bink.lesson.day0813;

/**
 * @author yangbingkun
 * 2020/8/13 --9:08 上午
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新的线程创建了！");
    }
}
