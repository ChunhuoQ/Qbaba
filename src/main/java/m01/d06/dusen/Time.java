/**
 * Project Name:dt59homework
 * File Name:Time.java
 * Package Name:hw20180106
 * Date:2018年1月7日上午10:44:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.dusen;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 上午10:44:12 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Time {
    private final static Logger LOG = Logger.getLogger(Time.class);

    public static void main(String[] args) {

        // Date date = new Date(2018 - 1900, 1 - 1, 7);
        Date date = new Date();
        LOG.info("A今天是：" + date);
        
        
        /**
         * G 公元 y年 M月份 w 周数    W月份中的周数  a am/pm   H(0-23)小时数<br/>
         * k(1-24)小时数   K am/pm中的小时数（0-11）   h（1-12）am/pm中的小时数<br/>
         * m小时中的分针数    s分针中的秒数   S毫秒数    z   Z  时区
         */
        SimpleDateFormat a = new SimpleDateFormat("G yyyy M d E  a \\ HH:mm:ss S  Z");
        String strDate = a.format(date);
        LOG.info("时间是："+strDate);
        // SimpleDateFormat SDF = new
        // SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss.SSSZ");
        // String strDate = SDF.format(date);
        // LOG.info("B今天是：" + strDate);
        // SimpleDateFormat SDF1 = new
        // SimpleDateFormat("yyyy.MM.dd G  HH:mm:ss Z");
        // String strDate1 = SDF1.format(date);
        // LOG.info("C今天是:" + strDate1);
        // SimpleDateFormat SDF2=new SimpleDateFormat("EEE,MMM dd,  yy");
        // String strDate2=SDF2.format(date);
        // LOG.info("D今天是："+strDate2);
        // SimpleDateFormat SDF3=new SimpleDateFormat("h:mm a");
        // String strDate3=SDF3.format(date);
        // LOG.info("E今天是："+strDate3);
        // SimpleDateFormat SDF4=new SimpleDateFormat("hh'o''clock' a,zzzz");
        // String strDate4=SDF4.format(date);
        // LOG.info("F今天是："+strDate4);
        // SimpleDateFormat SDF5=new SimpleDateFormat("K:mm a, z");
        // String strDate5=SDF5.format(date);
        // LOG.info("G今天是："+strDate5);
        // SimpleDateFormat SDF6=new
        // SimpleDateFormat("yyyy.MMMMM.dd GGG hh:mm aaa");
        // String strDate6=SDF6.format(date);
        // LOG.info("H今天是："+strDate6);
        // SimpleDateFormat SDF7=new SimpleDateFormat("MM\\dd\\yy HH:mm:ss Z ");
        // String strDate7=SDF7.format(date);
        // LOG.info("I今天是："+strDate7);
        // SimpleDateFormat SDF8=new
        // SimpleDateFormat("G yyyy MMM  d EEE,时间  HH:mm:ss 第w周");
        // String strDate8=SDF8.format(date);
        // LOG.info("J今天是："+strDate8);

    }

}
