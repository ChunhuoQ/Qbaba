/**
 * Project Name:Qbaba
 * File Name:TestThreadDemo.java
 * Package Name:m01.d07.liupeng
 * Date:2018年1月8日下午4:22:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:22:52 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 创建新执行线程有两种方法。一种方法是将类声明为 Thread 的子类。<br/>
 * 该子类应重写 Thread 类的 run 方法。接下来可以分配并启动该子类的实例。<br/>
 */

public class TestThreadDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadDemo thDe = new ThreadDemo(i + 1);
            if (i % 9 == 0) {
                thDe.setVIP("VIP");
                thDe.setPriority(Thread.MAX_PRIORITY);
            }
            thDe.start();
        }

    }

}

