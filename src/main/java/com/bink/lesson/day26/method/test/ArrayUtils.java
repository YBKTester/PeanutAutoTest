package com.bink.lesson.day26.method.test;

/**
 * @author yangbingkun
 * 2020/7/21 --9:47 上午
 */
public class ArrayUtils {
    public static int getMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {11, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(getMax(a));
    }
}
