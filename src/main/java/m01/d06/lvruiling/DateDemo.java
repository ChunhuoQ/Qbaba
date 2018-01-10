/**
 * Project Name:Qbaba
 * File Name:DateDemo.java
 * Package Name:m01.d06.lvruiling
 * Date:2018年1月7日下午2:50:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.lvruiling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午2:50:16 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class DateDemo {
    private final static Logger LOG = Logger.getLogger(DateDemo.class);

    public static void main(String[] args) {
        Date date = new Date(2018 - 1900, 1 - 1, 7);
        LOG.info("(模板1)今天是：" + date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String strdate = sdf.format(date);
        LOG.info("(模板2)今天是：" + strdate);
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM d, ''yy");
        String strdate1 = sdf1.format(date);
        LOG.info("(模板3)今天是：" + strdate1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("h:mm a");
        String strdate2 = sdf2.format(date);
        LOG.info("(模板4)今天是：" + strdate2);
        SimpleDateFormat sdf3 = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        String strdate3 = sdf3.format(date);
        LOG.info("(模板5)今天是：" + strdate3);
        SimpleDateFormat sdf4 = new SimpleDateFormat("K:mm a, z");
        String strdate4 = sdf4.format(date);
        LOG.info("(模板6)今天是：" + strdate4);
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        String strdate5 = sdf5.format(date);
        LOG.info("(模板7)今天是：" + strdate5);
        SimpleDateFormat sdf6 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        String strdate6 = sdf6.format(date);
        LOG.info("(模板8)今天是：" + strdate6);
        SimpleDateFormat sdf7 = new SimpleDateFormat("yyMMddHHmmssZ");
        String strdate7 = sdf7.format(date);
        LOG.info("(模板9)今天是：" + strdate7);
        SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String strdate8 = sdf8.format(date);
        LOG.info("(模板10)今天是：" + strdate8);
        Date date1 = new Date(0);
        LOG.info("new date:" + sdf.format(date1));
        long cur = System.currentTimeMillis();
        Date date2 = new Date(cur);
        LOG.info("当前时间是：" + sdf.format(date2));// 电脑中当前时间。
    }

}
