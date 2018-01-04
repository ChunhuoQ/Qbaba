/**
 * Project Name:dt59-liupeng
 * File Name:SetDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:48:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.liupeng;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午4:48:50 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class SetDemo {

    private final static Logger LOG = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {

        Set<Comparable> set = new HashSet<Comparable>();

        /* 1.add(E e) 如果 set 中尚未存在指定的元素，则添加此元素（可选操作）。 */
        /*
         * 2. iterator() 返回对此 set 中元素进行迭代的迭代器。<br/>
         * 可以对Set集合进行元素遍历。
         */

        set.add(666666);
        set.add("祝包老师新年快乐！");
        set.add(8888.8888);
        set.add("HHHHHHH");

        Iterator<Comparable> iter = set.iterator();
        while (iter.hasNext()) {
            LOG.info(iter.next());
        }

    }

}

