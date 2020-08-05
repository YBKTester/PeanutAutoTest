package com.bink.lesson.day0803;

import com.bink.lesson.day27.lesson02.C;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yangbingkun
 * 2020/8/3 --2:05 下午
 */
public class CalendarDemo {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {

        Calendar calendar = Calendar.getInstance();
        
        int year = calendar.get(Calendar.YEAR);
        int mouth = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(mouth + 1);
        System.out.println(day);

        Date date = new Date();
        Date date1 = new Date(3000L);
        System.out.println(date);
        System.out.println(date1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        try {
            Date parse = simpleDateFormat.parse(format);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
