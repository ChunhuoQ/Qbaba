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
 * Description:   <br/>
 * Date:     2018年3月28日 下午1:51:57 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class NewsDaoImpl extends BaseDao implements NewsDao  {

    @Override
    public boolean validateUser(UserInfoDaoImpl user) {
        boolean flag=false;
        try {
            String sql="SELECT * FROM user_info a WHERE a.username=? AND a.password=?";
            pst=getCon().prepareStatement(sql);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            rs=pst.executeQuery();
            while(rs.next()){
                flag=true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  Auto-generated method stub
        return flag;
    }

    @Override
    public List<NewsInfo> getAllNewsInfo() {
        List<NewsInfo> list=new ArrayList<NewsInfo>();
        
        try {
            String sql="SELECT news_title,news_author FROM news_info";
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                NewsInfo nf=new NewsInfo();
                nf.setNews_title(rs.getString(1));
                nf.setNews_author(rs.getString(2));
                list.add(nf);
            }
           
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        //  Auto-generated method stub
        return list;
    }
    
    
   

    
    
}

