/**
 * Project Name:Demo_pro_jdbc_fc_01
 * File Name:BaseDao.java
 * Package Name:cn.dt59.dao
 * Date:2018年3月28日下午5:17:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.songhang.dt59.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午5:17:38 <br/>
 * 
 * @author songhang
 * @version 创建BaseDao类，实现数据库连接和关闭功能。
 * @see
 */
public class BaseDao {
    protected Connection conn = null;

    protected PreparedStatement pst = null;

    protected ResultSet rsu = null;

    static String driver;

    static String url;

    static String username;

    static String userpwd;
    static {
        init();
    }

    // 初始化数据连接
    public static void init() {
        Properties prop = new Properties();// 实例化Properties
        String path = "database.properties";
        try {
            InputStream ist = BaseDao.class.getClassLoader().getResourceAsStream(path);
            prop.load(ist);// 加载流
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            username = prop.getProperty("username");
            userpwd = prop.getProperty("password");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    // 数据库连接
    public Connection getCon() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, userpwd);
        } catch (Exception e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
        return conn;

    }

    // ?
    public int controlDml(String sql, Object[] obj) {
        int flag = 0;
        try {
            pst = getCon().prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pst.setObject(i + 1, obj[i]);// 赋值
                }
            }
            flag = pst.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(conn, pst, rsu);
        }
        return flag;
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
