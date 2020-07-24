package com.bink.lesson.ex;

/**
 * @author yangbingkun
 * 2020/7/24 --4:00 下午
 */
public class Employer {
    String name;
    int id;

    /**
     * 员工技能方法
     *
     * @param job 技能名称
     */
    void skill(String job) {
        System.out.println("我可以做这项工作:  " + job);
    }
}
