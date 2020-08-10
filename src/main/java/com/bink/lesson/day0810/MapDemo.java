package com.bink.lesson.day0810;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author yangbingkun
 * 2020/8/10 --9:34 上午
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(3);
        map.put("范冰冰", "李晨");
        map.put("杨过", "小龙女");
        map.put("英志平", "小龙女");
//        demo01();
//        demo02(map);
        demo03(map);

    }

    private static void demo03(Map<String, String> map) {
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "::" + value);
        }
    }

    private static void demo02(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key);
            System.out.println("================");
            String s = map.get(key);
            System.out.println(s);
            System.out.println("****************");
        }
        for (String key : keySet) {
            System.out.println(map.get(key));
        }
    }

    private static void demo01() {
        Map<String, String> map = new HashMap<>();
        String put1 = map.put("Bink", "Hello");
        System.out.println(put1);
//        put()方法，如果Key不冲突，返回null；如果Key冲突，返回被替换掉的Value
        String put2 = map.put("Bink", "World");
        System.out.println(put2);
        System.out.println(map);
        map.put("范冰冰", "李晨");
        map.put("杨过", "小龙女");
        map.put("英志平", "小龙女");
        System.out.println(map);
        for (String string : map.values()) {
            System.out.println(string);
        }
        String bink = map.remove("Bi2nk");
        System.out.println(bink);
        boolean 杨过 = map.containsKey("杨过");
        System.out.println(杨过);

    }
}
