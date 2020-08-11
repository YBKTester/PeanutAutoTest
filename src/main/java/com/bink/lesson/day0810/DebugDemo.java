package com.bink.lesson.day0810;

/**
 * @author yangbingkun
 * 2020/8/10 --1:59 下午
 */
public class DebugDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        print();
    }

    private static void print() {
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
    }
}
