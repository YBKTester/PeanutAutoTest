package com.bink.lesson09.day11;

import java.util.function.Consumer;

/**
 * @author yangbingkun
 * 2020/9/11 --11:14 上午
 */
public class Demo2 {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(arr);
//        con2.accept(arr);
        for (String info : arr) {
            con1.andThen(con2).accept(info);
        }
    }

    public static void main(String[] args) {
        String[] arr = {
                "迪丽热巴，女",
                "古力娜扎，女",
                "马尔扎哈，男"
        };
        printInfo(arr,
                (String info) -> {
                    String[] arrInfo = info.split("，");
                    String string = "姓名：" + arrInfo[0] + "。";
                    System.out.print(string);
                },
                (String info) -> {
                    String[] arrInfo = info.split("，");
                    String string = "性别：" + arrInfo[1] + "。";
                    System.out.println(string);
                });
    }
}
