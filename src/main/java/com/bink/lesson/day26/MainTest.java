package com.bink.lesson.day26;

import java.util.Random;

/**
 * @author yangbingkun
 * 2020/7/20 --5:10 下午
 */
public class MainTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(2));
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandom(10));
        }

    }


    /**
     * @param a int
     * @return int
     */
    public static int getRandom(int a) {
        return new Random().nextInt(a) + 1;
    }
}
