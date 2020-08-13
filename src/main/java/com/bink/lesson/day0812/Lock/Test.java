package com.bink.lesson.day0812.Lock;

/**
 * @author yangbingkun
 * 2020/8/12 --4:31 下午
 */
public class Test {
    public static void main(String[] args) {
        Baozi bz = new Baozi();

        new Producer(bz).start();
        new Consumer(bz).start();
    }
}
