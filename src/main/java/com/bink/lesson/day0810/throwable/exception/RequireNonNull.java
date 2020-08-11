package com.bink.lesson.day0810.throwable.exception;

import java.util.Objects;

/**
 * @author yangbingkun
 * 2020/8/11 --9:50 上午
 */
public class RequireNonNull {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(String o) {
//        if (o == null) {
//            throw new NullPointerException("传递的对象值为空！");
//        }
        Objects.requireNonNull(o,"传递的对象值为空！");
    }
}
