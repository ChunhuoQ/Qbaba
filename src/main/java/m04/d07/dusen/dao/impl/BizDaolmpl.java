/**
 * Project Name:xinwen2
 * File Name:BizDaolmpl.java
 * Package Name:com.xin.dao.impl
 * Date:2018年4月8日上午10:08:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.xin.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xin.dao.BaseDao;
import com.xin.dao.BizDao;
import com.xin.entity.CommentInfo;
import com.xin.entity.NewsInfo;
import com.xin.entity.UserInfo;

/**
 * Description: <br/>
 * Date: 2018年4月8日 上午10:08:22 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class BizDaolmpl extends BaseDao implements BizDao {

    @Override
    public boolean denglu(UserInfo user) {
        boolean flag = false;
        String sql = "SELECT * FROM  user_info WHERE username=? AND PASSWORD=?";
        try {
            pst = getCon().prepareStatement(sql);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            rs = pst.executeQuery();
            while (rs.next()) {
                flag = true;
            }
        } catch (SQLException e) {

            // Auto-generated catch block
            e.printStackTrace();

        } finally {
            close(con, pst, rs);
        }
        return flag;
    }

    @Override
    public List<NewsInfo> all() {
        List<NewsInfo> ifo = new ArrayList<NewsInfo>();
        String sql = "SELECT * FROM news_info";
        try {
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                NewsInfo nif = new NewsInfo();
                nif.setNewsid(rs.getInt(1));
                nif.setTypeid(rs.getInt(2));
                nif.setNewstitle(rs.getString(3));
                nif.setNewsauthor(rs.getString(4));
                nif.setNewssumary(rs.getString(5));
                nif.setNewscontent(rs.getString(6));
                nif.setNewspic(rs.getString(7));
                ifo.add(nif);
            }
        } catch (SQLException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
        return ifo;
    }

    @Override
    public int re(int id) {
        int flag = 0;
        String sql = "DELETE FROM news_info  WHERE news_id=?";
        Object[] obj = new Object[1];
        obj[0] = id;
        flag = exceuteUpdate(sql, obj);
        return flag;
    }
    @Override
    public int add(Object t) {
        int flag = 0;
        String sql = "UPDATE news_info SET news_title=?,news_author=? WHERE news_id=?";
        Object[] obj = new Object[3];
        if (t instanceof NewsInfo) {
            NewsInfo nf = (NewsInfo) t;
            obj[0] = nf.getNewstitle();
            obj[1] = nf.getNewsauthor();
            obj[2] = nf.getNewsid();
        }
        flag=exceuteUpdate(sql, obj);
        return flag;
    }

    @Override
    public List<CommentInfo> all1() {
        List<CommentInfo> list=new ArrayList<CommentInfo>();
        String sql = "SELECT * FROM comment_info";
        
        try {
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                CommentInfo cif=new CommentInfo();
                cif.setCommentid(rs.getInt(1));
                cif.setUsername(rs.getString(2));
                cif.setIp(rs.getString(3));
                cif.setContent(rs.getString(4));
                cif.setNewsid(rs.getInt(5));
                cif.setFbtime(rs.getDate(6));
                list.add(cif);
            }
        } catch (SQLException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
        return list;
    }

}
