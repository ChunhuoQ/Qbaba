/**
 * Project Name:Qbaba

 * File Name:DateDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午1:12:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.songhang;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午1:12:25 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
/**
 * y 年 Year 1996; 96 <br/>
 * M 年中的月份 Month July; Jul; 07 <br/>
 * w 年中的周数 Number 27 <br/>
 * W 月份中的周数 Number 2 <br/>
 * D 年中的天数 Number 189 <br/>
 * d 月份中的天数 Number 10 <br/>
 * F 月份中的星期 Number 2 <br/>
 * E 星期中的天数 Text Tuesday; Tue <br/>
 * a Am/pm 标记 Text PM <br/>
 * H 一天中的小时数（0-23） Number 0 <br/>
 * k 一天中的小时数（1-24） Number 24 <br/>
 * K am/pm 中的小时数（0-11） Number 0 <br/>
 * h am/pm 中的小时数（1-12） Number 12 <br/>
 * m 小时中的分钟数 Number 30 <br/>
 * s 分钟中的秒数 Number 55 <br/>
 * S 毫秒数 Number 978 <br/>
 * z 时区 General time zone Pacific Standard Time; PST; GMT-08:00 <br/>
 * Z 时区 RFC 822 time zone -0800 <br/>
 */
public class DateDemo {
    private final static Logger LOG = Logger.getLogger(DateDemo.class);

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date date = new Date(2018 - 1900, 1 - 1, 7);
        LOG.info("今天是：" + date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss:SSSZ");
        String strDate = sdf.format(date);
        LOG.info("今天是：" + strDate);

        Date date2 = new Date(0);
        LOG.info("new date：" + sdf.format(date2));
        @SuppressWarnings("deprecation")
        Date date4 = new Date(2018 - 1900, 1 - 1, 7);
        LOG.info("new date：" + sdf.format(date4));

        long cur = System.currentTimeMillis();// 当前时间的方法
        Date date3 = new Date(cur);
        LOG.info("当前的时间：" + sdf.format(date3));

    }

}
