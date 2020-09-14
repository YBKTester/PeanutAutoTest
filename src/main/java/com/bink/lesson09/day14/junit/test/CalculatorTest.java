package com.bink.lesson09.day14.junit.test;

import com.bink.lesson09.day14.junit.Calculator;
import org.junit.*;

/**
 * @author yangbingkun
 * 2020/9/14 --4 下午
 */
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Before
    public void init() {
        System.out.println("Init...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("准备环境！");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("清理环境！！");
    }

    @Test
    public void sum() {
        System.out.println("测试方法：");
        Assert.assertEquals(3, calculator.sum(1, 2));
    }

    @Test
    public void sub() {
        Assert.assertEquals(2, calculator.sub(4, 2));
    }
}