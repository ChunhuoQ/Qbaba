/**
 * Project Name:Qbaba
 * File Name:Queue1.java
 * Package Name:m01.d24.liupeng
 * Date:2018年1月25日上午9:25:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.liupeng;

import java.util.LinkedList;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月25日 上午9:25:47 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Queue1 {

    private final static Logger LOG = Logger.getLogger(Queue1.class);

    LinkedList<Object> ll = new LinkedList<Object>();

    public void add(Object obj) {
        ll.addFirst(obj);
    }

    public Object get() {
        return ll.removeLast();
    }
    public static void main(String[] args) {

        Queue1 queue1 = new Queue1();
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        try {
            for (int i = 0;; i++) {
                LOG.info(queue1.get());
            }
        } catch (Exception e) {
            LOG.info("结束！");
        }
    }

}

