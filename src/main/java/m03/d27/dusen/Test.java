/**
 * Project Name:jdbc_demo
 * File Name:biao.java
 * Package Name:work
 * Date:2018年3月27日上午11:36:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d27.dusen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Description: <br/>
 * Date: 2018年3月27日 上午11:36:31 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {
      Test t=new Test();
      t.abc();
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String url="jdbc:mysql://localhost:3306/mydata";
    
    public void abc(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql="SELECT b.`cid`,b.`cname`,a.`pname` FROM province a INNER JOIN city b ON a.`pid`=b.`pid`";
            con=DriverManager.getConnection(url,"root","root");
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                int cid=rs.getInt(1);
                String cname=rs.getString(2);
                String pname=rs.getString(3);
                System.out.println(cid+"\t"+cname+"\t"+pname);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
