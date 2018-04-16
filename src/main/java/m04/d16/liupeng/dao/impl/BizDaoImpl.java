/**
 * Project Name:PinHong
 * File Name:BizDaoImpl.java
 * Package Name:BizDao
 * Date:2018年4月12日下午10:10:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.liupeng.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m04.d16.liupeng.dao.BaseDao;
import m04.d16.liupeng.dao.BizDao;
import m04.d16.liupeng.entity.Message;
import m04.d16.liupeng.entity.News;
import m04.d16.liupeng.entity.Page;
import m04.d16.liupeng.entity.Product;
import m04.d16.liupeng.entity.Revert;
import m04.d16.liupeng.entity.User;

/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午10:10:19 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements BizDao {

    @Override
    public List<News> getAllNews() {
        List<News> listnews = new ArrayList<News>();
        try {
            String sql = "SELECT * FROM news";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                News ns = new News();
                ns.setNid(rs.getInt(1));
                ns.setNtitle(rs.getString(2));
                ns.setNcontent(rs.getString(3));
                ns.setNdate(rs.getDate(4));
                listnews.add(ns);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return listnews;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> listpro = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setPid(rs.getInt(1));
                pro.setPname(rs.getString(2));
                pro.setPbrand(rs.getString(3));
                pro.setPmodel(rs.getString(4));
                pro.setPprice(rs.getDouble(5));
                pro.setPpicture(rs.getString(6));
                pro.setPdes(rs.getString(7));
                listpro.add(pro);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return listpro;
    }

    @Override
    public List<User> getAllUser() {
        List<User> listuser = new ArrayList<User>();
        try {
            String sql = "SELECT * FROM USER";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUid(rs.getInt(1));
                user.setUname(rs.getString(2));
                user.setUpwd(rs.getString(3));
                user.setUstatus(rs.getString(4));
                user.setUpic(rs.getString(5));
                listuser.add(user);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return listuser;
    }

    @Override
    public boolean validateUser(User user) {
        boolean flag = false;
        try {
            String sql = "SELECT * FROM USER WHERE uname=? AND upwd=?";
            pst = getCon().prepareStatement(sql);
            pst.setString(1, user.getUname());
            pst.setString(2, user.getUpwd());
            rs = pst.executeQuery();
            while (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return flag;
    }

    @Override
    public List<Product> getProductByPage(Page page) {

        List<Product> listp = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product LIMIT ?,?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, (page.getCurrentpage() - 1) * page.getPagesize());
            pst.setInt(2, page.getPagesize());
            rs = pst.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setPid(rs.getInt(1));
                pro.setPname(rs.getString(2));
                pro.setPbrand(rs.getString(3));
                pro.setPmodel(rs.getString(4));
                pro.setPprice(rs.getDouble(5));
                pro.setPpicture(rs.getString(6));
                pro.setPdes(rs.getString(7));
                listp.add(pro);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        return listp;
    }

    @Override
    public int getProductSize() {
        int count = 0;
        try {
            String sql = "SELECT COUNT(1) FROM product";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return count;
    }

    @Override
    public List<Message> getAllMessage() {

        List<Message> listmes = new ArrayList<Message>();
        try {
            String sql = "SELECT * FROM message";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Message mes = new Message();
                mes.setMid(rs.getInt(1));
                mes.setMtitle(rs.getString(2));
                mes.setMcontent(rs.getString(3));
                mes.setMname(rs.getString(4));
                mes.setMdate(rs.getString(5));
                mes.setRcount(rs.getInt(6));
                listmes.add(mes);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return listmes;
    }

    @Override
    public List<Revert> getAllRevert(int id) {

        List<Revert> listrev = new ArrayList<Revert>();
        try {
            String sql = "SELECT * FROM revert AS r WHERE r.`mid` =?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                Revert rev = new Revert();
                rev.setRid(rs.getInt(1));
                rev.setMid(rs.getInt(2));
                rev.setRcontent(rs.getString(3));
                rev.setRname(rs.getString(4));
                rev.setRdate(rs.getString(5));
                listrev.add(rev);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return listrev;
    }

    @Override
    public List<Message> getAllMessageById(int id) {

        List<Message> listrm = new ArrayList<Message>();
        try {
            String sql = "SELECT * FROM message AS r WHERE r.`mid` =?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                Message mes = new Message();
                mes.setMid(rs.getInt(1));
                mes.setMtitle(rs.getString(2));
                mes.setMcontent(rs.getString(3));
                mes.setMname(rs.getString(4));
                mes.setMdate(rs.getString(5));
                mes.setRcount(rs.getInt(6));
                listrm.add(mes);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        // Auto-generated method stub
        return listrm;
    }

}

