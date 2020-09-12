package com.bink.lesson09.day12;

import java.util.function.Function;

/**
 * @author yangbingkun
 * 2020/9/12 --5:06 下午
 */
public class FunctionDemo {
    /**
     * 转换数据类型
     *
     * @param s        转换前的数据类
     * @param function Function接口
     */
    public static void change(String s, Function<String, Integer> function) {
        Integer in = function.apply(s);
        System.out.println(in);

    }

    public static void exchange(String string,
                                Function<String, Integer> func1,
                                Function<Integer, String> func2) {
        String res = func1.andThen(func2).apply(string);
        System.out.println(res);
    }

    public static void main(String[] args) {
        String s = "20";
        change(s, Integer::parseInt);
        exchange(s, (string) -> Integer.parseInt(string) + 10,
//                String::valueOf
                i -> i + "");
    }
}
