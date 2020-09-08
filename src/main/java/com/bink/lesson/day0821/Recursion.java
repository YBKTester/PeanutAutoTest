package com.bink.lesson.day0821;

/**
 * 递归
 *
 * @author yangbingkun
 * 2020/8/21 --3:57 下午
 */
public class Recursion {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);

    }

    private static int sum(int i) {
        System.out.println("A方法！: " + i);
        if (i == 1) {
            return 1;
        }
        return i + sum(--i);
    }
}
