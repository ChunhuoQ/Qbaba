/**
 * Project Name:Qbaba
 * File Name:PrimeRun.java
 * Package Name:m01.d08.lvruiling
 * Date:2018年1月8日下午3:46:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.lvruiling;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:46:20 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class PrimeRun implements Runnable {
    long minPrime;

    private final static Logger LOG = Logger.getLogger(PrimeRun.class);

    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        LOG.info(minPrime + "个无花果");

    }
}
