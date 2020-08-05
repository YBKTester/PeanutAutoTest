package com.bink.lesson.day26.method;

import com.bink.lesson.day26.demo.Phone;

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

    public static Phone getPhone() {
        return new Phone("Apple", 2000.02, "Green");
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(getPhone().toString());
    }
}
