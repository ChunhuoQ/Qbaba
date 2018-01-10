/**
 * Project Name:Qbaba
 * File Name:TestRunnableDemo.java
 * Package Name:m01.d08.liupeng
 * Date:2018年1月8日下午6:29:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午6:29:17 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

public class TestRunnableDemo {

    private final static Logger LOG = Logger.getLogger(TestThreadDemo.class);

    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {
            RunnableDemo RD = new RunnableDemo(i);
            Thread thread =new Thread(RD);
            if (i % 9 == 0) {
                RD.setVIP("非VIP");
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            thread.start();
            // 对象的统一性，匿名对象与new出来的对象不是同一个，所以要多注意
        }
    }

}

