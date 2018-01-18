/**
 * Project Name:Qbaba
 * File Name:MyTime.java
 * Package Name:m01.d17.lvruiling
 * Date:2018年1月17日下午3:39:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.lvruiling;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月17日 下午3:39:20 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class MyTime {
    private final static Logger LOG = Logger.getLogger(MyTime.class);

    private int hour;

    private int minute;

    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void second() {
        LOG.info("现在是:" + hour + "时" + minute + "分" + second + "秒");
    }

    public void addSecond(int sec) {
        LOG.info("秒数增加了" + sec + "秒,现在是：" + (second + sec) + "秒");
    }

    public void addMinute(int min) {
        LOG.info("分钟增加了" + min + "分钟,现在是：" + (minute + min) + "分");
    }

    public void addHour(int hou) {
        LOG.info("小时增加了" + hou + "小时,现在是：" + (hour + hou) + "时");
    }

    public void subSecond(int sec) {
        LOG.info("秒数减少了" + sec + "秒,现在是：" + (second + sec) + "秒");
    }

    public void subMinute(int min) {
        LOG.info("分钟减少了" + min + "分钟,现在是：" + (minute + min) + "分");
    }

    public void subHour(int hou) {
        LOG.info("小时减少了" + hou + "小时,现在是：" + (hour + hou) + "时");
    }
}
