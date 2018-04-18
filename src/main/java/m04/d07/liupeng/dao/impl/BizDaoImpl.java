/**
 * Project Name:NewsSystem1.1
 * File Name:BizDaoImpl.java
 * Package Name:com.liupeng.dao.impl
 * Date:2018年4月5日下午8:48:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d07.liupeng.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m04.d07.liupeng.dao.BaseDao;
import m04.d07.liupeng.dao.Bizdao;
import m04.d07.liupeng.entity.CommentInfo;
import m04.d07.liupeng.entity.NewsInfo;
import m04.d07.liupeng.entity.UserInfo;

/**
 * Description:   <br/>
 * Date:     2018年4月5日 下午8:48:31 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements Bizdao {

    @Override
    public boolean validateUser(UserInfo user) {
        boolean flag = false;
        try {
            String sql = "SELECT * FROM user_info a WHERE a.`username`=? AND a.`password`=?";
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
            close(con, pst, rs, cstate);
        }
        return flag;
    }

    @Override
    public List<NewsInfo> getNews() {
        List<NewsInfo> listnews = new ArrayList<NewsInfo>();
        try {
            String sql = "SELECT * FROM news_info";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                NewsInfo ni = new NewsInfo();
                ni.setNews_id(rs.getInt(1));
                ni.setType_id(rs.getInt(2));
                ni.setNews_title(rs.getString(3));
                ni.setNews_author(rs.getString(4));
                ni.setNews_summary(rs.getString(5));
                ni.setNews_content(rs.getString(6));
                ni.setNews_pic(rs.getString(7));
                listnews.add(ni);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        return listnews;
    }

    @Override
    public int delNewsInfoById(int id) {

        int flag = 0;
        try {
            String sql = "DELETE FROM news_info WHERE news_id=?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, id);
            flag = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }

        return flag;
    }

    @Override
    public int upDataNewsInfoById(String title, String author, String summary, String content, int id) {
        int flag = 0;
        try {
            String sql = "UPDATE news_info SET news_title=?,news_author=?,news_summary=?,news_content=? WHERE news_id=?";
            pst = getCon().prepareStatement(sql);
            pst.setString(1, title);
            pst.setString(2, author);
            pst.setString(3, summary);
            pst.setString(4, content);
            pst.setInt(5, id);
            flag = pst.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        return flag;
    }

    @Override
    public List<CommentInfo> getCommentInfo() {
        List<CommentInfo> listCommentInfo = new ArrayList<CommentInfo>();
        try {
            String sql = "SELECT * FROM comment_info";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                CommentInfo ci = new CommentInfo();
                ci.setComment_id(rs.getInt(1));
                ci.setUsername(rs.getString(2));
                ci.setIp(rs.getString(3));
                ci.setContent(rs.getString(4));
                ci.setNews_id(rs.getInt(5));
                ci.setFbtime(rs.getDate(6));
                listCommentInfo.add(ci);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        return listCommentInfo;
    }

}

