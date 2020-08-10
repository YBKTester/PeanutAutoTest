package com.bink.lesson.day0808;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @author yangbingkun
 * 2020/8/8 --8:43 下午
 */
public class Demo {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        Student student1 = new Student("Bink", 18);
        Student student2 = new Student("Bink", 18);
        Student student3 = new Student("Bink", 19);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        System.out.println(studentHashSet);

    }
}
