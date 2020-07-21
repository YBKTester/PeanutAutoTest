package com.bink.lesson.demo;

import java.util.ArrayList;

/**
 * @author yangbingkun
 * 2020/7/21 --2:27 下午
 */
public class PersonArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("玛尔扎哈", 38);
        array[0] = one;
        array[1] = two;
        array[2] = three;
//        System.out.println(array[0].toString());
//        System.out.println(array[1].toString());
//        System.out.println(array[2].toString());
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(one);
        personList.add(two);
        personList.add(three);
        System.out.println(personList);
        personList.forEach(System.out::println);
        System.out.println(personList.contains(one));
        System.out.println(personList.get(0));
        personList.remove(0);
        System.out.println(personList.size());
        personList.forEach(System.out::println);
    }
}
