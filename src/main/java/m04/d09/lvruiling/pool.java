/**
 * Project Name:Qbaba
 * File Name:pool.java
 * Package Name:m04.d09.lvruiling
 * Date:2018年4月9日下午10:05:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d09.lvruiling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.hibernate.boot.model.relational.Database;

import com.mysql.jdbc.CallableStatement;

/**
 * Description: <br/>
 * Date: 2018年4月9日 下午10:05:59 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class pool {
    protected Connection con = null;

    protected PreparedStatement pst = null;

    protected ResultSet rs = null;

    protected CallableStatement cstate = null;

    protected Database ds = null;

    // 连接方法
    public Connection getCon() {
        try {
            Context ctx = new InitialContext();
            ds = (Database) ctx.lookup("java:/comp/env/root");
            con = ds.getConnection();

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
                    pst.setObject(i + 1, obj[i]);
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

    // 关闭
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
