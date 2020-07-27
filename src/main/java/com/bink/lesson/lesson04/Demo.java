package com.bink.lesson.lesson04;

/**
 * @author yangbingkun
 * 2020/7/27 --2:53 下午
 */
public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        USB mouse = new Mouse();
        computer.useDevice(mouse);
        USB keyboard = new Keyboard();
        computer.useDevice(keyboard);
        if (mouse instanceof Mouse) {
            Mouse mouse1 = (Mouse) mouse;
            mouse1.click();
        } else if (keyboard instanceof Keyboard) {
            Keyboard key = (Keyboard) keyboard;
            key.type();
        }


        computer.powerOff();
    }
}
