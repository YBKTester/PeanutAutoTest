package com.bink.lesson01.dao;

/**
 * @author yangbingkun
 * 2020/7/27 --10:19 上午
 */
public interface MyInterfaceAbstract {
    /**
     * test
     */
    public abstract void methodAbs1();

    /**
     * test
     */
    default void methodAbs2() {
        System.out.println("Default!!!");
    }

    /**
     * test
     */
    abstract void methodAbs3();

    /**
     * test
     */
    void methodAbs4();
}
