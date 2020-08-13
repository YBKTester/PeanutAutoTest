package com.bink.lesson.day0811;

/**
 * @author yangbingkun
 * 2020/8/11 --5:24 下午
 */
public class MyTest implements Runnable {
    private int tickets = 100;
    final Object object = new Object();

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while (tickets > 0) {
//            synchronized (object) {
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + "===>>正在卖第" + tickets + "张票！");
//                    tickets--;
//                }
//
//            }
            payTickets();
        }

    }

    /**
     * 同步方法
     * 锁的对象是this
     */
    public synchronized void payTickets() {
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
