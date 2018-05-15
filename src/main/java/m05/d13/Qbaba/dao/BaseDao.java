package m05.d13.Qbaba.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDao {
	protected Connection con=null;
	protected PreparedStatement pst=null;
	protected ResultSet rs=null;
	protected CallableStatement cst=null;//�洢��̵Ľӿ�
	private String url=" jdbc:oracle:thin:@localhost:1521:orcl";//��Դ
	public Connection getCon(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection(url, "Qbaba", "aishinihewo");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	
}
