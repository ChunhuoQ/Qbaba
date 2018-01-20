/**
 * File Name:TestMyTime.java
 * Package Name:m01.d18.songhang
 * Date:2018年1月17日下午7:16:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d18.songhang;

import m01.d17.songhang.MyTime;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月17日 下午7:16:56 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestMyTime {
    private final static Logger LOG = Logger.getLogger(TestMyTime.class);

    public static void main(String[] args) {
        MyTime str = new MyTime(5, 30, 50);
        str.display();
        str.addHour(2);
        str.subSecond(20);
    }

}
