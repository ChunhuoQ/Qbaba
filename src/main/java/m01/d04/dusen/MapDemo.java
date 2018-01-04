/**
 * Project Name:dt59homework
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:03:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.dusen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:03:46 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class MapDemo {
    private final static Logger LOG = Logger.getLogger(MapDemo.class);

    public static void main(String[] args) {
        Map map = new HashMap();
        LOG.info("长度为：" + map.size());// size（）集合长度
        /**
         * put（K key，V value）<br/>
         * 在此映射中关联指定值与指定键；
         */
        map.put("你多少岁", 12);
        map.put("你是谁", "张三");
        map.put("你现在在哪读书", "西红市");
        LOG.info("长度为：" + map.size());
        LOG.info("你是谁：对应的：" + map.get(0));
        LOG.info("你是谁：对应的：" + map.get("你是谁"));
        /**
         * renmove（key）<br/>
         * 从此集合中移除 key指定键value的关系
         */
        map.remove("你是谁");
        /**
         * .keySet()<br/>
         * 返回此映射中所包含的键的 Set 视图。
         */

        Iterator ite = map.keySet().iterator();// 再用set 调用迭代器（interator）
        while (ite.hasNext()) {
            LOG.info(ite.next());// 输出 key关键字
        }
        
        /**
         * 当用 clear（）。<br/>
         * 移除key 关键字和 value 的关系
         * 
         */
        map.clear();
        LOG.info("集合长度 ："+map.size());
    }

}
