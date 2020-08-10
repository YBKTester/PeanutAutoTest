package com.bink.lesson.day0810;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yangbingkun
 * 2020/8/10 --10:30 上午
 */
public class PersonMap {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
//        自定义类作为Key时，要重写hashCode(),equals()方法
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("秦始皇", 18), "中国");
        map.put(new Person("女王", 18), "法国");
        map.put(new Person("女王", 18), "神经国");
        Set<Person> people = map.keySet();
        for (Person person : people) {
            String value = map.get(person);
            System.out.println(person+"==>"+value);
        }
    }

    private static void show01() {
        Map<String, Person> personMap = new HashMap<>();
        personMap.put("北京", new Person("符亚洲", 18));
        personMap.put("上海", new Person("高晓河", 19));
        personMap.put("河南", new Person("邢树奎", 28));
        personMap.put("浙江", new Person("孙兆伟", 38));
        System.out.println(personMap);
        Set<String> keySet = personMap.keySet();
        for (String key : keySet) {
            Person person = personMap.get(key);
            System.out.println(key + "➡️" + person);
        }
    }
}
