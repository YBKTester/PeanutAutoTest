package com.bink.lesson.day26.utils;

import org.junit.Assert;

import java.util.Arrays;

/**
 * @author yangbingkun
 * 2020/7/23 --3:54 下午
 */
public class DemoArrays {
    public static void main(String[] args) {
        int[] intArray = {110, 20, 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        Assert.assertEquals(2, sum(1, 1));
        String stringStr = "asdhoahfahgasdoaf";
        char[] chars = stringStr.toCharArray();
//        升序排列
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {


        }

    }

    /**
     * 加法方法
     *
     * @param x 第一个加数
     * @param y 第二个加数
     * @return int和
     */
    public static int sum(int x, int y) {
        return x + y;
    }


}
