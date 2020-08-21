package com.bink.lesson.day0813;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yangbingkun
 * 2020/8/13 --9:21 上午
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        int corePoolSize = 2;
        int maximumPoolSize = 4;
        long keepAliveTime = 10;
        int capacity = 2;
        TimeUnit unit = TimeUnit.SECONDS;
        Map<String, Integer> map = new HashMap<>(2);

        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(capacity);

        ThreadFactory threadFactory = new NameTreadFactory();
        RejectedExecutionHandler handler = new MyIgnorePolicy();
        ThreadPoolExecutor executor = new ThreadPoolExecutor
                (corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
//       预启动所有核心线程
        executor.prestartAllCoreThreads();
        for (int i = 1; i < 10; i++) {
            MyTask task = new MyTask(String.valueOf(i));
            executor.execute(task);
        }
        System.in.read();
    }

    static class NameTreadFactory implements ThreadFactory {
        private final AtomicInteger mThreadNum = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, "my-thread-" + mThreadNum.getAndIncrement());
            System.out.println(t.getName() + "has been created!");
            return t;
        }
    }

    public static class MyIgnorePolicy implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
            doLog(r, e);
        }

        /**
         * 记录日志方法
         *
         * @param r run方法实际执行内容
         * @param e 线程池
         */
        private void doLog(Runnable r, ThreadPoolExecutor e) {
            System.out.println(r.toString() + "  Rejected!");
        }
    }

    static class MyTask implements Runnable {
        private String name;

        public MyTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(this.toString() + "is Running!");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "MyTask{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
