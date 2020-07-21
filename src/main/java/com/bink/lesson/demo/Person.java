package com.bink.lesson.demo;

/**
 * @author yangbingkun
 * 2020/7/21 --9:52 上午
 */
public class Person {

    /**
     * 自己的名字
     */
    public String name;

    public Person() {
        System.out.println("构造方法执行啦！！");
    }

    /**
     * 打招呼方法
     *
     * @param name 对方的名字
     */
    public void sayHello(String name) {
        System.out.println(name + ",你好！我是" + this.name);
    }
}
