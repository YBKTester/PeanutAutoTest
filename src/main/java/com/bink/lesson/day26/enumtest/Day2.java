package com.bink.lesson.day26.enumtest;

/**
 * @author yangbingkun
 * 2020/7/20 --10:34 上午
 */
public enum Day2 {
    /**
     * 周一
     */
    MONDAY("星期一"),
    /**
     * 周二
     */
    TUESDAY("星期二"),
    /**
     * 周三
     */
    WEDNESDAY("星期三");
    /**
     * 中文描述
     */
    private String desc;

    private Day2(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Day2{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
