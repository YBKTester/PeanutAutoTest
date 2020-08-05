package com.bink.lesson.day27.lesson04;

/**
 * @author yangbingkun
 * 2020/7/27 --2:51 下午
 */
public class Computer {
    public void powerOn() {
        System.out.println("笔记本开机！");
    }

    public void powerOff() {
        System.out.println("笔记本关机！");
    }

    public void useDevice(USB usb) {
        usb.open();
        usb.close();
    }
}
