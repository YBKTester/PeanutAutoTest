package com.bink.lesson.day0812.Lock;

/**
 * @author yangbingkun
 * 2020/8/12 --4:00 下午
 */
public class Consumer extends Thread {
    private Baozi bz;

    public Consumer(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag==true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("正在吃包子" + bz.toString());
                bz.flag = false;
                bz.notify();
                System.out.println("已经吃完了" + bz.toString());
                System.out.println("请继续生产包子！");
                System.out.println("***************************");
            }
        }
    }
}
