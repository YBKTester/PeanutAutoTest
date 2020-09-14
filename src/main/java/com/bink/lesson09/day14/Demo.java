package com.bink.lesson09.day14;

import java.util.stream.Stream;

/**
 * @author yangbingkun
 * 2020/9/14 --9:21 上午
 */
public class Demo {
    public static void printString(Printable printable) {
        printable.print("HelloWorld!");
    }

    public static int method(int n, Calcable c) {
        return c.cals(n);
    }

    public static void main(String[] args) {
//        Stream<String> integerStream = Stream.of("1", "2", "3");
//        Stream<String> stream = Stream.of("张无忌", "张翠山", "张忌");
////        integerStream.filter((i) -> i > 3).forEach(System.out::println);
////        Integer[] array = {1,2,3,4,5};
////        Stream<Integer> array1 = Stream.of(array);
////        for (Integer integer : array) {
////            System.out.println(integer);
////        }
////        long count = integerStream.count();
////        System.out.println(count);
////        Stream<String> stream = Stream.of("张无忌", "张翠山", "张忌");
////        stream.filter(
////                name -> name.length() == 3
////        ).filter(
////                name -> name.endsWith("忌")
////        ).forEach(System.out::println);
//
////        integerStream.map(i -> i + 1).forEach(System.out::println);
////        integerStream.map((String::valueOf)).forEach(System.out::println);
////        System.out.println("===============");
////        Stream.of("美羊羊", "懒羊羊", "喜洋洋").limit(2).forEach(System.out::println);
////        System.out.println("===============");
////        Stream.of("美羊羊", "懒羊羊", "喜洋洋").skip(2).forEach(System.out::println);
//        Stream<String> concat = Stream.concat(integerStream, stream);
//        concat.forEach(System.out::println);
//        printString(System.out::println);

        printString(string -> {
            Person person = new Person();
            person.printUpper(string);
        });
        Person person = new Person();
        printString(person::printUpper);
        method(-10, Math::abs);
    }
}
