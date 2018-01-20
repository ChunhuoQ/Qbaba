package m01.d17.songhang;

import org.apache.log4j.Logger;

/**
 * Project Name:Qbaba 

 * File Name:MyTime.java
 * Package Name:
 * Date:2018年1月17日下午6:59:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description:   <br/>
 * Date:     2018年1月17日 下午6:59:47 <br/>
 * @author   songhang
 * @version
 * @see
 */

/**
 * 03.类的成员变量与方法、构造方法 在程序中经常要对时间进行操作但是并没有时间类型的数据。 <br/>
 * 那么我们可以自己实现一个时间类来满足程序中的需要。 <br/>
 * 定义名为MyTime的类其中应有三个整型成员时hour分minute秒second为了保证数据的安全性这三个成员变量应声明为私有。 <br/>
 * 为MyTime类定义构造方法以方便创建对象时初始化成员变量。 <br/>
 * 再定义diaplay方法用于将时间信息打印出来。 <br/>
 * 为MyTime类添加以下方法 addSecond(int sec) addMinute(int min) addHour(int hou) <br/>
 * subSecond(int sec) subMinute(int min) subHour(int hou) 分别对时、分、秒进行加减运算。 <br/>
 */
public class MyTime {
    private final static Logger LOG = Logger.getLogger(TestMyTime.class);

    private int hour;

    private int minute;

    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

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

    public void display() {
        LOG.info("时间是：" + getHour() + "时" + getMinute() + "分" + getSecond() + "秒");
    }

    public void addHour(int hou) {
        this.hour = hour + hou;
        LOG.info(this.hour);
    }

    public void addSecond(int sec) {
        this.second = second + sec;
    }

    public void addMinute(int min) {
        this.minute = this.minute + min;

    }

    public void subSecond(int sec) {
        this.second = this.second - sec;
        LOG.info(this.second);
    }

    public void subMinute(int min) {
        this.minute = this.minute - min;
    }

    public void subHour(int hou) {
        this.hour = this.hour - hou;

    }
}
