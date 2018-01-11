/**
 * Project Name:dt59homework
 * File Name:ThreadDmeo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:28:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.dusen;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:28:04 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class ThreadDemo extends Thread {
    private final static Logger LOG = Logger.getLogger(ThreadDemo.class);

    private String named;

    private int num;

    public ThreadDemo(String named, int num) {
        this.named = named;
        this.num = num;
    }

 

    public void setNamed(String named) {
        this.named = named;
    }

    public void run() {

        LOG.info(named + ":" + num);
        // try {
        // Thread.sleep(500);
        // System.out.println(name + ":" + i);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        //
        // }
    }

   

}
