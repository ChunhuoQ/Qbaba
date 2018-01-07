/**
 * Project Name:Qbaba
 * File Name:DateDemo.java
 * Package Name:m01.d06.liupeng
 * Date:2018年1月7日上午8:22:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.liupeng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 上午8:22:58 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 字母 日期或时间元素 表示 示例<br/>
 * 
 * G Era 标志符 Text AD <br/>
 * 
 * y 年 Year 1996; 96 <br/>
 * 
 * M 年中的月份 Month July; Jul;07 <br/>
 * 
 * w 年中的周数 Number 27 <br/>
 * 
 * W 月份中的周数 Number 2 <br/>
 * 
 * D 年中的天数 Number 189 <br/>
 * 
 * d 月份中的天数 Number 10<br/>
 * 
 * F 月份中的星期 Number 2 <br/>
 * 
 * E 星期中的天数 Text Tuesday; Tue <br/>
 * 
 * a Am/pm 标记 Text PM <br/>
 * 
 * H一天中的小时数（0-23） Number 0 <br/>
 * 
 * k 一天中的小时数（1-24） Number 24 <br/>
 * 
 * K am/pm 中的小时数（0-11） Number 0<br/>
 * 
 * h am/pm 中的小时数（1-12） Number 12 <br/>
 * 
 * m 小时中的分钟数 Number 30 <br/>
 * 
 * s 分钟中的秒数 Number 55 <br/>
 * 
 * S 毫秒数 Number 978 <br/>
 * 
 * z 时区 General time zone Pacific Standard Time; PST; GMT-08:00 <br/>
 * 
 * Z 时区 RFC 822 time zone -0800
 */
public class DateDemo {

    private final static Logger LOG = Logger.getLogger(DateDemo.class);

    public static void main(String[] args) {

        // Date date = new Date(2018 - 1900, 1 - 1, 7);
        //
        // LOG.info(date);

        // Date date = new Date(0);
        // SimpleDateFormat sdf;
        // sdf = new SimpleDateFormat("yyyy年MM月dd日'T'HH:mm:ss.SSSZ");
        // String today = sdf.format(date);
        // LOG.info("今天是" + today);
        //
        // SimpleDateFormat sdf1;
        // sdf = new SimpleDateFormat("yyyy年MM月dd日'T'HH:mm:ss.SSSZ");
        // Date date1 = new Date(cur);
        // String curToday = sdf.format(date1);
        // LOG.info("今天是" + curToday);

        // 以2018年2月7日下午1点为例
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("yyyy-MM-dd G ' T 'HH:mm:ss.SSSZ");
        curToday(sdf);
        // 现在的时间是2018-02-07 公元 T 13:21:19.864+0800

        SimpleDateFormat sdf1;
        sdf1 = new SimpleDateFormat("G yyyy年MM月dd日w周E' T 'HH:mm:ss.SSSZ");
        curToday(sdf1);
        // 现在的时间是公元 2018年02月07日6周星期三 T 13:21:19.865+0800

        SimpleDateFormat sdf3;
        sdf3 = new SimpleDateFormat("G yyyy年MM月DD日W周E' T 'hh:mm:SS.SSSZ");
        curToday(sdf3);
        // 现在的时间是公元 2018年02月38日2周星期三 T 01:21:866.866+0800

        SimpleDateFormat sdf2;
        sdf2 = new SimpleDateFormat("G yyyy年MM月DD日W周F' T 'kk:mm:ss.SSSZ");
        curToday(sdf2);
        // 现在的时间是公元 2018年02月38日2周1 T 13:21:19.866+0800

        SimpleDateFormat sdf4;
        sdf4 = new SimpleDateFormat("G yyyy年MM月DD日W周a' T 'KK:mm:ss.SSSZ");
        curToday(sdf4);
        // 现在的时间是公元 2018年02月38日2周下午 T 01:21:19.866+0800

    }

    public static void curToday(SimpleDateFormat sdf) {
        long cur = System.currentTimeMillis();
        Date date = new Date(cur);
        String curtoday = sdf.format(date);
        LOG.info("现在的时间是" + curtoday);
    }

}

