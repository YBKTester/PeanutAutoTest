package com.bink.lesson.day0810;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 计算字符串出现的次数
 *
 * @author yangbingkun
 * 2020/8/10 --11:13 上午
 */
public class ScannerMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入任意字符串：");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                Integer value = map.get(ch);
                value++;
                map.put(ch, value);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character ch : map.keySet()) {
            Integer value = map.get(ch);
            System.out.println(ch + "  该字符出现了：" + value + " 次！");
        }
    }
}
