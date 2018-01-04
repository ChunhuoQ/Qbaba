/**
 * Project Name:Qbaba
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:58:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:58:10 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
/*
 * 第一题： String的属性：length属性 Prototype 属性
 * String的方法列出：trim()，toString()，hashCode()，length()，equals(str3)，charAt(int
 * index)。。。<br/>
 */
public class StringDemo {
    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {

        String str = " a bc ";

        String str2 = str.trim();
        /* 方法一：返回字符串的副本，忽略前导空白和尾部空白。 */
        LOG.info("[" + str + "]");
        LOG.info("[" + str2 + "]");
        String str3 = str.toString();/* 方法二：返回此对象本身（它已经是一个字符串！）。 */
        LOG.info(str3);
        String strd = "老王abc";
        int str4 = strd.hashCode();/* 方法三：返回此字符串的哈希码。 */
        LOG.info(str4);
        int str5 = strd.length();/* 方法四：将此字符串与指定的对象比较 */
        LOG.info(str5);
        boolean str6 = strd.equals(str3);/* 方法五：返回字符串的副本，忽略前导空白和尾部空白。 */
        LOG.info(str6);
    }

}
