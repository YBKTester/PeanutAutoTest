package com.bink.lesson09.day17;

import com.bink.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author yangbingkun
 * @Package com.bink.lesson09.day17
 * @date 2020/9/17 --4:47 下午
 */
public class Demo {
    public static void main(String[] args) {

        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update account set salary =5000 where id = ?";
        int count = template.update(sql, 1);
        System.out.println(count);
//        1、修改1号员工的工资为10000
        String sql1 = "UPDATE account1 SET salary = 10000 WHERE id = ?";
        int update1 = template.update(sql1, 1001);
        System.out.println(update1);
//        2、添加一条记录
        String sql2 = "INSERT INTO account1 VALUES(NULL,?,?,?,?,?,?,?)";
//        3、删除新增的记录

//        4、查询ID为1的记录，封装为Map集合
//        5、查询所有记录，将其封装成List
//        6、查询所有记录，将其封装成Emp对象的List
//        7、查询记录总数
    }
}
