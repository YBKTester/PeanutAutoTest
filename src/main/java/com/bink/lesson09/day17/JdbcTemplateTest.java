package com.bink.lesson09.day17;

import com.bink.utils.JDBCUtils;
import com.bink.utils.LogUtils;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

/**
 * @author yangbingkun
 * @Package com.bink.lesson09.day17
 * @date 2020/9/17 --5:12 下午
 */
public class JdbcTemplateTest {
    private JdbcTemplate template;
    private Logger logger;

    /**
     * 准备数据源
     */
    @BeforeClass
    public void setUp() {
        logger = LogUtils.getLogger();
        logger.info("获取数据源");
        template = new JdbcTemplate(JDBCUtils.getDataSource());
    }

    @Test
    public void updateTest() {
        String sql = "UPDATE account1 SET salary = 100 WHERE id = ?";
        int count = template.update(sql, 1001);
        Assert.assertEquals(1, count);
        logger.info("被影响的行数：  " + count);
    }

    @Test
    public void insertTest() {
        String sql = "INSERT INTO account1(id,ename,dept_id) VALUES(?,?,?)";
        int update = template.update(sql, 1015, "郭靖", 10);
        Assert.assertEquals(1, update);
    }

    @Test
    public void deleteTest() {
        String sql = "DELETE FROM account1 WHERE id = ?";
        int count = template.update(sql, 1015);
        Assert.assertEquals(1, count);
    }

    @Test
    public void queryTest() {
        String sql = "SELECT * FROM account1 WHERE id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
    }

    /**
     * 5、查询所有记录，将其封装成List
     */
    @Test
    public void queryForListTest() {
        String sql = "SELECT * FROM account1";
        List<Map<String, Object>> mapList = template.queryForList(sql);
        for (Map<String, Object> map : mapList) {
            System.out.println(map);
        }

    }

    /**
     * 6、查询所有记录，将其封装成Emp对象的List
     */
    @Test
    public void queryListTest() {
        String sql = "SELECT * FROM emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<>(Emp.class));

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 7、查询记录总数
     */
    @Test
    public void queryAccountTest() {
        String sql = "SELECT count(id) FROM account1";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(
                total
        );
    }
}
