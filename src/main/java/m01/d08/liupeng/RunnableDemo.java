/**
 * Project Name:Qbaba
 * File Name:RunnableDemo.java
 * Package Name:m01.d08.liupeng
 * Date:2018年1月8日下午6:28:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午6:28:04 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 创建线程的另一种方法是声明实现 Runnable 接口的类。<br/>
 * 该类然后实现 run 方法。然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动。<br/>
 */
public class RunnableDemo implements Runnable {

    private final static Logger LOG = Logger.getLogger(TestThreadDemo.class);

    private int num;

    private String VIP = "";

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String vIP) {
        VIP = vIP;
    }

    public RunnableDemo(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        LOG.info(getVIP() + "我是第" + num + "名，我要拿奖励");

    }

}

