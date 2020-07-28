package com.bink.lesson.lesson06;

/**
 * @author yangbingkun
 * 2020/7/27 --3:58 下午
 */

public class Outer {
    public void methodOuter() {

        class Inner {
            final int num = 10;

            public void methodInner() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }

}
