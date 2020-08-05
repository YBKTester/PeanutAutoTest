package com.bink.lesson.day26.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yangbingkun
 * 2020/7/21 --11:03 上午
 */
public class RandomGame {
    public static void main(String[] args) {

        int maxInt = 100;
        Random random = new Random();
//        1-100
        int goal = random.nextInt(maxInt) + 1;
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.println("请输入一个数字： ");
            int anInt = scanner.nextInt();
            count++;
            if (anInt > goal) {
                System.out.println("你输入的数字太大了！");
            } else if (goal == anInt) {
                break;
            } else {
                System.out.println("你输入的数字太小了！");
            }
        }
        System.out.println("你猜对了！" + "共猜了   " + count + "次！");

    }
}
