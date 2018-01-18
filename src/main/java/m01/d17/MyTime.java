/**
 * Project Name:Qbaba
 * File Name:MyTime.java
 * Package Name:m01.d17
 * Date:2018年1月17日下午7:53:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月17日 下午7:53:30 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public final class MyTime {
     public static void main(String[] args) {
        
       MyTime time =new MyTime(20,02,44);
       time.diapaly();
       LOG.info("一个半小时过去了...");
       time.addHour(30);
       time.addMinute(30);
       time.addSecond(20);
       time.diapaly();
}

    private int hour;

    private int minute;

    private int second;

    private static final Logger LOG = Logger.getLogger(MyTime.class);

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void diapaly() {

        if(minute>10&&minute<60){
        LOG.info("北京时间：" + hour + ":" + minute + ":" + second);
        }
        else if(minute>60){
            LOG.info("北京时间：" +(hour +1)+ ":" +(minute-60)+ ":" + second);
        }
        else if(minute<10&&minute>0){
            LOG.info("北京时间：" +hour + ":" +"0"+minute+ ":" + second);
        }
    }

    public void addSecond(int sec) {
        this.second=this.second+sec;

    }

    public void addMinute(int min) {

        this.minute=this.minute+min;
    }

    /**
     * hour.
     *
     * @return  the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * hour
     *
     * @param   hour    the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * minute.
     *
     * @return  the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * minute
     *
     * @param   minute    the minute to set
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * second.
     *
     * @return  the second
     */
    public int getSecond() {
        return second;
    }

    /**
     * second
     *
     * @param   second    the second to set
     */
    public void setSecond(int second) {
        this.second = second;
    }

    public void addHour(int hou) {

        this.hour=this.hour+hou;
    }
    
   
}
