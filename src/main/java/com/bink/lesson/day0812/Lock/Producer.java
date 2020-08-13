package com.bink.lesson.day0812.Lock;

/**
 * 包子铺
 *
 * @author yangbingkun
 * 2020/8/12 --4:00 下午
 */
public class Producer extends Thread {
    private Baozi bz;

    public Producer(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag==false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            被唤醒之后执行
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生成" + bz.toString());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子已经生产好了" + bz.toString());
                System.out.println("可以开始吃了！");
            }
        }
    }
}
