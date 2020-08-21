package com.bink.lesson.day0813;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yangbingkun
 * 2020/8/13 --9:02 上午
 */
public class ThreadPool {
    public static void main(String[] args) {
//        返回指定数量的线程
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());

    }
}
