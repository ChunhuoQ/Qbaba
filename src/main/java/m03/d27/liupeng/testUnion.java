/**
 * Project Name:Qbaba
 * File Name:testUnion.java
 * Package Name:m03.d27.liupeng
 * Date:2018年3月27日上午9:04:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d27.liupeng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年3月27日 上午9:04:19 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class testUnion {

    private final static Logger LOG = Logger.getLogger(testUnion.class);

    public static void main(String[] args) {
        testUnion tu = new testUnion();
        List<Object[]> listobj = tu.getCityProvince();
        for (int i = 0; i < listobj.size(); i++) {
            Object[] obj = listobj.get(i);
            for (int j = 0; j < obj.length; j++) {
                LOG.info(obj[j] + "\t");
            }
        }
    }
    
    Connection con=null;
    PreparedStatement pds=null;
    ResultSet rs=null;

    private String url = "jdbc:mysql://localhost:3306/mydata";

    // 连接方法
    public Connection getCon() {
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 驱动管理器
            con = DriverManager.getConnection(url, "root", "root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    // 查询方法
    public List<Object[]> getCityProvince() {
        List<Object[]> list = new ArrayList<Object[]>();
        try {
            StringBuffer sb = new StringBuffer();
            sb.append("SELECT b.`cid`,b.`cname`,a.`pname` ");
            sb.append("FROM province a ");
            sb.append("INNER JOIN city b ON a.`pid`=b.`pid`");
            String sql = sb.toString();
            pds = getCon().prepareStatement(sql);
            rs = pds.executeQuery();
            while (rs.next()) {
                Object[] obj = new Object[3];
                obj[0] = rs.getInt(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}

