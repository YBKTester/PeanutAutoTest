package com.bink.lesson.day0810.throwable.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1、使用数组保存已经注册的用户名
 * 2、使用Scanner获取用户输入的名称
 * 3、定义方法
 * 遍历已存在的用户名
 * 比较用户输入用户名
 * 已存在，则提示
 * 未存在，则新增
 *
 * @author yangbingkun
 * 2020/8/11 --1:53 下午
 */
public class Register {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bink");
        names.add("Kun");
        names.add("Zhilan");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = scanner.nextLine();
        System.out.println("您输入的用户名为：" + username);
        try {
            checkName(names, username);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    /**
     * 校验用户名
     *
     * @param names    已存在的用户名列表
     * @param username 待校验用户名
     * @throws RegisterException 重名异常类
     */
    public static void checkName(List<String> names, String username) {
        if (!names.contains(username)) {
            names.add(username);
            System.out.println("您已注册成功！");
        } else {
            throw new RegisterException("用户名已存在！请重新输入！");
        }
    }

}
