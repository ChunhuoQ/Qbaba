/**
 * Project Name:Qbaba
 * File Name:NewsCommentDaoImpl.java
 * Package Name:m04.d08.Qbaba.impl
 * Date:2018年4月8日下午12:07:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d08.Qbaba.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import m04.d08.Qbaba.entity.NewsComment_info;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: <br/>
 * Date: 2018年4月8日 下午12:07:48 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class NewsCommentDaoImpl {
    SqlSession session;

    @Before
    public void getNews() throws IOException {
        try {
            // 开启mybatis框架 SqlSession--> SqlSessionFactory-->
            // SqlSessionFactoryBuilder
            // 1 -->获取Sql
            SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
            // 2 将sfb对象和mybatis.xml关联
            InputStream ins = Resources.getResourceAsStream("mybatis2.xml");
            SqlSessionFactory ssf = sfb.build(ins);
            session = ssf.openSession();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getNewsCommentSelect() {
        // 3 调用StudentDaoImpl.xml中的Sql语句
        List<NewsComment_info> list = session.selectList("m04.d08.Qbaba.impl.NewsCommentDaoImpl.getNewsCommentSelect");

        for (NewsComment_info news : list) {
            System.out.println(news.getComment_id() + "\t" + news.getUsername() + "\t" + news.getIp() + "\t"
                    + news.getContent() + "\t" + news.getNews_id() + "\t"  + news.getFbtime());
            ;
        }
    }

}
