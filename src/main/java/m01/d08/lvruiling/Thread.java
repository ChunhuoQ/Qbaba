/**
 * Project Name:Qbaba
 * File Name:Thread.java
 * Package Name:m01.d08.lvruiling
 * Date:2018年1月8日下午3:42:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.lvruiling;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:42:49 <br/>
 * 
 * @author l
 * @version
 * @see
 */
class PrimeThread extends Thread {
    long minPrime;

    private final static Logger LOG = Logger.getLogger(PrimeThread.class);

    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        LOG.info(minPrime + "个无花果");
    }
}
