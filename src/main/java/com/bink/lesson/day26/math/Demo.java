package com.bink.lesson.day26.math;

/**
 * abs()    绝对值
 * ceil()   向上取整
 * floor()  向下取整
 * round()  四舍五入
 *
 * @author yangbingkun
 * 2020/7/24 --3:21 下午
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(3.14));
        System.out.println(Math.round(3.14));
        System.out.println(Math.PI);
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        System.out.println((int) min);
        System.out.println((int) max);
        for (int i = (int) min; i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
