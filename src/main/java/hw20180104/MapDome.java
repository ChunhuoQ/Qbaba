/**
 * Project Name:Qbaba
 * File Name:MapDome.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:56:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:56:57 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */

public class MapDome {
    private final static Logger LOG = Logger.getLogger(MapDome.class);

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        // 添加属性
        map.put(1, "Qbaba小组");
        map.put(2, "平均工资最高！");
        map.put(3, "Qbaba");
        map.put(4, "工资破青鸟最高记录！");

        // 查询属性
        
        LOG.info(map.get(1) + " " + map.get(2));
        
        LOG.info(map.get(3) + " " + map.get(4));
        
        
        // 删除属性
        map.remove(1);
        map.remove(2);
        
        LOG.info(map.get(1) + " " + map.get(2));
        
        LOG.info(map.get(3) + " " + map.get(4));

        map.put(1, "Qbaba小组");
        map.put(2, "平均工资最高！");

        // 遍历
        LOG.info("\n"+map.entrySet());
        System.out.println("["+map.values()+"]");
        Iterator<Integer> ite = map.keySet().iterator();
        int i = 1;
        while (i <= map.size()) {

            LOG.info(map.get(ite.next()));
            i++;
        }

//        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        
        
    }

}
