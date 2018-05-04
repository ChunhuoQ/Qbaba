/**
 * Project Name:Qbaba
 * File Name:MyBatisOpen.java
 * Package Name:m04.d12.Qbaba.mapper
 * Date:2018年4月13日上午1:42:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d23.Qbaba.impl;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Description:   <br/>
 * Date:     2018年4月13日 上午1:42:04 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class MyBatisOpen {
    static SqlSession session;
    static{
        try {
            //开启mybatis框架     SqlSession--> SqlSessionFactory--> SqlSessionFactoryBuilder
            //1 -->获取Sql
            SqlSessionFactoryBuilder sfb= new SqlSessionFactoryBuilder();
            //2 将sfb对象和mybatis.xml关联
            InputStream ins =Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory ssf=sfb.build(ins);
            session= ssf.openSession();
             } catch (Exception e) {
                 e.printStackTrace();
             }
    }

}

