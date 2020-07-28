package com.bink.lesson.lesson05;

/**
 * @author yangbingkun
 * 2020/7/27 --3:34 下午
 */
public class Demo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
        System.out.println("===========================");
        System.out.println(inner.num);

    }

}
