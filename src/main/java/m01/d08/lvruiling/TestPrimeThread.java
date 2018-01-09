/**
 * Project Name:Qbaba
 * File Name:TestPrimeThread.java
 * Package Name:m01.d08.lvruiling
 * Date:2018年1月8日下午3:44:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.lvruiling;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:44:32 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestPrimeThread {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            PrimeThread p = new PrimeThread(i);
            p.start();

            if (i > 20) {
                p.setName("高");// 高优先级
                p.setPriority(Thread.MAX_PRIORITY);
            }
            if (i < 10) {
                p.setName("低");// 低优先级
                p.setPriority(Thread.MIN_PRIORITY);
            }
        }

    }
}
