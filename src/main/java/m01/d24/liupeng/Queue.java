/**
 * Project Name:Qbaba
 * File Name:Queue.java
 * Package Name:m01.d24.liupeng
 * Date:2018年1月24日下午6:27:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.liupeng;

import java.util.Iterator;
import java.util.LinkedList;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午6:27:25 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 创建一个类Queue，代表队列（特点：先进先出），添加add(Object obj)及get（）方法，<br/>
 * 并添加main（）方法进行效果验证。提示 : linkedlist addfirst
 */
public class Queue {

    private final static Logger LOG = Logger.getLogger(Queue.class);

    private static LinkedList<String> ll = new LinkedList<String>();

    public void add(LinkedList<String> ll) {
        ll.addFirst("A");
        ll.addFirst("B");
        ll.addFirst("C");
        Iterator<String> iter = ll.iterator();
        while (iter.hasNext()) {
            LOG.info(iter.next());
        }
    }

    public void get() {
        while (!ll.isEmpty()) {
            LOG.info(ll.removeLast());
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        LOG.info("在集合中的位置：");
        queue.add(ll);
        LOG.info("先进先出：");
        queue.get();
    }

}

