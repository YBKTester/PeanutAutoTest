package com.bink.lesson.day27.lesson01;

import com.bink.lesson.day27.lesson01.dao.MyInterfacePrivateA;
import com.bink.lesson.day27.lesson01.dao.MyInterfaceStatic;
import com.bink.lesson.day27.lesson01.impl.MyInterfaceStaticImpl;

/**
 * @author yangbingkun
 * 2020/7/27 --10:35 上午
 */
public class Demo {
    public static void main(String[] args) {
        MyInterfaceStatic myInterfaceStatic = new MyInterfaceStaticImpl();

        MyInterfaceStatic.hello();
        System.out.println(MyInterfacePrivateA.NAME);
    }
}
