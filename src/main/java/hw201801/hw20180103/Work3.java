/**
 * Project Name:dt59homework
 * File Name:Work3.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:47:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw201801.hw20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:47:46 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Work3 {
    private final static Logger LOG = Logger.getLogger(Work3.class);

    @SuppressWarnings("null")
    public static void main(String[] args) {

        String str = null;//定义一个字符串为null；
        LOG.info(str);//输出
        try {
            str.length();//定义一个长度
        } catch (Exception e) {//抓取 异常信息

            // System.out.println(e);
            LOG.info("异常信息");
            e.printStackTrace();
            LOG.info(e);
        }

    }
}
