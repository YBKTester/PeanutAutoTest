package com.bink.lesson09.day10;

/**
 * @author yangbingkun
 * 2020/9/10 --4:38 下午
 */
public class Demo {

    public static void show(MyFunctionInterface functionalInterface) {
        functionalInterface.method();
    }

    public static void main(String[] args) {
        show(new FunctionInterfaceImpl());

        show(() -> System.out.println("使用匿名内部类。重写接口中的抽象方法了！"));
        show(() -> System.out.println("尝试使用Lambda表达式！"));
    }
}
