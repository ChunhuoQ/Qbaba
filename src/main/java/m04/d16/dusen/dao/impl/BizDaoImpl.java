
/**
 * Project Name:pinhong1
 * File Name:BizDaoImpl.java
 * Package Name:com.dao.impl
 * Date:2018年4月12日下午9:53:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.dusen.dao.impl;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import m04.d16.dusen.dao.BaseDao;
import m04.d16.dusen.dao.BizDao;
import m04.d16.dusen.entity.News;
import m04.d16.dusen.entity.Page;
import m04.d16.dusen.entity.Product;
import m04.d16.dusen.entity.Use;



/**
 * Description: <br/>
 * Date: 2018年4月12日 下午9:53:16 <br/>
 * 
 * @author lenovopc
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements BizDao {

    @Override
    public List<News> getAllNews() {
        List<News> list = new ArrayList<News>();
        String sql = "SELECT * FROM news";
        try {
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                News ne = new News();
                ne.setNid(rs.getInt(1));
                ne.setNtitle(rs.getString(2));
                ne.setNcontent(rs.getString(3));
                ne.setNdate(rs.getDate(4));
                list.add(ne);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }
        return list;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> listpro = new ArrayList<Product>();
        String sql = "SELECT * FROM product";

        try {
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setPid(rs.getInt(1));
                pro.setPname(rs.getString(2));
                pro.setPdrand(rs.getString(3));
                pro.setPmodel(rs.getString(4));
                pro.setPprice(rs.getDouble(5));
                pro.setPpicture(rs.getString(6));
                pro.setPdes(rs.getString(7));
                listpro.add(pro);
            }
        } catch (Exception e) {

            // Auto-generated catch block
            e.printStackTrace();

        } finally {
            close(con, cs, rs);
        }
        // Auto-generated method stub
        return listpro;
    }

    @Override
    public boolean getUser(Use use) {
        boolean flag = false;
        String sql = "SELECT * FROM USER WHERE uname=? AND upwd=?";
        try {
            pst = getCon().prepareStatement(sql);
            pst.setString(1, use.getUname());
            pst.setString(2, use.getUpwd());
            rs = pst.executeQuery();
            while (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }

        return flag;
    }

    @Override
    public List<Use> getAllUse() {
        List<Use> listu = new ArrayList<Use>();
        String sql = "SELECT * FROM USER";
        try {
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Use us = new Use();
                us.setUid(rs.getInt(1));
                us.setUname(rs.getString(2));
                us.setUpwd(rs.getString(3));
                us.setUstatus(rs.getString(4));
                us.setUpic(rs.getString(5));
                listu.add(us);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }
        return listu;
    }

    public String getQuanXian(Use use) {
        String qx = "";
        String sql = "SELECT ustatus FROM USER WHERE uname=? AND upwd=?";
        try {
            pst = getCon().prepareStatement(sql);
            pst.setString(1, use.getUname());
            pst.setString(2, use.getUpwd());
            rs = pst.executeQuery();
            while (rs.next()) {
                qx = rs.getString(1);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }

        return qx;
    }

    @Override
    public List<Product> fen(Page page) {
        List<Product> list = new ArrayList<Product>();
        String sql = "SELECT * FROM  product LIMIT  ?,? ";
        try {
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, (page.getCurrentpage() - 1) * page.getPagesize());
            pst.setInt(2, page.getPagesize());
            rs = pst.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setPid(rs.getInt(1));
                pro.setPname(rs.getString(2));
                pro.setPdrand(rs.getString(3));
                pro.setPmodel(rs.getString(4));
                pro.setPprice(rs.getDouble(5));
                pro.setPpicture(rs.getString(6));
                pro.setPdes(rs.getString(7));
                list.add(pro);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }finally{
            close(con, cs, rs);
        }
        // Auto-generated method stub
        return list;
    }
    
    public int count(){
        int flag=0;
        try {
            String sql="SELECT COUNT(1) FROM  product";
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                flag=rs.getInt(1);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return flag;
        
    }
    

}
