/**
 * Project Name:dt59homework
 * File Name:StringMethod.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:19:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.lvruiling;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:19:23 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class StringMethod {
    private final static Logger LOG = Logger.getLogger(StringMethod.class);

    public static void main(String[] args) throws InterruptedException {
        /**
         * constructor 对创建该函数的方法的引用<br/>
         * length 字符串的长度
         * 
         */
        String str = "          abcdefg  ";
        String str2 = str.replace("c", "我");
        String str3 = str.trim();
        // str.length();

        // str.charAt(0);
        // str.wait();
        // str.hashCode();
        LOG.info(str.length());// 返回此字符串的长度。
        LOG.info(str.charAt(6));// 返回指定位数上的字符

        LOG.info(str2);// 替换
        LOG.info(str.toUpperCase());// 全部大写
        LOG.info(str.hashCode());// 返回字符串的哈希值。
        LOG.info(str3);// 去掉首尾空格
    }

}
