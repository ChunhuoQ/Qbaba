/**
 * Project Name:Qbaba
 * File Name:TestPrimeRun.java
 * Package Name:m01.d08.songhang
 * Date:2018年1月8日下午8:26:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.songhang;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午8:26:12 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestPrimeRun {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            PrimeRun p = new PrimeRun(i);
            Thread rd = new Thread(p);
            rd.start();
            if (i % 2 == 0) {
                rd.setName("vip");
                rd.setPriority(Thread.MAX_PRIORITY);
            }

        }

    }
}
