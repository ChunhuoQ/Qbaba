/**
 * Project Name:Demo
 * File Name:BaseDao.java
 * Package Name:dao2
 * Date:2018��3��28������2:37:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.lvruiling.dao2;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * Description: <br/>
 * Date: 2018��3��28�� ����2:37:58 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class BaseDao {
    protected Connection con = null;

    protected PreparedStatement pst = null;

    protected ResultSet rs = null;

    static String driver;

    static String url;

    static String username;

    static String userpwd;
    static {

        try {
            Properties pro = new Properties();// Properties提供加属性文件的方法和读取属性文件中键的方法

            String path = "database.properties";// 属性文件的位置
            InputStream ist = BaseDao.class.getClassLoader().getResourceAsStream(path);// 把属性文件以流的方式输出
            pro.load(ist);// 加载二进流
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            userpwd = pro.getProperty("password");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void init() {
        Properties pro = new Properties();
        String path = "database.properties";
        try {
            InputStream ist = BaseDao.class.getClassLoader().getResourceAsStream(path);
            pro.load(ist);
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            userpwd = pro.getProperty("password");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    // ����
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

    public int controlDml(String sql, Object[] obj) {
        int flag = 0;
        try {
            pst = getCon().prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pst.setObject(i + 1, obj[i]);
                }
            }
            flag = pst.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return flag;

    }

    // �ر�
    public void close(Connection con2, PreparedStatement pst2, ResultSet rs2) {

        // Auto-generated method stub
        try {
            if (rs != null) {
                rs2.close();
            }
            if (pst != null) {
                pst2.close();
            }
            if (con != null) {
                con.close();

            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
