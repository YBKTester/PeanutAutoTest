package com.bink.lesson09.day08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yangbingkun
 * 2020/9/8 --4:03 下午
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Out/test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IN/test.txt"));
        Map<String, String> map = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split("\\.");
            String key = s[0];
            String value = s[1];
            map.put(key, value);
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(map.get(key));
            String writer = key + "." + map.get(key);
            bw.write(writer);
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
