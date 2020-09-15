package com.bink.lesson09.day15;

import java.lang.annotation.*;

/**
 * @author yangbingkun
 * 2020/9/15 --2:58 下午
 */
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented()
@Inherited()
public @interface Bink {
        public abstract String name() default "张三";
    public abstract int value();

}
