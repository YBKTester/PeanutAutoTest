package com.bink.lesson.day0811;

/**
 * @author yangbingkun
 * 2020/8/11 --4:59 下午
 */
public class NewThread {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        Thread thread01 = new Thread(myTest);
        Thread thread02 = new Thread(myTest);
        Thread thread03 = new Thread(myTest);
        thread01.start();
        thread02.start();
        thread03.start();
        
    }
}
