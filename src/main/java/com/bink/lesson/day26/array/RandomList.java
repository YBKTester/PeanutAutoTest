package com.bink.lesson.day26.array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author yangbingkun
 * 2020/7/21 --3:36 下午
 */
public class RandomList {
    public static void main(String[] args) {
        int randomTime = 10;
        int randomMax = 10;
        ArrayList<Integer> arrayList = new ArrayList<>(randomTime);

        Random random = new Random();
        for (int i = 0; i < randomTime; i++) {
            int randomNub = random.nextInt(randomMax);
            arrayList.add(randomNub);
        }
        ArrayList<Integer> arrayList2 = getDoubleNumber(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList2);
        System.out.println(arrayList2.size());
    }

    /**
     * @param arrayList 待处理数组
     * @return 新的偶数数组
     */
    public static ArrayList<Integer> getDoubleNumber(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayListDouble = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                arrayListDouble.add(integer);
            }
        }
        return arrayListDouble;
    }
}
