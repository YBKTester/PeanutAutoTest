package com.bink.lesson.day27.lesson06;

/**
 * @author yangbingkun
 * 2020/7/27 --4:00 下午
 */
public class DemoMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.methodOuter();

        MyInterImpl impl = new MyInterImpl();
        impl.method();
        new MyInterImpl().method();
        MyInter inter = () -> System.out.println("匿名内部类的方法！");
        inter.method();
        new MyInter() {

            @Override
            public void method() {

            }
        }.method();
        Weapon weapon = new Weapon();
        weapon.setCode("BaoJian");
        Hero hero = new Hero();
        hero.setName("GaiLun");
        hero.setAge(100);

        hero.setWeapon(weapon);
        hero.attack();
    }

}
