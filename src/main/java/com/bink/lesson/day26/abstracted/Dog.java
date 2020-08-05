package com.bink.lesson.day26.abstracted;

/**
 * @author yangbingkun
 * 2020/7/24 --5:08 下午
 */
public class Dog extends BaseAnimal {
    /**
     * 进食
     */
    @Override
    void eat() {
        System.out.println("狗狗吃骨头！");
    }
}
