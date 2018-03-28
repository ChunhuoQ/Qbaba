package m03.d27.songhang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Project Name:Qbaba
 * File Name:Test4.java
 * Package Name:
 * Date:2018年3月27日上午11:49:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年3月27日 上午11:49:27 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Test4 {

    public static void main(String[] args) {

    }

    Connection conn = null;

    PreparedStatement pst = null;

    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/mydata";

    public Connection getcon() {
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 驱动管理器
            conn = DriverManager.getConnection(url, "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
