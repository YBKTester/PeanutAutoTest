package com.bink.lesson.day0812;

/**
 * @author yangbingkun
 * 2020/8/12 --10:29 上午
 */
public class MyRunnable implements Runnable {
    static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            payTicketsStatic();
        }
    }

    public static synchronized void payTicketsStatic() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "===>>正在卖第" + tickets + "张票！");
            tickets--;
        }
    }
}
