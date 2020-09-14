package com.bink.lesson09.day13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangbingkun
 * 2020/9/13 --10:06 上午
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张华");
        list.add("李秋水");
        list.stream()
                .filter(name -> name.length() == 2)
                .filter(name -> name.startsWith("张"))
                .forEach(System.out::println);
    }
}
