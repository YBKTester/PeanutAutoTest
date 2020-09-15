package com.bink.lesson09.day15;

import java.lang.annotation.*;

/**
 * @author yangbingkun
 * 2020/9/15 --3:23 下午
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Pro {

    String className();

    String methodName();
}
