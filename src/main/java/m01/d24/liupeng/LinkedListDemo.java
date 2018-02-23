/**
 * Project Name:Qbaba
 * File Name:LinkedListDemo.java
 * Package Name:m01.d24.liupeng
 * Date:2018年1月24日下午8:13:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.liupeng;

import java.util.Iterator;
import java.util.LinkedList;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午8:13:45 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class LinkedListDemo {

    private final static Logger LOG = Logger.getLogger(LinkedListDemo.class);

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.addFirst("A");
        ll.addFirst("B");
        ll.addFirst("C");
        Iterator<String> iter = ll.iterator();
        LOG.info("在集合中的位置：");
        while (iter.hasNext()) {
            LOG.info(iter.next());
        }

        LOG.info("先进先出：");
        while (!ll.isEmpty()) {
            LOG.info(ll.removeLast());
        }
    }

}

