/**
 * Project Name:Qbaba
 * File Name:BizDaoImpl.java
 * Package Name:m04.d12.songhang.dao.impl
 * Date:2018年4月12日下午7:37:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.songhang.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m04.d17.songhang.dao.BaseDao;
import m04.d17.songhang.dao.BizDao;
import m04.d17.songhang.entity.Message;
import m04.d17.songhang.entity.News;
import m04.d17.songhang.entity.Page;
import m04.d17.songhang.entity.Product;
import m04.d17.songhang.entity.Revert;
import m04.d17.songhang.entity.User;

/**
 * Description: <br/>
 * Date: 2018年4月12日 下午7:37:47 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements BizDao {

    @Override
    public List<News> getNewsAll() {

        List<News> listnews = new ArrayList<News>();
        try {
            String sql = "SELECT*FROM news";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                News nf = new News();
                nf.setNid(rs.getInt(1));
                nf.setNtite(rs.getString(2));
                nf.setNcontent(rs.getString(3));
                nf.setNdate(rs.getDate(4));
                listnews.add(nf);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return listnews;
    }

    @Override
    public List<Product> getProductAll() {
        List<Product> listpro = new ArrayList<Product>();
        try {
            String sql = " SELECT*FROM product";
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
                pro.setPdesc(rs.getString(7));
                listpro.add(pro);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return listpro;
    }

    @Override
    public boolean validataUser(User user) {
        boolean flog = false;
        try {
            String sql = "SELECT*FROM USER WHERE uname=? AND upwd=?";
            pst = getCon().prepareStatement(sql);
            pst.setString(1, user.getUname());
            pst.setString(2, user.getUpwd());
            rs = pst.executeQuery();
            while (rs.next()) {
                flog = true;
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }

        return flog;
    }

    @Override
    public String getUstatus(User user) {
        String ustatus = "";
        try {
            String sql = "SELECT ustatus FROM USER WHERE uname=? AND upwd=?;";
            pst = getCon().prepareStatement(sql);
            pst.setString(1, user.getUname());
            pst.setString(2, user.getUpwd());
            rs = pst.executeQuery();
            while (rs.next()) {
                ustatus = rs.getString(1);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return ustatus;
    }

    @Override
    public List<Product> getNewsInfoPageById(Page page) {
        List<Product> listpro = new ArrayList<Product>();
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
                pro.setPdesc(rs.getString(7));
                listpro.add(pro);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }

        return listpro;
    }

    @Override
    public int getsum() {
        int oo = 0;
        Page page = new Page();
        try {
            String sql = "SELECT COUNT(1) FROM product ";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                page.setSumsize(rs.getInt(1));
                int i = page.getSumsize();
                oo = ((i % 3 == 0) ? i / 3 : i / 3 + 1);
                page.setLastpage(oo);
                oo = page.getLastpage();
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }

        return oo;
    }

    @Override
    public List<Message> getAllMessage() {
        List<Message> listmess = new ArrayList<Message>();
        try {
            String sql = "SELECT*FROM message";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Message info = new Message();
                info.setMid(rs.getInt(1));
                info.setMtitle(rs.getString(2));
                info.setMcontent(rs.getString(3));
                info.setMname(rs.getString(4));
                info.setMdate(rs.getDate(5));
                info.setRcount(rs.getInt(6));
                listmess.add(info);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }

        return listmess;
    }

    @Override
    public List<Revert> getAllRevert() {
        List<Revert> listRev = new ArrayList<Revert>();
        try {
            String sql = "SELECT*FROM revert";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Revert re = new Revert();
                re.setRid(rs.getInt(1));
                re.setMid(rs.getInt(2));
                re.setRcontent(rs.getString(3));
                re.setRname(rs.getString(4));
                re.setRdate(rs.getString(5));
                listRev.add(re);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }

        return listRev;
    }

    @Override
    public Message getMessageById(int id) {

        Message mess = null;
        try {
            String sql = "SELECT * FROM message WHERE MID=?";
            pst = getCon().prepareStatement(sql);
            // 赋值
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                mess = new Message();
                mess.setMid(rs.getInt(1));
                mess.setMtitle(rs.getString(2));
                mess.setMcontent(rs.getString(3));
                mess.setMname(rs.getString(4));
                mess.setMdate(rs.getDate(5));
                mess.setRcount(rs.getInt(6));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return mess;
    }
}
