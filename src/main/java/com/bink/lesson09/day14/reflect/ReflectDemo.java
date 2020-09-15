package com.bink.lesson09.day14.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author yangbingkun
 * 2020/9/14 --9:19 下午
 */
public class ReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties props = new Properties();
        ClassLoader classLoader = ReflectDemo.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        props.load(is);

        String className = props.getProperty("className");
        String methodName = props.getProperty("methodName");
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();

        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
