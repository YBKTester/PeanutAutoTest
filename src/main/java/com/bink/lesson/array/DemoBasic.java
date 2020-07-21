package com.bink.lesson.array;

import java.util.ArrayList;
import java.util.Random;

/**
 * byte     Byte
 * short    Short
 * int      Integer
 * long     Long
 * float    Float
 * double   Double
 * char     Character
 * boolean  Boolean
 *
 * @author yangbingkun
 * 2020/7/21 --2:49 下午
 */
public class DemoBasic {
    public static void main(String[] args) {
        int randomTime = 7;
        ArrayList<Integer> arrayList = new ArrayList<>(randomTime);
        Random random = new Random();

        int randomMax = 35;
        for (int i = 0; i < randomTime; i++) {
            int randomNumber = random.nextInt(randomMax) + 1;
            if (!arrayList.contains(randomNumber)) {
                arrayList.add(randomNumber);
            } else {
                randomTime++;
            }
        }
        System.out.println(arrayList);
        arrayList.forEach(System.out::println);
    }
}
