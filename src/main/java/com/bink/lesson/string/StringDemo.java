package com.bink.lesson.string;

/**
 * 1、字符串不可改变；
 * 2、字符串共享使用；
 * 3、效果是相当于char[],底层是byte[]
 *
 * @author yangbingkun
 * 2020/7/21 --4:14 下午
 */
public class StringDemo {
    /**
     * 创建字符串的方法：
     * 1、public String()
     * 2、public String(char[] array)
     * 3、public String(byte[] array)
     */
    public static void main(String[] args) {
        String string = new String();
        System.out.println(string);

        char[] chars = {'A', 'B', 'C'};
        String str2 = new String(chars);
        System.out.println(str2);
        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println(str3);
        String str = "Bink";
        int length = "alasdair's".length();
        System.out.println(length);
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }


}
