package com.bink.lesson.day0811;

/**
 * 主线程/单线程
 * 抢占式调度
 *
 * @author yangbingkun
 * 2020/8/11 --3:18 下午
 */
public class ThreadDemo {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("Bink");
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new MyThread("Wang").start();
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
        System.out.println(Thread.currentThread().getName());
    }
}
