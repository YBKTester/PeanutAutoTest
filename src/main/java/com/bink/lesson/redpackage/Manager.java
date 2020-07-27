package com.bink.lesson.redpackage;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author yangbingkun
 * 2020/7/24 --5:27 下午
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    /**
     * 发红包
     *
     * @param totalMoney 总金额
     * @param count      红包个数
     * @return 红包金额列表
     */
    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> result = new ArrayList<>();
//        获取用户钱包余额
        int leftMoney = super.getMoney();
//        判断余额和红包金额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足！");
//            返回空结果
            return result;
        }
//        变换用户余额（原余额-红包金额）
        super.setMoney(leftMoney - totalMoney);
//        均分，取整
        int avgMoney = totalMoney / count;
//        余数，放到最后一个红包内
        int modMoney = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            result.add(avgMoney);
        }
//        最后一个红包金额=均分金额+余数金额
        int lastMoney = avgMoney + modMoney;
        result.add(lastMoney);
        return result;
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
