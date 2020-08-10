package com.bink.lesson.day0808;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author yangbingkun
 * 2020/8/10 --9:25 上午
 */
public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student("Xiao Hong", 18),
                new Student("Xiao Bai", 19),
                new Student("Xiao Hei", 20));
        System.out.println(list);

        list.sort(Comparator.comparingInt(Student::getAge));
    }
}
