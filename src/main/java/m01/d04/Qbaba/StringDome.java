/**
 * Project Name:Qbaba

 * File Name:StringDome.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:10:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.Qbaba;

import java.awt.Checkbox;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:10:25 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */

public class StringDome extends Object {

    private final static Logger LOG = Logger.getLogger(StringDome.class);

   

    public static void main(String[] args) {
                
    /** 
     * Description: <br/>
     * 第一题：1.列出String对象的属性：
     * 属性 constructor 属性 
     *    length 属性（字符串）
     *     prototype 属性 
     * @author Qbaba
     * @param args
     *       2.列出String对象的方法，并写出五个;
     *       String对象的方法：实例方法。包括toString()、toLocaleString()、valueOf()从Object对象继承的3种对象通用方法，
     *       chartAt()、中括号[]、charCodeAt()和fromCharCode()4种访问字符方法，concat()和加号+这2种字符串拼接方法，
     *       slice()、substr()和substring()3种创建子字符串方法，
     *       toLowerCase()、toLocaleLowerCase()、toUpperCase()、toLocaleUpperCase()这4种大小写转换方法，
     *       indexOf()和lastIndexOf()这2种查找字符串位置的方法，
     *       match()、search()、replace()、split()这4种正则匹配方法以及去除首尾空格的trim()方法
     *       localeCompare()字符串比较的方法
     */
        String strN="老王";
        String strt = "abc";
        String str0 = "ABC";
        String str = " a bc ";
        // 方法1：引用 String 的 trim 方法，忽略前导空白和尾部空白。
        String str2 = str.trim();
        // 方法2：将 str2 字符串连接到 str 字符串的结尾。
        String str3 = str.concat(str2);
        // 方法3：将 str2 与对象 str 作比较
        boolean str4 = str2.equals(str);
        // 方法4：将 str0 与 strt 比较(不考虑大小写);
        boolean str5 = str0.equalsIgnoreCase(strt);
        // 方法5:返回字符串 strN 的哈希码;
        int str6 = strN.hashCode();

        LOG.info("[" + str + "]");

        LOG.info("[" + str2 + "]");

        LOG.info("[" + str3 + "]");

        LOG.info("[" + str4 + "]");

        LOG.info("[" + str5 + "]");

        LOG.info("[" + str6 + "]");

        /**
         * 以下方法不知道啥玩意儿;
         */

        LOG.info(String.valueOf('A'));

        LOG.info(KeyEvent.getKeyText(4));

    }

}
