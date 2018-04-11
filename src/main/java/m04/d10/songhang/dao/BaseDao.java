package m04.d10.songhang.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BaseDao {
    protected Connection con = null;// ����ͨ��

    protected PreparedStatement pst = null;// Ԥ����

    protected ResultSet rs = null;// ���

    protected CallableStatement cstate = null;// ���ô洢��̵Ľӿ�

    protected DataSource ds = null;

    // ���ӷ���
    public Connection getCon() {

        try {
            Context cns = new InitialContext();
            ds = (DataSource) cns.lookup("java:/comp/env/second");
            con = ds.getConnection();
            // Class.forName(driver);
            // con = DriverManager.getConnection(url, username, userpwd);
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
                    pst.setObject(i + 1, obj[i]);// ��ֵ
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

    // �رյķ���
    public void close(Connection con, PreparedStatement pst, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
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
