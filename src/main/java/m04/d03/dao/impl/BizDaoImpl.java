/**
 * Project Name:Qbaba
 * File Name:BizDaoImpl.java
 * Package Name:m04.d03.dao.impl
 * Date:2018年4月3日下午5:08:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import m04.d03.dao.BaseDao;
import m04.d03.dao.BizDao;
import m04.d03.entity.NewsInfo;
import m04.d03.entity.UesrInfo;

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
    public boolean vaildataUser(UesrInfo user) {
        boolean flog = false;
        try {
            String sql = "SELECT*FROM user_info b WHERE b.username=? AND b.password=?";
            pat = getCon().prepareStatement(sql);
            pat.setString(1, user.getUsername());
            pat.setString(2, user.getPassword());
            rs = pat.executeQuery();
            while (rs.next()) {
                flog = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            colse(con, pat, rs);
        }
        return flog;
    }

    @Override
    public List<NewsInfo> all() {
        List<NewsInfo> list = new ArrayList<NewsInfo>();
        String sql = "SELECT news_title,news_author FROM news_info";
        try {
            pat = getCon().prepareStatement(sql);
            rs = pat.executeQuery();
            while (rs.next()) {
                NewsInfo nf = new NewsInfo();
                nf.setNewsTitle(rs.getString(1));
                nf.setNewsAuthor(rs.getString(2));
                list.add(nf);
            }
        } catch (SQLException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }

        return list;
    }

}
