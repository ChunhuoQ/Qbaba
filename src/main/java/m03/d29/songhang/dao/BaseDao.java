/**
 * Project Name:Qbaba
 * File Name:BaseDao.java
 * Package Name:m03.d29.songhang.dao
 * Date:2018年3月30日上午11:49:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.songhang.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Description: <br/>
 * Date: 2018年3月30日 上午11:49:07 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class BaseDao {
    public Connection conn = null;

    public PreparedStatement pst = null;

    public ResultSet rsu = null;

    static String diver;

    static String url;

    static String username;

    static String userpwd;

    static {
        init();
    }

    // 初始化数据连接 properties类
    public static void init() {
        Properties pro = new Properties();// 实例化properties类
        String path = "database.properties";
        InputStream inp = BaseDao.class.getClassLoader().getResourceAsStream(path);
        try {
            pro.load(inp);
            diver = pro.getProperty("driver");
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            userpwd = pro.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 数据库连接
    public Connection getcon() {
        try {
            Class.forName(diver);
            conn = DriverManager.getConnection(url, username, userpwd);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return conn;
    }

    public int controlDml(String sql, Object[] obj) {
        int flog = 0;

        try {
            pst = getcon().prepareStatement(sql);// 预编译
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pst.setObject(i + 1, obj);// 赋值
                }
            }
            flog = pst.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();

        } finally {
            close(conn, pst, rsu);
        }
        return flog;
    }

    // 关闭功能
    public void close(Connection conn, PreparedStatement pst, ResultSet rsu) {
        try {
            if (rsu != null) {
                rsu.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
