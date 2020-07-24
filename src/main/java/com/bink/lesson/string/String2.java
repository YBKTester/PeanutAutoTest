package com.bink.lesson.string;

import java.util.Scanner;

/**
 * @author yangbingkun
 * 2020/7/22 --4:00 下午
 */
public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String input = scanner.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母有：" + countUpper + "个！");
        System.out.println("小写字母有：" + countLower + "个！");
        System.out.println("数字字符有：" + countNumber + "个！");
        System.out.println("其他字符有：" + countOther + "个！");
    }
}
