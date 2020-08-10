package com.bink.lesson.day0809;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author yangbingkun
 * 2020/8/9 --7:52 上午
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1));
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 12, 3, 4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }

    /**
     * 计算0-n个树的和
     *
     * @param numbers 可变参数数组
     * @return int
     */
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
