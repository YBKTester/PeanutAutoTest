package com.bink.lesson09.day10;

/**
 * 日志案例
 *
 * @author yangbingkun
 * 2020/9/10 --5:04 下午
 */
public class LoggerDemo {
    public static void showLog(int level, String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.buildMessage());
        }
    }

    public static void startThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        String msg1 = "hello1";
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了！！！"));
        String msg2 = "hello2";
        String msg3 = "hello3";
        showLog(1, msg1 + msg2 + msg3);
        showLog(1, () -> msg1 + msg2 + msg3);
    }

}
