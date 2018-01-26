/**
 * Project Name:Qbaba
 * File Name:ListQianTao.java
 * Package Name:m01.d24.liupeng
 * Date:2018年1月24日下午11:20:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.liupeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午11:20:59 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class ListQianTao {

    private final static Logger LOG = Logger.getLogger(ListQianTao.class);

    public static void main(String[] args) {

        Person p1 = new Person(110, "宋江", 1000);
        Person p2 = new Person(120, "李葵", 2000);
        Person p3 = new Person(130, "鲁直伸", 2500);
        Map<Integer, Person> map1 = new HashMap<Integer, Person>();
        map1.put(p1.getId(), p1);
        map1.put(p2.getId(), p2);
        map1.put(p3.getId(), p3);


        Person p4 = new Person(140, "吴用", 3000);
        Person p5 = new Person(150, "关胜", 4000);
        Person p6 = new Person(160, "武松", 5500);
        Map<Integer, Person> map2 = new HashMap<Integer, Person>();
        map2.put(p4.getId(), p4);
        map2.put(p5.getId(), p5);
        map2.put(p6.getId(), p6);

        Person p7 = new Person(170, "林冲", 6000);
        Person p8 = new Person(180, "燕青", 7000);
        Person p9 = new Person(190, "柴进", 2500);
        Map<Integer, Person> map3 = new HashMap<Integer, Person>();
        map3.put(p7.getId(), p7);
        map3.put(p8.getId(), p8);
        map3.put(p9.getId(), p9);

        List<HashMap<Integer, Person>> list = new ArrayList<HashMap<Integer, Person>>();

        list.add((HashMap<Integer, Person>) map1);
        list.add((HashMap<Integer, Person>) map2);
        list.add((HashMap<Integer, Person>) map3);

        for (int i = 0; i < list.size(); i++) {
            // LOG.info(list.get(i));
            Set<Integer> allkey = list.get(i).keySet();
            Iterator<Integer> iter = allkey.iterator();
            LOG.info("List集合第" + (i + 1) + "组");
            while (iter.hasNext()) {
                Integer key = iter.next();
                LOG.info(list.get(i).get(key).getId() + "\t" + list.get(i).get(key).getName() + "\t"
                        + list.get(i).get(key).getSalary());
            }

        }

    }

}

