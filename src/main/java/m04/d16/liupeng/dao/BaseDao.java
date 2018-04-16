/**
 * Project Name:TestSystem2018
 * File Name:BaseDao.java
 * Package Name:main.java.m03.d28.liupeng.dao
 * Date:2018年3月28日下午2:38:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.liupeng.dao;

import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午2:38:51 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class BaseDao {
    protected Connection con = null;// 连接通道

    protected PreparedStatement pst = null;// 预编译

    protected ResultSet rs = null;// 结果集

    protected CallableStatement cstate = null;// 调用存储过程的接口

    static String driver;

    static String url;

    static String username;

    static String userpwd;

    static {
        init();
    }

    public static void init() {
        // Properties提供加载属性文件的方法
        Properties ps = new Properties();
        // 属性文件的位置
        String path = "database.properties";
        try {
            // 把属性文件以流的方式输出
            InputStream ist = BaseDao.class.getClassLoader().getResourceAsStream(path);
            // 加载二进制流
            ps.load(ist);
            driver = ps.getProperty("driver");
            url = ps.getProperty("url");
            username = ps.getProperty("username");
            userpwd = ps.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        return flag;
    }

    // 连接方法
    public Connection getCon() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, userpwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // 关闭的方法
    public void close(Connection con, PreparedStatement pst, ResultSet rs, CallableStatement cstate) {
        try {
            if (cstate != null) {
                cstate.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

