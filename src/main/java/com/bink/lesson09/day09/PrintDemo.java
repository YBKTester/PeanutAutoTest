package com.bink.lesson09.day09;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author yangbingkun
 * 2020/9/9 --11:05 上午
 */
public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出！");
        PrintStream ps = new PrintStream("Out/目的地是打印流.txt");
//        改变流的方向，输出到指定的位置
        System.setOut(ps);
//        这句打印在文本中
        System.out.println("我在打印流的目的地中输出！");
        ps.close();
    }
}
