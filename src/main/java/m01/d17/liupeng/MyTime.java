/**
 * Project Name:Qbaba
 * File Name:MyTime.java
 * Package Name:m01.d17.liupeng
 * Date:2018年1月18日下午8:11:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月18日 下午8:11:34 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 03.类的成员变量与方法、构造方法 在程序中经常要对时间进行操作但是并没有时间类型的数据。<br/>
 * 那么我们可以自己实现一个时间类来满足程序中的需要。<br/>
 * <br/> 定义名为MyTime的类其中应有三个整型成员时hour分minute秒second<br/>
 * 为了保证数据的安全性这三个成员变量应声明为私有。<br/>
 * 为MyTime类定义构造方法以方便创建对象时初始化成员变量。 <br/> 再定义diaplay方法用于将时间信息打印出来。<br/>
 * 为MyTime类添加以下方法 <br/> addSecond(int sec)<br/>
 * addMinute(int min) addHour(int hou) <br/>
 * subSecond(int sec) subMinute(int min) subHour(int hou) <br/>
 * 分别对时、分、秒进行加减运算。
 */
public class MyTime {

    private final static Logger LOG = Logger.getLogger(MyTime.class);

    private int hour;

    private int minute;

    private int second;

    public int getHour() {
        return hour;
    }

    public int setHour(int hour) {
        return this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public int setMinute(int minute) {
        return this.minute = minute;
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

    public void addHour(int hour) {
        this.hour = getHour() + hour;
    }

    public void addMinute(int minute) {
        this.minute = getMinute() + minute;
    }

    public void addSecond(int second) {
        this.second = getSecond() + second;
    }

    public void subHour(int hour) {
        this.hour = getHour() - hour;
    }

    public void subMinute(int minute) {
        this.minute = getMinute() - minute;
    }

    public void subSecond(int second) {
        this.second = getSecond() - second;
    }

    public void dispaly() {
        LOG.info("现在是北京时间：" + this.getHour() + "时" + this.getMinute() + "分" + this.second + "秒");
    }

    public static void main(String[] args) {
        MyTime myTime = new MyTime(20, 34, 10);
        myTime.dispaly();
        LOG.info("一个半小时过去了......");
        myTime.addHour(2);
        myTime.subMinute(30);
        myTime.addSecond(10);
        myTime.dispaly();
        LOG.info("一个半小时过去了......");
        myTime.addHour(1);
        myTime.addMinute(30);
        myTime.addSecond(10);
        myTime.dispaly();
    }
}

