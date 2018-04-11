/**
 * Project Name:Qbaba
 * File Name:BizDaoImpl.java
 * Package Name:m03.d28.Qbaba.impl
 * Date:2018年3月28日下午1:51:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d09.Qbaba.Dao.impl;

import java.util.ArrayList;


import java.util.List;

import m04.d09.Qbaba.Dao.BaseDao;
import m04.d09.Qbaba.Dao.NewsDao;
import m04.d09.Qbaba.entity.NewsCommentInfo;
import m04.d09.Qbaba.entity.NewsInfo;
import m04.d09.Qbaba.entity.Page;
import m04.d09.Qbaba.entity.UserInfoDaoImpl;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午1:51:57 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class NewsDaoImpl extends BaseDao implements NewsDao {

    @Override
    public boolean validateUser(UserInfoDaoImpl user) {
        boolean flag = false;
        try {
            String sql = "SELECT * FROM user_info a WHERE  a.username=? AND a.password=?";
            pst = getCon().prepareStatement(sql);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            rs = pst.executeQuery();
            while (rs.next()) {
                flag = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        // Auto-generated method stub
        return flag;
    }

    /**
     *
     * @see m04.d03.Qbaba.Dao.NewsDao#Deletenews()
     */
    @Override
    public int Deletenews(int id) {
        int flag = 0;
        try {
            String sql = "DELETE FROM news_info WHERE news_id=?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, id);
            flag = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }

        return flag;
    }

    @Override
    public List<NewsInfo> getAllNewsInfo() {
        List<NewsInfo> list = new ArrayList<NewsInfo>();
        
        try {
            String sql = "SELECT * FROM news_info";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                NewsInfo info = new NewsInfo();
                info.setNews_id(rs.getInt(1));
                info.setType_id(rs.getInt(2));
                info.setNews_title(rs.getString(3));
                info.setNews_author(rs.getString(4));
                info.setNews_summary(rs.getString(5));
                info.setNews_content(rs.getString(6));
                info.setNews_pic(rs.getString(7));
                list.add(info);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        // Auto-generated method stub
        return list;
    }
    public List<NewsInfo> getNewsInfo(int id) {
        List<NewsInfo> list1 = new ArrayList<NewsInfo>();
        try {
            String sql = "SELECT * FROM news_info where id=?";

            pst = getCon().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                NewsInfo info = new NewsInfo();
                info.setNews_id(rs.getInt(1));
                info.setType_id(rs.getInt(2));
                info.setNews_title(rs.getString(3));
                info.setNews_author(rs.getString(4));
                info.setNews_summary(rs.getString(5));
                info.setNews_content(rs.getString(6));
                info.setNews_pic(rs.getString(7));
                list1.add(info);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        // Auto-generated method stub
        return list1;
    }

    @Override
    public int UpdateNews(Object id,String author,String title,String nsummary,String ncontent) {
       
        int flag=0;
        try {
            String id2=(String)id;
            Integer id1=Integer.valueOf(id2);
            String sql="UPDATE news_info SET news_author=?,news_title=?,news_summary=?,news_content=? WHERE news_id=?";
            pst = getCon().prepareStatement(sql);
            pst.setString(1, author);
            pst.setString(2, title);
            pst.setString(3, nsummary);
            pst.setString(4, ncontent);
            pst.setInt(5, id1);
            flag = pst.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }

    /**
     *
     * @see m04.d03.Qbaba.Dao.NewsDao#getAllNewsComment()
     */
    @Override
    public List<NewsCommentInfo> getAllNewsComment() {
        List<NewsCommentInfo> listc=new ArrayList<NewsCommentInfo>();
        //  Auto-generated method stub
        try {
            String sql="SELECT * FROM comment_info";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                NewsCommentInfo  infoc = new NewsCommentInfo();
                infoc.setNews_id(rs.getInt(1));
                infoc.setUsername(rs.getString(2));
                infoc.setIp(rs.getInt(3));
                infoc.setCotent(rs.getString(4));
                infoc.setNews_id(rs.getInt(5));
                infoc.setFbtime(rs.getDate(6));
                listc.add(infoc);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return listc;
    }

    @Override
    public List<NewsInfo> getNewsInfoByPage(Page page) {
        List<NewsInfo> list2=new ArrayList<NewsInfo>();
        try {
            String sql="SELECT * FROM news_info LIMIT ?,?";
            pst=getCon().prepareStatement(sql);
            pst.setInt(1,(page.getCurrentpage()-1)*page.getPagesize());
            pst.setInt(2,page.getPagesize());
            rs=pst.executeQuery();
            while (rs.next()) {
                NewsInfo info = new NewsInfo();
                info.setNews_id(rs.getInt(1));
                info.setType_id(rs.getInt(2));
                info.setNews_title(rs.getString(3));
                info.setNews_author(rs.getString(4));
                info.setNews_summary(rs.getString(5));
                info.setNews_content(rs.getString(6));
                info.setNews_pic(rs.getString(7));
                list2.add(info);
            
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        //  Auto-generated method stub
        return list2;
    }

    /**
     *
     * @see m04.d09.Qbaba.Dao.NewsDao#getNewsInfoLastPage()
     */
    @Override
    public int getNewsInfoLastPage(Page page) {
            int oo = 0;
        try {
            String sql="SELECT COUNT(1) FROM news_info";
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            
            while (rs.next()) {
            page.setLastpage(rs.getInt(1));
            int i=page.getLastpage();
            oo=(i%3==0)?i/3:i/3+1;
            page.setLastpage(oo);
            }
            
             
        } catch (Exception e) {
          e.printStackTrace();
        }
        return page.getLastpage();
    }
    
    
}
