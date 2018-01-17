/**
 * Project Name:workspace
 * File Name:MyTime.java
 * Package Name:extends2
 * Date:2018年1月17日下午7:46:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.dusen;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 * Description: <br/>
 * Date: 2018年1月17日 下午7:46:27 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class MyTime {
    private final static Logger LOG = Logger.getLogger(MyTime.class);

    private int hour;

    private int minute;

    private int second;

    /**
     * h 小时 m分钟 S秒
     */
    MyTime(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public void addSecond(int sec) {
        this.second = this.second + sec;
    }

    public void addMinute(int min) {
        this.minute = this.minute + min;
    }

    public void addHour(int huo) {
        this.hour = this.hour + huo;
    }

    public void subHour(int huo) {
        this.hour = this.hour - huo;
    }

    public void subMinute(int min) {
        this.minute = this.minute - min;
    }

    public void subSecond(int sec) {
        this.second = this.second - sec;
    }

    public void diaplay() {
        if (hour >= 0 && minute >= 0 && second >= 0) {
            LOG.info("计时器时间是：" + this.hour + ":" + this.minute + ":" + this.second);
        } else if (hour < 0 && minute >= 0 && second >= 0) {
            LOG.info("计时器时间是：" + "0" + ":" + this.minute + ":" + this.second);
        } else if (hour < 0 && minute < 0 && second >= 0) {
            LOG.info("计时器时间是：" + "0" + ":" + "0" + ":" + this.second);
        } else if (hour >= 0 && minute < 0 && second >= 0) {
            LOG.info("计时器时间是：" + this.hour + ":" + "0" + ":" + this.second);
        } else {
            LOG.info("计时器时间是：" + "0" + ":" + "0" + ":" + 0);
        }
    }

    public static void main(String[] args) {
        LOG.info("本产品是个计时器 当为负数是为0");
        MyTime t = new MyTime(10, 0, 0);
        t.addHour(10);
        t.addMinute(20);
        t.addSecond(10);
        t.subHour(20);
        t.subMinute(30);
        t.subSecond(30);
        t.diaplay();
    }

}
