/**
 * Project Name:Qbaba
 * File Name:TestPrimeThread.java
 * Package Name:m01.d08.songhang
 * Date:2018年1月8日下午8:21:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.songhang;


/**
 * Description: <br/>
 * Date: 2018年1月8日 下午8:21:27 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestPrimeThread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            PrimeThread p = new PrimeThread(i);
            p.start();
            if (i % 2 == 0) {
                p.setName("高");
                p.setPriority(Thread.MAX_PRIORITY);
            }
            if (i % 2 == 1) {
                p.setPriority(Thread.MIN_PRIORITY);
                p.setName("低");
            }
        }

    }

}
