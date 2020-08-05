package com.bink.lesson.day26.redpackage;

import java.util.ArrayList;

/**
 * @author yangbingkun
 * 2020/7/24 --5:44 下午
 */
public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member one = new Member("群友A", 0);
        Member two = new Member("群友B", 0);
        Member three = new Member("群友C", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=================");
        ArrayList<Integer> redList = manager.send(50, 5);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manager.receive(redList);
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
