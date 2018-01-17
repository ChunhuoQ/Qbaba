/**
 * Project Name:Qbaba
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:13:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.songhang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:13:42 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class ListDemo {
    private final static Logger LOG = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {

        List<Comparable> list = new ArrayList<Comparable>();// 接口List 由它的实现类
                                                            // new一个
        // 添加
        list.add("老王 ");// 添加一个元素
        list.add(true);
        list.add(1);
        list.add('s');
        // 查询
        Object obj1 = list.get(1);// 不懂，为何要这么建立
        Object obj2 = list.get(2);//
        LOG.info(obj1);
        LOG.info(obj2);
        // 修改
        list.set(0, "小王");// 修改元素0的信息
        list.set(3, 'r');
        LOG.info(list.get(0));
        LOG.info(list.get(3));
        // 移除
        list.remove(3);

        // 元素的个数
        int size = list.size();
        LOG.info("元素的个数" + size);
        // 在索引为1的地方添加一个小高 插入
        list.add(1, "小高");
        LOG.info(list.get(1));
        // 遍历 迭代（不是很懂）
        Iterator<Comparable> ite = list.iterator();// 不懂
        while (ite.hasNext()) {
            LOG.info(ite.next());

            LOG.info("请输入新的元素的个数" + list.size());// while循环
        }
    }
}
