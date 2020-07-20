package com.bink.lesson.hello;

/**
 * @author yangbingkun
 * 2020/7/20 --2:07 下午
 */
public class LoopTest {
    public static int num = 10;

    /**
     * For循环4因素：
     * <p>
     * 1、初始化语句
     * 2、判断语句
     * 3、循环语句
     * 4、步进语句
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        for (int i = 0; i < num; i++) {
            System.out.println("我错了。。。i" + i);
        }
//        初始化语句
        int n = 0;
        while (n < num) {
//            循环体
            System.out.println("我错了。。。n" + n);
//            步进语句
            n++;
        }
        int m = num;
        do {
            System.out.println("我错了。。。m" + m);
            m--;
        } while (m > 0);


        for (int x = 0; x < 20; x++) {
            if (x == 4 || x == 13 || x == 14) {
                continue;
            }
            System.out.println(x + "层到了。");
        }
    }
}
