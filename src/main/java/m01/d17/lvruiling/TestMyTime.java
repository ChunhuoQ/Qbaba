/**
 * Project Name:Qbaba
 * File Name:TestMyTime.java
 * Package Name:m01.d17.lvruiling
 * Date:2018年1月17日下午3:53:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.lvruiling;


/**
 * Description: <br/>
 * Date: 2018年1月17日 下午3:53:53 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestMyTime {

    public static void main(String[] args) {
        MyTime my = new MyTime(15, 47, 30);
        my.second();
        my.addHour(1);
        my.addMinute(10);
        my.addSecond(15);
        my.subHour(1);
        my.subMinute(10);
        my.subSecond(15);
    }

}
