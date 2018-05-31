/**
 * Project Name:Qbaba
 * File Name:Test_Junit.java
 * Package Name:m05.d14.test
 * Date:2018年5月15日上午10:20:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d14.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import m05.d14.impl.MyBatisOpen;
import m05.d14.mapper.GradeMapper;
import m05.d14.mapper.StuMapper;
import m05.d14.opjo.Grade;
import m05.d14.opjo.Stu;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * Description:   <br/>
 * Date:     2018年5月15日 上午10:20:18 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Test_Junit extends MyBatisOpen{
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
@Test
public  void show1(){
    StuMapper stu = session.getMapper(StuMapper.class);
    GradeMapper gd= session.getMapper(GradeMapper.class);
    
    List<HashMap<String,Object>> ls= stu.selectAllStu2();
    System.out.println(ls);
    List<Grade> list= gd.selectAllClass();
       
    System.out.println("班级\t学生姓名\t年龄\t学号");
    for (Grade grade : list) {
        /*System.out.println(grade.getStus());*/
        Set<Stu> stus =   grade.getStus();
        for (Stu st: stus) {  
            System.out.println(grade.getGclass()+'\t'+st.getSname()+'\t'+st.getSage()+'\t'+st.getScard());
        }
    }
    System.out.println(list);
    System.out.println(gd.selectAllClass());
    System.out.println(stu.selectAllStu());
    System.out.println(stu.selectDouble());
}
}

