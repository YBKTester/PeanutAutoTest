package com.bink.lesson.day0803;

/**
 * @author yangbingkun
 * 2020/8/3 --5:25 下午
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("World");
        System.out.println(builder);
        StringBuilder kunKun = new StringBuilder("KunKun");
        builder.append(kunKun);
        System.out.println(builder);
        System.out.println();
    }
}
