package com.bink.lesson09.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author yangbingkun
 * 2020/9/10 --5:25 下午
 */
public class Demo2 {
    public static Comparator<String> getComparator() {
        return Comparator.comparingInt(String::length);
    }

    public static int getMaxInt(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        String[] arr = {"asd", "asgasgf", "asdasd"};
        int[] arrInt = {1, 2, 3, 4, 5, 6};
        int x = getMaxInt(() -> {
            int maxInt = arrInt[0];
            for (int i : arrInt) {
                if (i > maxInt) {
                    maxInt = i;
                }
            }
            return maxInt;
        });
        System.out.println(x);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));


        method("赵丽颖", (String name) -> {
            System.out.println(name);
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
