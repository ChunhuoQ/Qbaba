/**
 * Project Name:Qbaba
 * File Name:BizDaoImpl.java
 * Package Name:m03.d28.Qbaba.impl
 * Date:2018年3月28日下午1:51:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.Qbaba.Dao.impl;

import java.util.ArrayList;
import java.util.List;

import m03.d28.Qbaba.Dao.BaseDao;
import m04.d03.Qbaba.Dao.NewsDao;
import m04.d03.Qbaba.entity.NewsInfo;
import m04.d03.Qbaba.entity.UserInfoDaoImpl;

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
}
