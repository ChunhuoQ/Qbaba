/**
 * Project Name:Mybatis
 * File Name:DomeTest.java
 * Package Name:main.java.m04.d04.test
 * Date:2018年4月4日下午4:42:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Qbaba;

import java.io.IOException;

import Qbaba.impl.NewsDaoImpl;

/**
 * Description:   <br/>
 * Date:     2018年4月4日 下午4:42:34 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class DomeTest {
public static void main(String[] args) {
    NewsDaoImpl nl=new NewsDaoImpl();
    try {
        nl.getNews();
    } catch (IOException e) {
        //  Auto-generated catch block
        e.printStackTrace();
        
    }
}
}

