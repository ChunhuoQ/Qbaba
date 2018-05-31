/**
 * Project Name:Qbaba
 * File Name:Demo.java
 * Package Name:m05.d31.com.dt59.test
 * Date:2018年5月31日上午9:59:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d31.com.dt59.test;

import m05.d31.com.dt59.ojpo.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

/**
 * Description:   <br/>
 * Date:     2018年5月31日 上午9:59:33 <br/>
 * @author   Qbaba
 * @version
 * @see
 */

@SuppressWarnings("deprecation")
public class Demo {

    
    @Test
    //session的新增
    public void fun2(){
        
        //1 创建,调用空参构造
        Configuration conf = new Configuration().configure();
        //2 根据配置信息,创建 SessionFactory对象
        SessionFactory sf;
        //4 session获得操作事务的Transaction对象
        //获得操作事务的tx对象
        //Transaction tx = session.getTransaction();
        //开启事务并获得操作事务的tx对象(建议使用)
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();  
        sf = conf.buildSessionFactory(serviceRegistry);  
        Session session = sf.openSession();
        Transaction tx2 = session.beginTransaction();
        //----------------------------------------------
        User c=new User();    
        c.setName("老磊头");
        c.setSex('男');
        session.save(c);
        //----------------------------------------------
        tx2.commit();//提交事务
        session.close();//释放资源
        sf.close();//释放资源
    }
    @Test
    //session的查询
    //查询id为1的customer对象
    public void fun3(){
        //1 创建,调用空参构造
        Configuration conf = new Configuration().configure();
        //2 根据配置信息,创建 SessionFactory对象
        SessionFactory sf = conf.buildSessionFactory();
        //3 获得session
        Session session = sf.openSession();
        //4 session获得操作事务的Transaction对象
        //获得操作事务的tx对象
        //Transaction tx = session.getTransaction();
        //开启事务并获得操作事务的tx对象(建议使用)
        Transaction tx2 = session.beginTransaction();
        //----------------------------------------------
        
        User user = (User) session.get(User.class, 1);
        
        System.out.println(user);
        session.delete(user);
        //----------------------------------------------
        tx2.commit();//提交事务
        session.close();//释放资源
        sf.close();//释放资源
    }
   
}

