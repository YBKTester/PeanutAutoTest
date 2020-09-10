package com.bink.lesson09.day10;

/**
 * @author yangbingkun
 * 2020/9/10 --5:08 下午
 */
@FunctionalInterface
public interface MessageBuilder {
    /**
     * 拼接字符串
     *
     * @return 拼接好的字符串
     */
    String buildMessage();
}
