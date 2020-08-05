package com.bink.lesson.day28.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author yangbingkun
 * 2020/7/28 --9:20 上午
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
//        System.out.println(System.currentTimeMillis());
//        Date date = new Date(0L);
//        System.out.println(date);
//        Date date1 = new Date(1595899580218L);
//        System.out.println(date1);
//        Date date2 = new Date();
//        System.out.println(date2.getTime());
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() throws ParseException {
        String formatStr = "yyyy-MM-dd HH:mm:ss";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的出生日期。格式参照：" + formatStr);
        String birthDateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
        Date birthDate = dateFormat.parse(birthDateStr);
//        转换成毫秒
        long birthDateTime = birthDate.getTime();
        long currentTimeMillis = System.currentTimeMillis();
        long lifeTime = currentTimeMillis - birthDateTime;
        long lifeHour = lifeTime / 1000 /3600;
        long lifeDay = lifeHour / 24;
        long lifeYear = lifeDay / 365;
        System.out.println("你已经存在：" + lifeTime + "ms");
        System.out.println("你已经存在：" + lifeHour + "H");
        System.out.println("你已经存在：" + lifeDay + "Day");
        System.out.println("你已经存在：" + lifeYear + "year");

    }

    private static void demo02() {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String dateStr = "2020年07月28日 09时55分38秒";
        try {
            System.out.println(myFormat.parse(dateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void demo01() {
//        DateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat myFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String text = myFormat.format(date);
        System.out.println(date);
        System.out.println(text);
    }
}
