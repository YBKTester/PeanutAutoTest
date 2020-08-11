package com.bink.lesson.day0810.throwable.exception;

/**
 * @author yangbingkun
 * 2020/8/11 --11:18 上午
 */
public class RegisterException extends RuntimeException {

    public RegisterException() {
    }


    public RegisterException(String message) {
        super(message);
    }
}
