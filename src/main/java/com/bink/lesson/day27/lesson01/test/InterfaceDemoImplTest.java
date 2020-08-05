package com.bink.lesson.day27.lesson01.test;


import com.bink.lesson.day27.lesson01.impl.InterfaceDemoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yangbingkun
 * 2020/7/27 --10:11 上午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class InterfaceDemoImplTest {
    @Autowired
    private InterfaceDemoImpl interfaceDemoImpl;

    @Test
    public void hello() {
        interfaceDemoImpl.hello();
    }

    @Test
    public void helloWorld() {
        String string = interfaceDemoImpl.helloWorld();
        System.out.println(string);
    }

    @Test
    public void sum() {
        int c = interfaceDemoImpl.sum(3, 4);
        System.out.println(c);
    }
}