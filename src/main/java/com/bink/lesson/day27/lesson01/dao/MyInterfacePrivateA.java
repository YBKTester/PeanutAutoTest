package com.bink.lesson.day27.lesson01.dao;

/**
 * @author yangbingkun
 * 2020/7/27 --10:37 上午
 */
public interface MyInterfacePrivateA {
    public static final String NAME = "TestBink";
    public static final int NUM = 10;

    public default void methodDefault1() {
        System.out.println("默认方法1！" + NAME);
        common();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2！" + NUM);
        common();
    }

    /**
     * JDK9.0 以后接口可以具有私有方法
     */
    private void common() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    private static void hello() {
        System.out.println("这是一个静态私有方法！");
    }
}
