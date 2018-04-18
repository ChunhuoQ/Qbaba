/**
 * Project Name:Qbaba
 * File Name:BizDaoImpl.java
 * Package Name:m04.d03.dao.impl
 * Date:2018年4月3日下午5:08:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.songhang.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m04.d03.songhang.dao.BaseDao;
import m04.d03.songhang.dao.BizDao;
import m04.d03.songhang.entity.CommentInfo;
import m04.d03.songhang.entity.NewsInfo;
import m04.d03.songhang.entity.UesrInfo;

/**
 * Description: <br/>
 * Date: 2018年4月3日 下午5:08:33 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements BizDao {

    @Override
    public List<NewsInfo> all() {
        List<NewsInfo> list = new ArrayList<NewsInfo>();
        try {
            String sql = "select * from news_info";
            pat = getCon().prepareStatement(sql);
            rs = pat.executeQuery();
            while (rs.next()) {
                NewsInfo info = new NewsInfo();
                info.setNewsId(rs.getInt(1));
                info.setTypeId(rs.getInt(2));
                info.setNewsTitle(rs.getString(3));
                info.setNewsAuthor(rs.getString(4));
                info.setNewsSummary(rs.getString(5));
                info.setNewsContent(rs.getString(6));
                info.setNewsPic(rs.getString(7));
                list.add(info);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            colse(con, pat, rs);
        }

        return list;
    }

    @Override
    public boolean vaildataUser(UesrInfo user) {
        boolean flag = false;
        try {
            String sql = "SELECT * FROM user_info a WHERE a.`username`=? AND a.`password`=?";
            pat = getCon().prepareStatement(sql);
            // 赋值
            pat.setString(1, user.getUsername());
            pat.setString(2, user.getPassword());
            // 执行
            rs = pat.executeQuery();
            while (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            colse(con, pat, rs);
        }
        return flag;
    }

    @Override
    public List<CommentInfo> showInfo() {
        List<CommentInfo> list = new ArrayList<CommentInfo>();
        try {
            String sql = "SELECT * FROM comment_info";
            pat = getCon().prepareStatement(sql);
            rs = pat.executeQuery();
            while (rs.next()) {
                CommentInfo comm = new CommentInfo();
                comm.setComment_id(rs.getInt(1));
                comm.setUsername(rs.getString(2));
                comm.setIp(rs.getString(3));
                comm.setContent(rs.getString(4));
                comm.setNews_id(rs.getInt(5));
                comm.setFbtime(rs.getDate(6));
                list.add(comm);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            colse(con, pat, rs);
        }
        return list;
    }

    @Override
    public int updateNewsInfo(NewsInfo info) {
        int flag1 = 0;

        try {
            String sql = "UPDATE news_info SET type_id=?,news_title=?,news_author=?,news_summary=?,news_content=? WHERE news_id=?";
            pat = getCon().prepareStatement(sql);
            pat.setInt(1, info.getTypeId());
            pat.setString(2, info.getNewsTitle());
            pat.setString(3, info.getNewsAuthor());
            pat.setString(4, info.getNewsSummary());
            pat.setString(5, info.getNewsContent());
            pat.setInt(6, info.getNewsId());
            flag1 = pat.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            colse(con, pat, rs);
        }

        return flag1;
    }

    @Override
    public int delNewsInfoById(String id) {
        int flog = 0;
        int id1 = Integer.valueOf(id);
        try {
            String sql = "DELETE FROM news_info WHERE news_id=?";
            pat = getCon().prepareStatement(sql);
            pat.setInt(1, id1);
            flog = pat.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            colse(con, pat, rs);
        }

        return flog;
    }
}
