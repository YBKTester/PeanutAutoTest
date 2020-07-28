package com.bink.lesson.lesson05;

/**
 * 成员内部类
 *
 * @author yangbingkun
 * 2020/7/27 --3:36 下午
 */
public class Outer {
    int num = 10;

    public class Inner {
        int num = 20;

        public void methodInner() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(new Outer().num);
            System.out.println(Outer.this.num);
        }
    }
}
