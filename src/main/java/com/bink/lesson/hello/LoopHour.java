package com.bink.lesson.hello;

import java.util.Arrays;

/**
 * @author yangbingkun
 * 2020/7/20 --3:16 下午
 */
public class LoopHour {
    private static final int HOUR_MAX = 24;
    private static final int MINUTES_MAX = 60;

    public static void main(String[] args) {
//        for (int hour = 0; hour < HOUR_MAX; hour++) {
//
//            for (int minutes = 0; minutes < MINUTES_MAX; minutes++) {
//                System.out.println(hour + "点" + minutes + "分");
//            }
//
//        }
        int[] a = new int[]{1, 2, 5, 0};
        printArray(a);

        int[] v = calc(1, 3, 5);
        printArray(v);
        printArray(calc(6, 6, 6));

        int[] array = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(array));
    }


    /**
     * 打印数组方法
     *
     * @param a int数组
     */
    static void printArray(int[] a) {
        for (int value : a) {
            System.out.println(value);
        }
    }

    static int[] calc(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return new int[]{
                sum, avg
        };
    }


}
