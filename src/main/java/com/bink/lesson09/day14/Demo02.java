package com.bink.lesson09.day14;

import java.util.stream.Stream;

/**
 * @author yangbingkun
 * 2020/9/14 --2:37 下午
 */
public class Demo02 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("迪丽热巴", "宋远桥", "苏星河", "石破天", "石中玉", "老子", "庄子", "洪七公");
        Stream<String> stream2 = Stream.of("古力娜扎", "张无忌", "赵丽颖", "张三丰", "尼古拉斯赵四", "张扬", "张子枫", "洪七公");
        Stream<String> limit = stream1.filter(name -> name.length() == 3).limit(3);
        Stream<String> skip = stream2.filter(name -> name.startsWith("张")).skip(2);
        Stream.concat(limit, skip).forEach(name -> System.out.println(new Person(name)));
//        Stream.concat(limit, skip).map(name -> new Person(name)).forEach(System.out::println);
    }
}
