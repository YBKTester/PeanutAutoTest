package com.bink.lesson.lesson07;

/**
 * @author yangbingkun
 * 2020/7/27 --5:01 下午
 */
public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Bink");
        hero.setSkill(new SkillImpl());
        hero.attack();
    }
}
