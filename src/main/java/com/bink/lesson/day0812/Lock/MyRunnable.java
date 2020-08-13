package com.bink.lesson.day0812.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yangbingkun
 * 2020/8/12 --10:29 上午
 */
public class MyRunnable implements Runnable {
    static int tickets = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (tickets > 0) {

            lock.lock();
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName() + "===>>正在卖第" + tickets + "张票！");
                tickets--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }


        }
    }


}
