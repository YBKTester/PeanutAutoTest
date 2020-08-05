package com.bink.lesson.day26.array;

import java.util.ArrayList;

/**
 * @author yangbingkun
 * 2020/7/21 --3:13 下午
 */
public class DemoArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(10);
        arr.add(11);
        arr.add(1);
        print(arr);
    }

    /**
     * 特定格式打印数组方法
     *
     * @param array 待处理数组
     */
    public static void print(ArrayList<Integer> array) {
        System.out.print("{");
        for (int i = 0; i < array.size(); i++) {
            if (i != 0) {
                System.out.print("@");
            }
            System.out.print(array.get(i));
        }
        System.out.print("}");
    }
}
