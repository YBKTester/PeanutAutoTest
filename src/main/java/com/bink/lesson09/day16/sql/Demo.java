package com.bink.lesson09.day16.sql;

import com.bink.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yangbingkun
 * 2020/9/17 --10:48 上午
 */
public class Demo {

    /**
     *
     */
    public void hellow() {

    }
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "insert into account values(null,?,?)";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "王五");
            pstmt.setDouble(2, 3000);
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt, connection);
        }
    }
}
