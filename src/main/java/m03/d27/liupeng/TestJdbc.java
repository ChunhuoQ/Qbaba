/**
 * Project Name:TestSystem2018
 * File Name:TestJdbc.java
 * Package Name:main.java.m03.d27
 * Date:2018年3月27日上午10:43:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d27.liupeng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年3月27日 上午10:43:26 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class TestJdbc {

    private final static Logger LOG = Logger.getLogger(TestJdbc.class);

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;
        Statement stt = null;
        ResultSet rs = null;
        try {
            // 1、注册数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取数据库连接
            String url = "jdbc:mysql://localhost:3306/mydata";
            con = DriverManager.getConnection(url, "root", "root");
            // 3、获取传输器对象
            stt = con.createStatement();
            // 4、利用传输器传输sql语句到数据库中执行，获取对象结果
            // String sql = "select * from class";
            String sql1 = "SELECT b.`cid`,b.`cname`,a.`pname` FROM province a INNER JOIN city b ON a.`pid`=b.`pid`";
            rs = stt.executeQuery(sql1);
            // 5、遍历结果集获取查询结果
            while (rs.next()) {
                // List list = new ArrayList();
                int ss = rs.getInt("cid");
                String nn = rs.getString("cname");
                String aa = rs.getString("pname");
                LOG.info(ss+"\t"+nn+"\t"+aa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6、关闭资源
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stt != null) {
                    stt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                // TODO: handle exception
            } finally {
                rs = null;
                stt = null;
                con = null;
            }

        }

    }

}

