package com.bink.lesson.day0810.throwable.exception;

import java.util.List;

/**
 * @author yangbingkun
 * 2020/8/11 --10:04 上午
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        tryMethod();
        int[] arr = {1, 2, 3};

        List<Integer> list = List.of(1, 2, 3);
        try {
            System.out.println(arr[3]);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    private static void tryMethod() {

    }
}
