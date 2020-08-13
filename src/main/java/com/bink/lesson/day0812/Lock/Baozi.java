package com.bink.lesson.day0812.Lock;

/**
 * 资源类
 *
 * @author yangbingkun
 * 2020/8/12 --3:57 下午
 */
public class Baozi {
    String pi;
    String xian;
    boolean flag = false;

    @Override
    public String toString() {
        return "Baozi{" +
                "皮儿：'" + pi + '\'' +
                ",馅儿：'" + xian + '\'' +
                '}';
    }
}
