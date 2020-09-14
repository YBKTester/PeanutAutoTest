package com.bink.lesson09.day14.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * @author yangbingkun
 * 2020/9/14 --4:42 下午
 */
public class Demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> personClass = Person.class;
        Stream.of(personClass.getFields()).forEach(System.out::println);
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("+++++++++++++++++");
        Field field = personClass.getField("name");
        Person person = new Person();
        field.set(person, "张三");
        Object value = field.get(person);
        System.out.println(value);
        Method eat = personClass.getMethod("eat");
        eat.invoke(new Person());
        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(new Person(), "盖浇饭！！");
        System.out.println("+++++++++++++++++");
        Method[] methods = personClass.getMethods();

        for (Method method : methods) {
            System.out.println(method);
            method.setAccessible(true);
            System.out.println(method.getName());
        }
        System.out.println("+++++++++++++++++");
        System.out.println(personClass.getName());
    }
}
