/**
 * Project Name:Mybatis
 * File Name:NewsDaoImpl.java
 * Package Name:main.java.m04.d04.impl
 * Date:2018年4月4日下午5:27:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d04.Qbaba.impl;

import java.io.IOException;


import java.io.InputStream;
import java.util.List;

import m04.d04.Qbaba.entity.News;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * Description:   <br/>
 * Date:     2018年4月4日 下午5:27:02 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class NewsDaoImpl {
 @Test
public void getNews() throws IOException{
     try {
        
    
    //开启mybatis框架     SqlSession--> SqlSessionFactory--> SqlSessionFactoryBuilder
    //1 -->获取Sql
    SqlSessionFactoryBuilder sfb= new SqlSessionFactoryBuilder();
    //2 将sfb对象和mybatis.xml关联
    InputStream ins =Resources.getResourceAsStream("mybatis.xml");
    SqlSessionFactory ssf=sfb.build(ins);
    SqlSession session= ssf.openSession();
    //3 调用StudentDaoImpl.xml中的Sql语句
    List<News> list=session.selectList("m04.d04.Qbaba.impl.NewsDaoImpl.getNews");
    for (News news : list) {
        System.out.println(news.getUsername()+"\t"+news.getPassword());
    }
     } catch (Exception e) {
         e.printStackTrace();
     }
}
}

