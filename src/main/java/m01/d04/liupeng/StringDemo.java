/**
 * Project Name:dt59-liupeng
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:07:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:07:10 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/**
 * 作业1：查看jdk api，列出String对象有哪些属性、方法，并写出使用示例（五个方法）<br/>
 * Description: <br/>
 * date: 2018年1月4日 下午2:13:10 <br/>
 *
 * @author LiuPeng
 * @version
 */
public class StringDemo {

    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {

        /** The value is used for character storage. */
        // private final char value[];

        /** Cache the hash code for the string */
        // private int hash; // Default to 0

        /** use serialVersionUID from JDK 1.0.2 for interoperability */
        // private static final long serialVersionUID = -6849794470754667710L;

        String str = " a bcdefghij ";

        /* 1.方法charAt(int index) 返回指定索引处的 char 值。 */
        LOG.info(str.charAt(0));// 当定义的字符串中有空格时，也是占用一个位置，可以输出“ ”;
        LOG.info(str.charAt(1));// 输出"a";

        /* 2.trim() 返回字符串的副本，忽略前导空白和尾部空白。 */
        LOG.info("[" + str + "]");// 输出" a bcdefghij "
        LOG.info("[" + str.trim() + "]");// 输出"a bcdefghij"

        /* 3.toUpperCase() 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。 */
        LOG.info("[" + str.toUpperCase() + "]");// 输出"[ A BCDEFGHIJ ]"

        /*
         * 4.replace(CharSequence target, CharSequence replacement) <br/>
         * 使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
         */
        LOG.info("[" + str.replace('a', 'z') + "]");// 输出"[ z bcdefghij ]";

        /* hashCode() 返回此字符串的哈希码。 */
        LOG.info("[" + str.hashCode() + "]");// 输出"[1485870649]"

        /* toString() 返回此对象本身（它已经是一个字符串！）。 */
        LOG.info("[" + str.toString() + "]");// 输出"[ a bcdefghij ]"
    }

}

