/**
 * Project Name:dt59homework
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午5:23:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.lvruiling;

import java.util.HashMap;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午5:23:01 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class MapDemo {
    private final static Logger LOG = Logger.getLogger(MapDemo.class);

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put('o', "橘子");
        map.put('a', "苹果");
        map.put('b', "香蕉");
        map.put('p', "无花果");
        // map.containsKey(map)
        LOG.info(map.get('p'));
        map.remove('a');
        for (int i = 0; i < 1; i++) {
            LOG.info(map.get(i));

        }
        LOG.info(map.hashCode());
        LOG.info(map.size());

        // LOG.info(map.clear());
        LOG.info(map.equals('p'));
        for (int i = 0; i < 1; i++) {
            LOG.info(map.get(i));

        }
    }
}
