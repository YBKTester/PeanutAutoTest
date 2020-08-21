package com.bink.lesson.day0813.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yangbingkun
 * 2020/8/13 --10:51 上午
 */
public class Lambda {
    public static void main(String[] args) {

        invokeCooke(() -> System.out.println("厨子正在做饭！"));
        sayHello(
                Lambda::say);

        Person[] arrays = {
                new Person("Bink1", 18),
                new Person("Bink2", 19),
                new Person("Bink3", 20),
        };
        Arrays.sort(arrays, Comparator.comparingInt(Person::getAge));

        for (Person person : arrays) {
            System.out.println(person);
        }

        invokeCalc(10, 20, Integer::sum);
    }

    private static void invokeCooke(Cook cook) {
        cook.makeFood();
    }

    private static void sayHello(HelloInterface hello) {
        String s = hello.say("Bink", "Zhilan");
        System.out.println(s);
    }

    public static void invokeCalc(int a, int b, Calculator calc) {
        int sum = calc.calc(a, b);
        System.out.println(sum);
    }

    private static String say(String a, String b) {
        return a + ": Hello," + b;
    }
}
