package com.bink.lesson.day0805;


import java.util.ArrayList;
import java.util.List;

/**
 * List特有方法
 * void add(int index,E element)        ：指定元素增加到指定位置
 * E get(int index)                     ：获取指定位置的元素
 * E remove(int index)                  ：移除指定位置的元素
 * E set(int index,E element)           ：元素替换指定位置的元素
 *
 * @author yangbingkun
 * 2020/8/5 --4:38 下午
 */
public class ListDemo {


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("a");
        System.out.println(stringList);
        String s = stringList.get(0);
        System.out.println(s);
        System.out.println("===============");
        for (String string : stringList) {
            System.out.println(string);
        }
        stringList.add(3, "heima");
        System.out.println("===============");
        System.out.println(stringList);
        stringList.remove("c");
        String removed = stringList.remove(2);
        System.out.println(removed);
        System.out.println(stringList);
        String bink = stringList.set(0, "Bink");
        System.out.println(bink);
        System.out.println(stringList);
    }
}
