/**
 * Project Name:dt59homework
 * File Name:TestThread.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:33:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.dusen;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:33:17 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class TestThread {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            ThreadDemo tb1 = new ThreadDemo("A:", i);
            ThreadDemo tb2 = new ThreadDemo("B:", i);
            if(i%5==0){
                tb1.setNamed("一流高手");
                tb1.setPriority(Thread.MAX_PRIORITY);
            }
            tb1.start();
            if(i%4==0){
                tb2.setNamed("三流高手");
                tb2.setPriority(Thread.MIN_PRIORITY);
            }
            tb2.start();
        }

    }
}
