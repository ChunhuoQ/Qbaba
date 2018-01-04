/**
 * Project Name:dt59-liupeng
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午5:21:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.liupeng;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午5:21:08 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class MapDemo {

    private final static Logger LOG = Logger.getLogger(MapDemo.class);

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("刘朋","荆州");
        map.put("高世庆","咸宁");
        map.put("吕锐玲","荆门");
        map.put("杜森","宜昌");
        map.put("宋杭", "襄阳");
        LOG.info(map.entrySet());// 返回此映射所包含的映射关系的 Set 视图
        LOG.info(map.get("杜森"));// 返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。
        LOG.info(map.keySet());// 返回此映射中所包含的键的 Set 视图。
        LOG.info(map.values());// 返回此映射所包含的值的 Collection 视图。

    }

}

