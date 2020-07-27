package com.bink.lesson;

import com.bink.lesson.demo.Person;
import com.bink.lesson.demo.Phone;
import com.bink.lesson.demo.Student;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yangbingkun
 * 2020/7/20 --5:10 下午
 */
public class MainTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(2));
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandom(10));
        }

    }


    //    public static Scanner methodReturn() {
//        return new Scanner(System.in);
//    }

    /**
     * @param a int
     * @return int
     */
    public static int getRandom(int a) {
        return new Random().nextInt(a) + 1;
    }
}
