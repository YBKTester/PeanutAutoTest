package com.bink.lesson.day0812;

/**
 * @author yangbingkun
 * 2020/8/12 --3:26 下午
 */
public class WaitNotify {
    public static void main(String[] args) {
        Object object = new Object();
        new Thread(() -> {
            synchronized (object) {
                System.out.println("顾客1--告知老板要的包子种类和数量！");
                try {
                    System.out.println("主动放开CPU，进入无限等待状态！");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("顾客1包子已经做好了，开吃！");
            }
        }).start();
        new Thread(() -> {
            synchronized (object) {
                System.out.println("顾客2--告知老板要的包子种类和数量！");
                try {
                    System.out.println("主动放开CPU，进入无限等待状态！");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("顾客2包子已经做好了，开吃！");
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("新的线程拿到执行权，开始执行！！");
                System.out.println("开始做包子！");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object) {
                System.out.println("老板已做好包子！告知顾客，可以吃了！");
                System.out.println("该线程执行结束！");
                System.out.println("开始唤醒等待中的线程！");
                object.notifyAll();
            }
        }).start();
    }
}
