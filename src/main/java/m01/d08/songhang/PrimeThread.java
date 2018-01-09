/**
 * Project Name:Qbaba
 * File Name:primeThread.java
 * Package Name:m01.d08.songhang
 * Date:2018年1月8日下午8:17:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.songhang;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午8:17:25 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class PrimeThread extends Thread {
    private final static Logger LOG = Logger.getLogger(PrimeThread.class);

    private String vip;

    public void setVip(String vip) {
        this.vip = vip;
    }

    public void setMinPrime(long minPrime) {
        this.minPrime = minPrime;
    }

    long minPrime;

    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        LOG.info("num：" + minPrime);
    }
}
