package com.bink.lesson.enumtest;

import java.awt.Color;

import com.bink.lesson.enumtest.Day2;
import org.testng.annotations.Test;

/**
 * @author yangbingkun
 * 2020/7/20 --10:09 上午
 */
/**
 * 颜色枚举类
 */
//enum Color {
//    /**
//     *
//     */
//    GREEN,
//    /**
//     *
//     */
//    RED,
//    /**
//     *
//     */
//    YELLOW
//}
public class SwitchClass {

    @Test
    public void test1() {
        int i = 20;
        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    @Test
    public void test() {
        for (Day2 day : Day2.values()) {
            System.out.println(day.name() + "  : " + day.getDesc() + "  : " + day.toString());
        }
    }
}


