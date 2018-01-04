/**
 * Project Name:dt59homework
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:44:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.dusen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:44:57 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class ListDemo {
    private final static Logger LOG = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {
        // 初始长度 为 10
        // 容量长度
        List list = new ArrayList();
        /*
         * 给容量 一些元素
         */
        list.add("早上好");
        list.add("中午好");
        list.add("你好！");
        list.add(23);
        list.add('男');
        list.add(true);

        /*
         * 元素的个数
         */
        int size = list.size();
        LOG.info("元素的个数：" + size);// 输出元素个数
        /**
         * add（int index，E element）<br/>
         * 在列表的指定位置插入指定元素
         */
        Object object1 = list.get(2);
        LOG.info("第三个元素是：" + object1);
        /**
         * add(int , index)<br/>
         * 指定元素插入此列表中的指定位置
         */
        list.add(2, "晚上好");
        Object object2 = list.get(2);
        Object object3 = list.get(3);
        LOG.info("第三个元素是：" + object2);
        LOG.info("-------------------");

        /**
         * get（int index） <br/>
         * 返回列表中的指定位置的元素
         */
        Object object4 = list.get(0);
        Object object5 = list.get(1);
        Object object6 = list.get(2);
        LOG.info("第一个元素是：" + object4);
        LOG.info("第三个元素是：" + object5);
        LOG.info("第四个元素是：" + object6);
        /**
         * remove（int index）<br/>
         * 删除列表中的指定位置元素
         */
        Object a = list.remove(0);
        Object a1 = list.get(0);
        LOG.info("删除第一个元素之后-------------------");
        LOG.info("第一个元素是：" + a1);
        /**
         * indexOF(Object o);<br/>
         * 返回集合中是否有这个值 <br/>
         * 没有就返回-1, 有这个元素 就返回这个 索引
         */
        int b = list.indexOf(true);
        LOG.info("元素索引是 ：" + b);
        int b1 = list.indexOf(123);
        LOG.info("元素索引是：" + b1);
        /**
         * iterator （）；<br/>
         * 查看列表中的元素信息 <br/>
         * iterator(int index )<br/>
         * 从指定位置查看
         */
        Iterator ite = list.iterator();
        int i = 1;
        while (ite.hasNext()) {
            LOG.info("第" + (i++) + "个元素：" + ite.next());
        }
        /**
         * clear();
         *移除此列表所有元素
         */
        list.clear();
        LOG.info("列表长度：" + list.size());

    }

}
