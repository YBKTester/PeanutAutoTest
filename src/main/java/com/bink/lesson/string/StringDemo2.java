package com.bink.lesson.string;

/**
 * @author yangbingkun
 * 2020/7/22 --3:38 下午
 */
public class StringDemo2 {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===================");

        byte[] bytes = "abc".getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        System.out.println("===================");

        String string1 = "How Do You Do?";
        String string2 = string1.replace("o", "*");
        System.out.println(string1);
        System.out.println(string2);

        String string3 = "aaa,bbb,ccc";
        String[] strings = string3.split(",");
        for (String string : strings) {
            System.out.println(string);
        }


        int[] arr = {1, 2, 3};
        System.out.println("[");
        StringBuilder string = new StringBuilder("[");
        for (int value : arr) {
            string.append(value).append("#");
        }
        System.out.println("]");
    }

}
