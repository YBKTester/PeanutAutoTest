package com.bink.lesson09.day15;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yangbingkun
 * 2020/9/15 --3:27 下午
 */
@Pro(className = "com.bink.lesson09.day15.Demo", methodName = "say")
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Main> mainClass = Main.class;
        Pro annotation = mainClass.getAnnotation(Pro.class);
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className);
        System.out.println(methodName);
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);

    }
}
