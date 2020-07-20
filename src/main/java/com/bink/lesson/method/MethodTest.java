package com.bink.lesson.method;

/**
 * 方法
 *
 * @author yangbingkun
 * 2020/7/20 --3:26 下午
 */
public class MethodTest {


    /**
     * 求和
     *
     * @param a 第一个
     * @param b 第二个
     * @return int
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 4));
    }
}
