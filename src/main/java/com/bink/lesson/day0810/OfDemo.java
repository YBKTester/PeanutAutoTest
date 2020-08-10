package com.bink.lesson.day0810;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * List,Set,Map
 * static <E> list<E> of(E...elements)
 * 使用of()一次性给集合添加多个元素
 * 使用前提：
 * 1、当集合中的元素个数已经确定；不再改变时使用
 * 2、只适用于以上三种集合；不适用于接口的实现类
 * 3、返回值为一个不可改变的集合；不能再使用add(),put()
 * 4、Set、Map接口调用of()方法时，不能有重复的元素；否则会抛出异常
 *
 * @author yangbingkun
 * 2020/8/10 --1:47 下午
 */
public class OfDemo {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        List<String> list = List.of("1", "2", "3");
        System.out.println(list);
//        list.add("3");
//        System.out.println(list);
    }

    private static void show02() {
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        System.out.println(set);
    }

    private static void show01() {
        Map<String, Integer> map = Map.of("yi", 1, "er", 2);
        System.out.println(map);
    }
}
