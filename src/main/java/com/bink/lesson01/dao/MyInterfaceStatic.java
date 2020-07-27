package com.bink.lesson01.dao;

/**
 * @author yangbingkun
 * 2020/7/27 --10:33 上午
 */
public interface MyInterfaceStatic {

    /**
     * static
     */
    public static void hello() {
        System.out.println("这是接口的静态方法！");
    }

    public default void helloWorld() {
        System.out.println("这是接口的默认方法！");
    }
}
