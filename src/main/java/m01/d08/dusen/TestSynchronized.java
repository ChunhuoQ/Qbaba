/**
 * Project Name:dt59homework
 * File Name:TestSynchronized.java
 * Package Name:hw20180108
 * Date:2018年1月9日上午9:06:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.dusen;

/**
 * Description: <br/>
 * Date: 2018年1月9日 上午9:06:48 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class TestSynchronized {
    public static void main(String[] args) {
        SynchronizedDemo sd1 = new SynchronizedDemo("窗口1");
        SynchronizedDemo sd2 = new SynchronizedDemo("窗口2");
        SynchronizedDemo sd3 = new SynchronizedDemo("窗口3");
        sd1.start();
        sd2.start();
        sd3.start();
    }

}
