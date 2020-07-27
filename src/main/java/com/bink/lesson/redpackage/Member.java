package com.bink.lesson.redpackage;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author yangbingkun
 * 2020/7/24 --5:36 下午
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    /**
     * 接收红包
     *
     * @param list 已处理的红包列表
     */
    public void receive(ArrayList<Integer> list) {
        System.out.println("还剩下" + list.size() + "个红包！");
        int index = new Random().nextInt(list.size());

        int delta = list.remove(index);
        int money = super.getMoney();
        money += delta;
        super.setMoney(money);

    }
}
