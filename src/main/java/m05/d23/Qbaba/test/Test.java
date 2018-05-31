/**
 * Project Name:Qbaba
 * File Name:Test.java
 * Package Name:m05.d23.Qbaba.test
 * Date:2018年5月23日下午11:24:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d23.Qbaba.test;

import m04.d11.entity.User;
import m05.d23.Qbaba.aop.MobiDaoImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:   <br/>
 * Date:     2018年5月23日 下午11:24:18 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MobiDaoImpl mdi=(MobiDaoImpl)context.getBean("mobiDaoImpl");
        try {
            mdi.select();
            mdi.inset();
        } catch (Exception e) {
            
         
        }
       /* mdi.zhuanZhang();
        mdi.inset();*/
        
    }
       
    
    
}

