package com.bink.lesson.day27.lesson01.dao;

import org.springframework.stereotype.Service;

/**
 * @author yangbingkun
 * 2020/7/27 --10:07 上午
 */
@Service
public interface InterfaceDemo {
    /**
     * test
     */
    void hello();

    /**
     * ces
     *
     * @return String
     */
    String helloWorld();

    /**
     * sum
     *
     * @param a a
     * @param b b
     * @return c
     */
    int sum(int a, int b);
}
