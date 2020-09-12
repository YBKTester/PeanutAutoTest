package com.bink.lesson09.day12;

import java.util.function.Function;

/**
 * @author yangbingkun
 * 2020/9/12 --7:56 下午
 */
public class Demo3 {
    public static Integer deal(String string,
                               Function<String, String> func1,
                               Function<String, Integer> func2,
                               Function<Integer, Integer> func3) {
        return func1.andThen(func2).andThen(func3).apply(string);
    }

    public static void main(String[] args) {
        String string = "赵丽颖，20";
        /*
          1、截取数字，得到字符串
          2、字符串转换成int
          3、将int增加100
         */
        Integer deal = deal(string,
                (str) -> str.split("，")[1],
                Integer::parseInt,
                (integer) -> integer + 100);
        System.out.println(deal);
    }
}
