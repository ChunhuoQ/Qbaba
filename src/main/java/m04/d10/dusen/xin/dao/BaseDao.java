/**
 * Project Name:xinwen2
 * File Name:BaseDao.java
 * Package Name:com.xin.dao
 * Date:2018年4月8日上午9:38:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.dusen.xin.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Description:   <br/>
 * Date:     2018年4月8日 上午9:38:51 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class BaseDao {
    protected Connection con=null;//连接通道
    protected PreparedStatement pst=null;//预编译
    protected ResultSet rs=null;//结果集
    protected DataSource ds=null;//数据源
   
    
    

    public Connection getCon(){
       
        try {
           // Class.forName(driver);
            //con=DriverManager.getConnection(url, username, userpwd);
            Context ct=new InitialContext();
            ds=(DataSource)ct.lookup("java:/comp/env/second");
            con=ds.getConnection();
        } catch (Exception e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
        return con;
        
    }
    
    //关闭的方法
    public void close(Connection con,PreparedStatement pst,ResultSet rs){
        try {
            if(rs!=null){
                rs.close();
            }
            if(pst!=null){
                pst.close();
            }
            if(con!=null){
                con.close();
            }
        } catch (SQLException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
    }
    //增加删除方法
    public int exceuteUpdate(String sql,Object[] obj ){
        int flag=0;
        try {
            pst=getCon().prepareStatement(sql);
            if(obj!=null){
                for(int i=0;i<obj.length;i++){
                    pst.setObject(i+1, obj[i]);
                }
            }
            flag=pst.executeUpdate();
        } catch (SQLException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
        return flag;
    }
}

