package com.bink.lesson09.day11;

import java.util.function.Consumer;

/**
 * @author yangbingkun
 * 2020/9/11 --10:45 上午
 */
public class Demo {
    public static void and(String string, Consumer<String> consumer1, Consumer<String> consumer2) {
//        consumer1.accept(string);
//        consumer2.accept(string);
        consumer1.andThen(consumer2).accept(string);
        System.out.println("*******************");
        consumer2.andThen(consumer1).accept(string);
    }

    public static void main(String[] args) {
        String string = "hello";
        and(string,
                (name) -> System.out.println("第一步：" + name.toUpperCase()),
                (name) -> System.out.println("第二步：" + name.toLowerCase()));
    }
}
