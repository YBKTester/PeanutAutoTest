package com.bink.lesson.day0803;

/**
 * @author yangbingkun
 * 2020/8/3 --5:14 下午
 */
public class Demo01 {
    public static void main(String[] args) {
//        long t1 = System.currentTimeMillis();
//        System.out.println(System.currentTimeMillis());
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//        long t2 = System.currentTimeMillis();
//        long t3 = t2 - t1;
//        System.out.println(t3 + "ms");
//
//        int[] src = {1, 2, 3, 4, 5};
//        int[] dest = {6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(dest));
//        System.arraycopy(src, 0, dest, 0, 3);
//        System.out.println(Arrays.toString(dest));
//        String[] strings = {"hello", "Bink"};
//        println(strings);
        println("hello", "Bink");
    }


    /**
     * 不定长参数方法
     *
     * @param args 参数
     */
    public static void println(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
