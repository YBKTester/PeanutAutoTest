package com.bink.lesson.abstracted;

/**
 * @author yangbingkun
 * 2020/7/24 --5:09 下午
 */
public class Cat extends BaseAnimal {
    /**
     * 进食
     */
    @Override
    void eat() {
        System.out.println("猫吃鱼！");
    }
}
