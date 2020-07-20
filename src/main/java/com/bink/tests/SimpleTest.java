package com.bink.tests;

import com.bink.dao.ParamsMapper;
import com.bink.dao.UserMapper;
import com.bink.entity.Params;
import com.bink.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试数据库操作方法
 *
 * @author Bink
 * @date 2020/6/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ParamsMapper paramsMapper;

    @Test
    public void test() {
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void paramsTest() {
        List<Params> paramsList = paramsMapper.selectList(null);
        Assert.assertEquals(2, paramsList.size());
        paramsList.forEach(params -> System.out.println(params.getCaseName()));
        System.out.println("测试结束！！！");
    }
}
