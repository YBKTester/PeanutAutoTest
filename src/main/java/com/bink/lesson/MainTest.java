package com.bink.lesson;

import com.bink.lesson.demo.Phone;

/**
 * @author yangbingkun
 * 2020/7/20 --5:10 下午
 */
public class MainTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("苹果");
        phone.setPrice(8848.00);
        phone.setColor("绿色");
        phone.call("Bink");
        phone.sendMessage();
    }

}
