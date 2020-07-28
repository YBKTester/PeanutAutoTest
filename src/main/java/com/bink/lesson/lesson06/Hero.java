package com.bink.lesson.lesson06;

/**
 * @author yangbingkun
 * 2020/7/27 --4:51 下午
 */
public class Hero {
    /**
     * 名称
     */
    private String name;
    private Weapon weapon;
    private int age;

    public void attack() {
        System.out.println(age + name + weapon.getCode());
    }

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
