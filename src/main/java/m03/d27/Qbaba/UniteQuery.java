package m03.d27.Qbaba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:   <br/>
 * Date:     2018年3月27日 上午9:19:09 <br/>
 * @author   Qbaba
 * @version 如果取多表（联合查询）数据时候，
 *          那么实体类如何处理？ 如果不用实体类，怎写
 * @see
 */
public class UniteQuery {

    public static void main(String[] args) {
       UniteQuery uq=new UniteQuery();
       System.out.println("sid\t成绩\t考试时间\t\t\t学生姓名");
       uq.getAllscore();
        
    }
    ResultSet rt;
    Connection con=null;
    PreparedStatement pst = null;
    private String url="jdbc:mysql://localhost:3306/mydata";
    String sql ="SELECT c.sid,c.`sexam`,c.`sdate`,d.`StudentName` AS dstuname FROM score c INNER JOIN student d ON d.StudentNo=c.`studentno` WHERE c.`studentno`";
    public Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,"root","root");
        } catch (Exception e) {
        e.printStackTrace();
        }
        return con;
    }
    
    public void getAllscore(){
    
        try {
            
            Statement st = getCon().createStatement();
            rt = st.executeQuery(sql);
            while(rt.next()){
                
                int rid= rt.getInt("sid");
                int Sexam=rt.getInt("sexam");
               String Sdate=rt.getString("sdate");
               
                String stuname=rt.getString("dstuname");
               
                System.out.println(rid+"\t"+Sexam+"\t"+Sdate+"\t"+stuname);
            }
            
            
        } catch (Exception e) {
           e.printStackTrace();
        }
        
    }

  
    
}

