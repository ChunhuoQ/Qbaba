/**
 * Project Name:Demo_dt59_news_01
 * File Name:BizDaoImpl.java
 * Package Name:cn.dt59.dao.impl
 * Date:2018年4月8日下午4:27:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.songhang.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m04.d10.songhang.dao.BaseDao;
import m04.d10.songhang.dao.BizDao;
import m04.d10.songhang.entity.NewsInfo;
import m04.d10.songhang.entity.Page;
import m04.d10.songhang.entity.UserInfo;

/**
 * Description: <br/>
 * Date: 2018年4月8日 下午4:27:48 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements BizDao {

    @Override
    public boolean validateUser(UserInfo user) {
        // TODO Auto-generated method stub
        boolean flag = false;
        try {
            String sql = "SELECT * FROM user_info a WHERE a.`username`=? AND a.`password`=?";
            pst = getCon().prepareStatement(sql);
            // 赋值
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getUserpwd());
            // 执行
            rs = pst.executeQuery();
            while (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return flag;
    }

    @Override
    public List<NewsInfo> all() {
        List<NewsInfo> list = new ArrayList<NewsInfo>();
        try {
            String sql = "SELECT * FROM news_info";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
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
            close(con, pst, rs);
        }

        return list;
    }

    @Override
    public List<NewsInfo> getNewsInfoPageById(Page page) {
        List<NewsInfo> listpage = new ArrayList<NewsInfo>();
        try {
            String sql = "select * from news_info limit ?,?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, (page.getCurrentpage() - 1) * page.getPagesize());
            pst.setInt(2, page.getPagesize());
            rs = pst.executeQuery();
            while (rs.next()) {
                NewsInfo info = new NewsInfo();
                info.setNewsId(rs.getInt(1));
                info.setTypeId(rs.getInt(2));
                info.setNewsTitle(rs.getString(3));
                info.setNewsAuthor(rs.getString(4));
                info.setNewsSummary(rs.getString(5));
                info.setNewsContent(rs.getString(6));
                info.setNewsPic(rs.getString(7));
                listpage.add(info);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }

        return listpage;
    }

    @Override
    public int updateNewsInfo(NewsInfo info) {

        int flag = 0;
        try {
            String sql = "UPDATE news_info SET type_id=?,news_title=?,news_author=?,news_summary=?,news_content=? WHERE news_id=?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, info.getTypeId());
            pst.setString(2, info.getNewsTitle());
            pst.setString(3, info.getNewsAuthor());
            pst.setString(4, info.getNewsSummary());
            pst.setString(5, info.getNewsContent());
            pst.setInt(6, info.getNewsId());
            flag = pst.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return flag;
    }

    @Override
    public int getsum() {
        int oo = 0;
        Page page = new Page();
        try {
            String sql = "select count(1) from news_info";
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
        }

        return oo;
    }
}
