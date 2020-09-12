package com.bink.lesson09.day12;

import java.util.function.Predicate;

/**
 * @author yangbingkun
 * 2020/9/12 --3:33 下午
 */
public class Demo {
    /**
     * 判断字符串
     *
     * @param string    待处理的字符串
     * @param predicate 函数接口
     * @return 判断结果
     */
    public static boolean test(String string, Predicate<String> predicate) {
        return predicate.test(string);
    }

    /**
     * 判断字符串
     *
     * @param string     待处理的字符串
     * @param predicate1 第一次判断
     * @param predicate2 第二次判断
     * @return 返回2次判断的结果和
     */
    public static boolean checkString(String string, Predicate<String> predicate1, Predicate<String> predicate2) {
//        return predicate1.test(string) && predicate2.test(string);
//        return predicate1.test(string) && !predicate2.test(string);
//        return predicate1.and(predicate2).test(string);
//        return predicate1.test(string) || predicate2.test(string);
//        return predicate1.or(predicate2).test(string);
//        结果取反
        return predicate1.negate().test(string);

    }

    public static void main(String[] args) {
        String string = "Hello";
        boolean test = test(string, testString -> testString.length() > 5);
        System.out.println(test);

        boolean e = checkString(string, s1 -> s1.length() > 4, s2 -> s2.contains("e"));
        System.out.println(e);
    }
}
