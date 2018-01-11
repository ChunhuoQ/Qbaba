/**
 * Project Name:dt59homework
 * File Name:TestRunnable.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:48:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.dusen;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:48:14 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class TestRunnable {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {

            RunnableDemo rd1 = new RunnableDemo("I:", i);
            Thread t1 = new Thread(rd1);
//            RunnableDemo rd2 = new RunnableDemo("J:", i);
//            Thread t2 = new Thread(rd2);
//            RunnableDemo rd3 = new RunnableDemo("K:", i);
//            Thread t3 = new Thread(rd3);
            if(i%5==0){
                rd1.setName("vip");
                t1.setPriority(Thread.MAX_PRIORITY);
            }
            if(i%4==0){
                rd1.setName("信用低");
                t1.setPriority(Thread.MIN_PRIORITY);
            }
            t1.start();
//            t2.start();
//            t3.start();
        }

    }

}
