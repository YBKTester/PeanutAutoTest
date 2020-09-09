package com.bink.lesson09.day08;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @author yangbingkun
 * 2020/9/8 --2:46 下午
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        Properties properties = new Properties();
//        字符流Reader可以操作中文，字节流不行
        properties.load(new FileReader("prop.txt"));
//        properties.load(new FileInputStream("prop.txt"));
        printProp(properties);

    }

    private static void show02() throws IOException {
        Properties props = new Properties();
        props.setProperty("赵丽颖", "168");
        props.setProperty("迪丽热巴", "166");
        props.setProperty("刘亦菲", "178");
        FileWriter fw = new FileWriter("prop.txt");
        props.store(fw, "Save Data！");
        fw.close();
    }

    private static void show01() {
        Properties props = new Properties();
        props.setProperty("赵丽颖", "168");
        props.setProperty("迪丽热巴", "166");
        props.setProperty("刘亦菲", "178");
        printProp(props);
    }

    /**
     * 遍历集合方法
     *
     * @param props 集合
     */
    private static void printProp(Properties props) {
//        获取集合的key
        Set<String> set = props.stringPropertyNames();
        for (String key : set) {
            String value = props.getProperty(key);
            System.out.println(key + " = " + value);
        }
    }

}
