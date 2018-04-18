


/**
 * Project Name:Qbaba
 * File Name:BaseDao.java
 * Package Name:m03.d28.Qbaba.Dao
 * Date:2018年3月28日下午1:48:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.Qbaba.Dao;
/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午1:48:18 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
import java.io.InputStream;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.ResourceBundle;


public class BaseDao {
    protected Connection con=null;//连接通道
    protected PreparedStatement pst=null;//预编译
    protected ResultSet rs=null;//结果集
    protected CallableStatement cstate=null;
    static String driver;
    static String url;
    static String username;
    static String userpwd;
    static{
       
        try {
            Properties pro=new Properties();//Properties提供加属性文件的方法和读取属性文件中键的方法
           
        String path="database.properties";//属性文件的位置
            InputStream ist= BaseDao.class.getClassLoader().getResourceAsStream(path);//把属性文件以流的方式输出
            pro.load(ist);//加载二进流
            driver=pro.getProperty("driver");
            url=pro.getProperty("url");
            username=pro.getProperty("username");
            userpwd=pro.getProperty("password");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    /**
     *  @see 初始化数据库连接的
     * */
   
    //连接方法
    public Connection getCon(){
        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url, username, userpwd);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return con;
    }
    
    public int controlDml(String sql,Object[] obj){
        int flag=0;
        try {
            pst=getCon().prepareStatement(sql);
            if(obj!=null){
                for(int i=0;i<obj.length;i++){
                    pst.setObject(i+1, obj[i]);//赋值
                }
            }
            flag=pst.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            close(con,pst,rs);
        }
        return flag;
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
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}


