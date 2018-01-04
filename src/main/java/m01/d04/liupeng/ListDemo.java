/**
 * Project Name:dt59-liupeng
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:00:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.liupeng;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午4:00:43 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class ListDemo {

    private final static Logger LOG = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {

        List<Comparable> list = new ArrayList<Comparable>();

        /* 1.add(E e) 向列表的尾部添加指定的元素（可选操作）。 */
        list.add(1111);
        list.add('G');
        list.add("中国");
        list.add(3.14);

        /* 2. get(int index) 返回列表中指定位置的元素。 */
        /* 3. size() 返回列表中的元素数。 */
        LOG.info("给List集合添加元素并遍历");
        for (int i = 0; i < list.size(); i++) {
            LOG.info("这个集合的第" + (i + 1) + "个元素：" + list.get(i));
        }
        LOG.info("给List集合添加元素后的元素个数：" + list.size());
        LOG.info("**********************************");
        LOG.info("**********************************");

        /* 4. set(int index, E element) 用指定元素替换列表中指定位置的元素（可选操作）。 */
        LOG.info("给List集合替换元素并遍历");
        list.set(1, "GGG");
        for (int i = 0; i < list.size(); i++) {
            LOG.info("这个集合的第" + (i + 1) + "个元素：" + list.get(i));
        }
        LOG.info("给List集合替换元素后的元素个数：" + list.size());
        LOG.info("**********************************");
        LOG.info("**********************************");

        /* 5.add(int index, E element) 在列表的指定位置插入指定元素（可选操作）。 */
        LOG.info("给List集合增加元素并遍历");
        list.add(2, "新年快乐！");
        for (int i = 0; i < list.size(); i++) {
            LOG.info("这个集合的第" + (i + 1) + "个元素：" + list.get(i));
        }
        LOG.info("给List集合增加一个元素后的元素个数：" + list.size());
        LOG.info("**********************************");
        LOG.info("**********************************");

        /* 6. remove(int index) 移除列表中指定位置的元素（可选操作）。 */
        LOG.info("给List集合移除一个元素并遍历");
        list.remove(4);
        for (int i = 0; i < list.size(); i++) {
            LOG.info("这个集合的第" + (i + 1) + "个元素：" + list.get(i));
        }
        LOG.info("给List集合移除一个元素后的元素个数：" + list.size());
        LOG.info("**********************************");
        LOG.info("**********************************");

        /* contains(Object o) 如果列表包含指定的元素，则返回 true。 */
        LOG.info(list.contains(111));
        LOG.info(list.contains(1111));
    }

}

