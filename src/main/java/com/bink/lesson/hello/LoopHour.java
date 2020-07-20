package com.bink.lesson.hello;

/**
 * @author yangbingkun
 * 2020/7/20 --3:16 下午
 */
public class LoopHour {
    private static final int HOUR_MAX = 24;
    private static final int minutesMax = 60;

    public static void main(String[] args) {
        for (int hour = 0; hour < HOUR_MAX; hour++) {

            for (int minutes = 0; minutes < minutesMax; minutes++) {
                System.out.println(hour + "点" + minutes + "分");
            }

        }
    }
}
