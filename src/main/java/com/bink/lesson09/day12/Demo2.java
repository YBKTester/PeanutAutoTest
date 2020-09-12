package com.bink.lesson09.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author yangbingkun
 * 2020/9/12 --3:56 下午
 */
public class Demo2 {
    /**
     * 筛选符合2个条件的列表
     *
     * @param strings    待处理列表
     * @param predicate1 第一条限制信息
     * @param predicate2 第二条限制信息
     * @return 返回符合条件的列表
     */
    public static ArrayList<String> checkGirl(String[] strings,
                                              Predicate<String> predicate1,
                                              Predicate<String> predicate2) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : strings) {
            boolean b = predicate1.and(predicate2).test(string);
            if (b) {
                list.add(string);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strings = {
                "迪丽热巴，女",
                "古力娜扎，女",
                "马尔扎哈，男",
                "赵丽颖，女",
        };
        ArrayList<String> girls = checkGirl(strings,
                (info) -> 4 == info.split("，")[0].length(),
                (info) -> info.split("，")[1].contains("女"));
        for (String girl : girls) {
            System.out.println(girl);
        }
    }
}
