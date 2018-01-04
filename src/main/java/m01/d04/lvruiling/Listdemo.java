/**
 * Project Name:dt59homework
 * File Name:Listdemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:37:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.lvruiling;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:37:29 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Listdemo {
    private final static Logger LOG = Logger.getLogger(Listdemo.class);

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add('E');
        list.add(123);
        list.add("下雪了");
        list.add('像');
        list.add("冷");

        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }
        LOG.info("\t\n*****1.在末尾添加一个元素*****");
        list.add(543);
        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }

        LOG.info("\t\n*****2.替换指定脚标上的内容*****");
        list.set(1, 111);

        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }
        LOG.info("\t\n*****3.删除指定脚标上的内容*****");
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }
        LOG.info("\t\n*****4.查询指定的内容，如果找到了就返回true*****");

        LOG.info(list.contains(111));
        LOG.info("\t\n*****5.插入指定数值*****");
        list.add(0, 8769);
        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }
    }
}
