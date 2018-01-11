/**
 * Project Name:dt59homework
 * File Name:SynchronizedDemo.java
 * Package Name:hw20180108
 * Date:2018年1月9日上午8:58:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.dusen;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月9日 上午8:58:30 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
/**
 * 三个窗口售票
 */
public class SynchronizedDemo extends Thread {
    private final static Logger LOG = Logger.getLogger(SynchronizedDemo.class);

    private String name;

    static  int num=100;

    private int num1 = 0;

    public SynchronizedDemo(String  name) {
        this.name=name;
    }
    public void run() {
        while (num > 0) {
            synchronized (LOG) {

                if (num > 0) {
                    num1++;
                    num--;
                } else {
                    LOG.info("票卖完了");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                    
                }
                LOG.info(name+"卖了 "+num1+"票"+"  还剩"+num+"张");
            }
        }

    }
}
