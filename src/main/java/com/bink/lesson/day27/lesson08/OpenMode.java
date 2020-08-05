package com.bink.lesson.day27.lesson08;

import java.util.ArrayList;

/**
 * @author yangbingkun
 * 2020/7/27 --5:28 下午
 */
public interface OpenMode {
    /**
     * 将红包总金额，均分成几分，保存到List中
     *
     * @param totalMoney 红包总金额
     * @param totalCount 红包总个数
     * @return 小红包金额列表
     */
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
