/**
 * Project Name:Demo_dt59_jdbc_fc_01
 * File Name:BaseDao.java
 * Package Name:cn_dt59_dao
 * Date:2018年3月28日下午2:34:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.songhang.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午2:34:42 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class BaseDao {
    protected Connection con = null;

    protected PreparedStatement pat = null;

    protected ResultSet rs = null;

    static String driver;

    static String url;

    static String username;

    static String userpwd;
    static {
        init();// 加载不同属性文件的键
    }

    /**
     * @see 初始化数据连接
     * */
    public static void init() {
        Properties pro = new Properties();// Properties类中提供
        String path = "database.properties";
        try {
            InputStream ist = BaseDao.class.getClassLoader().getResourceAsStream(path);
            pro.load(ist);// 加载二进制流
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            userpwd = pro.getProperty("password");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    // 连接方法 工具类
    public Connection getCon() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, userpwd);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return con;
    }

    // 关闭的方法(工具类)
    public void colse(Connection con, PreparedStatement pat, ResultSet rs) {

        try {
            if (rs != null) {
                rs.close();
            }
            if (pat != null) {
                pat.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
