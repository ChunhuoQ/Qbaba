/**
 * Project Name:Qbaba
 * File Name:ListDome.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:33:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.Qbaba;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:33:58 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class ListDome {

    private final static Logger LOG = Logger.getLogger(ListDome.class);

    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
        List<Comparable> list = new ArrayList<Comparable>();

        // 添加四个数据;
        list.add(20);
        list.add(22);
        list.add("小王头");
        list.add("Qbaba");
        // 查询 get(index);
        LOG.info(list.get(3) + " " + list.get(0) + "岁");

        LOG.info(list.get(2) + " " + list.get(1) + "岁");

        LOG.info("返回列表长度：" + list.size());
        // 修改小王头的年龄,修改Qbaba的名字；
        list.set(1, 23);
        list.set(3, "高世庆");

        LOG.info(list.get(3) + " " + list.get(0) + "岁");

        LOG.info(list.get(2) + " " + list.get(1) + "岁");

        LOG.info("返回列表长度：" + list.size());

        // 删除小王头的岁数，移除高世庆；关键字remove(index);
        list.remove(1);
        list.remove(2);

        LOG.info(list.get(0) + " " + list.get(1));// 列表只剩两个数据，脚标为0和1；填2，3报错，超出size范围；
        LOG.info("返回列表长度：" + list.size());

        // 插入Qbaba和小王头的年纪;add(index,E element)
        list.add(0, "Qbaba");
        list.add(3, 23);

        LOG.info(list.get(2) + " " + list.get(3) + "岁");

        LOG.info(list.get(0) + " " + list.get(1) + "岁");

        LOG.info("返回列表长度：" + list.size());

        // 遍历 迭代器。
        @SuppressWarnings("rawtypes")
        Iterator<Comparable> ite = list.iterator();
        int i = 1;
        while (ite.hasNext()) {
            LOG.info("小屋住户信息：第" + (i++) + "条信息：" + ite.next());

            LOG.info("返回列表长度：" + list.size());
        }
    }

}
