/**
 * Project Name:dt59homework
 * File Name:RunnableDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:40:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.dusen;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:40:42 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class RunnableDemo implements Runnable{
    private final static Logger LOG = Logger.getLogger(RunnableDemo.class);
    private String name;

    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunnableDemo(String name ,int num){
        this.name=name;
        this.num=num;
    }

    public void run() {
       LOG.info(name+":"+num);
//        try {
//            Thread.sleep(500);
//            System.out.println(name+":"+num);
//        } catch (InterruptedException e) {
//            
//            //  Auto-generated catch block
//            e.printStackTrace();
//            
//        }
        
    }

}

