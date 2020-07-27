package com.bink.lesson.redpackage;

import java.util.ArrayList;

/**
 * @author yangbingkun
 * 2020/7/24 --5:18 下午
 */
public class User {
    private String name;
    private int money;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }


    public void show() {
        System.out.println("我叫：" + name + ",我有：" + money + "块钱！");
    }
}
