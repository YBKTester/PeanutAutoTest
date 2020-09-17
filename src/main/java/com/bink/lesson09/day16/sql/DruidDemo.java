package com.bink.lesson09.day16.sql;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author yangbingkun
 * 2020/9/17 --9:43 上午
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        props.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(props);
        for (int i = 0; i < 5; i++) {
            Connection connection = ds.getConnection();
            System.out.println(connection);
        }

    }
}
