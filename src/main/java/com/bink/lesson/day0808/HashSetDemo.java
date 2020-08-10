package com.bink.lesson.day0808;

import java.util.HashSet;

/**
 * @author yangbingkun
 * 2020/8/8 --8:31 下午
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String S1 = "abc";
        String S2 = "abc";
        set.add(S1);
        set.add(S2);
        set.add("通话");
        set.add("重地");
        set.add("abc");
        System.out.println(set);
        System.out.println(S1.hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        boolean equals = "通话".equals("重地");
        System.out.println(equals);
    }
}
