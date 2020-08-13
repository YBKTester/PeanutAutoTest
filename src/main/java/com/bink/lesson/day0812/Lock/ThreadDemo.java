package com.bink.lesson.day0812.Lock;

/**
 * @author yangbingkun
 * 2020/8/12 --10:32 上午
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
