package com.bink.lesson.enumtest;


enum Color {
    /**
     *
     */
    GREEN,
    /**
     *
     */
    RED,
    /**
     *
     */
    BLUE
}

/**
 * @author yangbingkun
 * 2020/7/20 --10:46 上午
 */
public class EnumDemo4 {

    public static void printName(Color color) {
        switch (color) {
            case BLUE:
                System.out.println("蓝色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            default:
                System.out.println("无匹配项目！");
        }
    }

    public static void main(String[] args) {
        printName(Color.BLUE);
        printName(Color.RED);
        printName(Color.GREEN);

        //蓝色
        //红色
        //绿色
    }
}