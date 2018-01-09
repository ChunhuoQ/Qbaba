/**
 * Project Name:Qbaba
 * File Name:TestPrimeRun.java
 * Package Name:m01.d08.lvruiling
 * Date:2018年1月8日下午3:47:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.lvruiling;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:47:16 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestPrimeRun {

    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {

            PrimeRun p = new PrimeRun(i);
            new Thread(p).start();
            if (i > 20) {
                Thread t1 = new Thread();
                // t1.setName("v");
                t1.setPriority(Thread.MAX_PRIORITY);

            } else if (i < 5) {
                Thread t2 = new Thread();

                t2.setPriority(Thread.MIN_PRIORITY);
            }

        }
    }
}
