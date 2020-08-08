package com.bink.lesson.day0805;

import java.util.LinkedList;

/**
 * 底层是链表结构：查询慢，增删快，大量操作首位元素的方法
 *
 * @author yangbingkun
 * 2020/8/5 --5:13 下午
 */
public class LinkedListDemo {


    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println("===============");
        list.addFirst("www");
        System.out.println(list);
        System.out.println("===============");
        list.push("http");
        System.out.println(list);
        System.out.println("===============");
        list.addLast(".com");
        System.out.println(list);
        System.out.println("===============");
    }
}
