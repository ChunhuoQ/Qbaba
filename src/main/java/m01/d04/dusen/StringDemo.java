/**
 * Project Name:dt59homework
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:27:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.dusen;



import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:27:59 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class StringDemo {
    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    /**
     * 
     * 属性 ················描述<br/>
     * constructor······· 返回创建该对象的构造函数。<br/>
     * length ············返回字符串的长度(字符数)。<br/>
     * prototype ·········返回创建该对象的函数的原型对象。<br/>
     *
     */
    public static void main(String[] args) {
        /**
         * 方法一
         */
        // 生成一个制字符串
        String a = "132456";
        // 获取字符串长度
        int b = a.length();
        // 输出字符串长度
        LOG.info("长度：" + b);

        LOG.info("```````````````````````");
        /**
         * 方法二 hashCode<br/>
         * 
         * 返回此字符串的哈希码
         */
        String c = "A";
        int i = c.hashCode();
        LOG.info(i);
        /**
         * 方法三 toLowerCase()<br/>
         * 使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
         */
        String d = "ABSCADAFDSFG";
        String j = d.toLowerCase();
        LOG.info("输出值为：" + j);
        /**
         * 方法四 toString() <br/>
         * 返回此对象本身（）它已经是一个字符串
         */
        String e = "asjhvbmcxa.czx";
        String k = e.toString();
        LOG.info("字符串是：" + k);
        /**
         * 方法五 ：trim（）
         * 返回字符串的副本，忽略前导空白和尾部空白。
         */
        String f=" a s  a  ";
        String g=" a s  a  ";
        String l=f.trim();
        LOG.info("输出的值 是："+l);
        LOG.info("输出的值 是："+g);
    }

}
