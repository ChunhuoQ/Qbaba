
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import m04.d04.Qbaba.entity.News;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

/**
 * Description:   <br/>
 * Date:     2018年4月4日 下午5:27:02 <br/>
 * @author   Qbaba
 * @version
 * @see
 */

/**
 * Project Name:Mybatis
 * File Name:NewsDaoImpl.java
 * Package Name:main.java.m04.d04.impl
 * Date:2018年4月4日下午5:27:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */





import java.io.IOException;


/**
 * Description:   <br/>
 * Date:     2018年4月4日 下午5:27:02 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class NewsDaoImpl {
    SqlSession session;
@Before
public void getNews() throws IOException{
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
@Test
 public void getNewsSelect(){
   //3 调用StudentDaoImpl.xml中的Sql语句
     List<News> list=session.selectList("m04.d04.Qbaba.impl.NewsDaoImpl.getNewsSelect");
     System.out.println("用户名\t密码");
     for (News news : list) {
         System.out.println(news.getUsername()+"\t"+news.getPassword());
     }
 }
@Test
 public void getNewsInsert(){
     
     int result=session.insert("m04.d04.Qbaba.impl.NewsDaoImpl.getNewsInsert");
     session.commit();
     if(result==1){
         System.out.println("添加成功");
     }
 }

public void getNewsInsert2(String username,String password){
    News news=new News(username,password);
    int result=session.insert("m04.d04.Qbaba.impl.NewsDaoImpl.getNewsInsert2",news);
    session.commit();
    if(result==1){
        System.out.println("添加成功");
    }
}

public void getNewsInsert3(String username,String password){
   Map<String,Object> map = new HashMap<String,Object>();
   map.put("username",username);
   map.put("password",password);
    int result=session.insert("m04.d04.Qbaba.impl.NewsDaoImpl.getNewsInsert3",map);
    session.commit();
    if(result==1){
        System.out.println("添加成功");
    }
}
@Test
public void getNewsDelete(){
     
     int result=session.insert("m04.d04.Qbaba.impl.NewsDaoImpl.getNewsDelete",15L);
     session.commit();
     if(result==1){
         System.out.println("删除成功");
     }
 }
}


