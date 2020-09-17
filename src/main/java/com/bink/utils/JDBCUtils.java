package com.bink.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JDBC工具类
 * 1、获取连接
 * 2、释放资源
 *
 * @author yangbingkun
 * 2020/9/17 --10:37 上午
 */
public class JDBCUtils {
    private static DataSource ds;

    static {
        try {
            Properties props = new Properties();
            props.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return 连接
     * @throws SQLException SQL异常
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 释放资源
     *
     * @param stmt SQL
     * @param conn 连接
     */
    public static void close(Statement stmt, Connection conn) {
        close(null, stmt, conn);
    }


    /**
     * 释放资源
     *
     * @param rs   SQL结果
     * @param stmt SQL
     * @param conn 连接
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取连接池
     *
     * @return 连接池
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
