/**
 * Project Name:Qbaba
 * File Name:ThreadDemo.java
 * Package Name:m01.d07.liupeng
 * Date:2018年1月8日下午4:16:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:16:45 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class ThreadDemo extends Thread {

    private final static Logger LOG = Logger.getLogger(ThreadDemo.class);

    private int num;

    private String VIP = "";

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String vIP) {
        VIP = vIP;
    }

    public ThreadDemo(int num) {

        this.num = num;
    }

    @Override
    public void run() {
        LOG.info(getVIP() + "我是第" + num + "名，我要拿奖励");
    }

}

