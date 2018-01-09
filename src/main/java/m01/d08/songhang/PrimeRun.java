/**
 * Project Name:Qbaba
 * File Name:RrimeRun.java
 * Package Name:m01.d08.songhang
 * Date:2018年1月8日下午8:22:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.songhang;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午8:22:54 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class PrimeRun implements Runnable {
    private final static Logger LOG = Logger.getLogger(PrimeRun.class);

    private String name;

    long minPrime;

    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        LOG.info("no:" + minPrime);

    }

    public void setName(String name) {
        this.name = name;
    }
}
