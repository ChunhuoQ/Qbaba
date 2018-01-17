/**
 * Project Name:Qbaba
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午5:47:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.songhang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午5:47:59 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class HashMapDemo {
    private final static Logger LOG = Logger.getLogger(HashMapDemo.class);

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        // 添加
        map.put(1, "小张");
        map.put(2, "在青鸟学习java");
        map.put(3, "小王");
        map.put(4, "比小张学的要快");

        // 查询
        Object obje1 = map.get(1);
        Object obje2 = map.get(2);
        LOG.info(obje1);
        LOG.info(obje2);

        // 移除
        map.remove(3);
        map.remove(4);
        LOG.info(map.get(1) + " " + map.get(2));
        LOG.info(map.get(3) + " " + map.get(4));
        // 遍历（不是很懂）
        Iterator<Integer> ite = map.keySet().iterator();
        while (ite.hasNext()) {
            Object key = ite.next();
            LOG.info("new:" + key + "\t" + map.get(key));

        }

    }
}
