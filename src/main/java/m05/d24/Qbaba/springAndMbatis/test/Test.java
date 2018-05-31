/**
 * Project Name:Qbaba
 * File Name:Test.java
 * Package Name:m05.d24.Qbaba.springAndMbatis.test
 * Date:2018年5月25日上午11:04:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d24.Qbaba.springAndMbatis.test;
import m05.d24.Qbaba.springAndMbatis.controller.SmbmsUserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:   <br/>
 * Date:     2018年5月25日 上午11:04:03 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Test {
    
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        SmbmsUserServlet susi=(SmbmsUserServlet)context.getBean("smbmsUserServlet");
        susi.doGet();
    }
  
}

