package com.bink.lesson09.day15.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author yangbingkun
 * 2020/9/15 --4:10 下午
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Class aClass = calculator.getClass();
        Method[] methods = aClass.getMethods();
//        出现异常的次数
        int numbers = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    numbers++;
                    bw.write(method.getName() + "方法出异常了！");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现了：" + numbers + "次异常！");
        bw.flush();
        bw.close();
    }

}
