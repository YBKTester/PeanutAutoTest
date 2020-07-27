package com.bink.lesson.lesson01.impl;

import com.bink.lesson.lesson01.dao.InterfaceDemo;
import org.springframework.stereotype.Component;

/**
 * @author yangbingkun
 * 2020/7/27 --10:10 上午
 */
@Component
public class InterfaceDemoImpl implements InterfaceDemo {
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public String helloWorld() {
        return "Hello World!";
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
