import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:Qbaba
 * File Name:Test.java
 * Package Name:
 * Date:2018年3月27日下午10:22:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年3月27日 下午10:22:00 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Test {
    public static void main(String[] args) {
        Test tt = new Test();
        List<Info> fk = tt.info();
        for (Info fa : fk) {
            System.out.println(fa.getId() + "\t" + fa.getName() + "\t" + fa.getAge());
        }
    }

    Connection con = null;

    PreparedStatement pst = null;

    ResultSet rs = null;

    // 连接什么位置数据库，告诉端口号，数据库名称
    private String url = "jdbc:mysql://localhost:3306/mydata";

    public Connection getcon() {
        try {
            // 加载驱动，用反射的方式加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 驱动管理器
            con = DriverManager.getConnection(url, "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public List<Info> info() {
        List<Info> fk = new ArrayList<Info>();
        String sql = "SELECT*FROM info";
        try {
            // 预编译，把sql带到mysql环境中，测试语法是否正确
            pst = getcon().prepareStatement(sql);
            // 执行查询
            rs = pst.executeQuery();
            while (rs.next()) {
                // 每实例化一次，原先的数据会被覆盖 Info类想到一个临时的仓库的作用
                Info info = new Info();
                info.setId(rs.getInt("id"));
                info.setName(rs.getString("name"));
                info.setAge(rs.getInt("age"));

                fk.add(info);// 装箱 的思想（相对应的有拆箱的）
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fk;
    }
}
