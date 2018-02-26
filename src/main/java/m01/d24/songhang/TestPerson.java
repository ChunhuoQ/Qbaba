/**
 * Project Name:Qbaba
 * File Name:TestPerson.java
 * Package Name:m01.d24.songhang
 * Date:2018年1月24日下午10:11:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.songhang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description: <br/>
 * Date: 2018年1月24日 下午10:11:58 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestPerson {

    public static void main(String[] args) {

        Person a1 = new Person(110, "宋杭", 25);
        Person a2 = new Person(120, "杜森", 23);
        Person a3 = new Person(130, "高事情", 20);

        Map<Integer, Person> map = new HashMap<Integer, Person>();
        Person b = map.put(a1.getId(), a1);
        Person c = map.put(a2.getId(), a2);
        Person d = map.put(a3.getId(), a3);
        List<Map<Integer, Person>> list = new ArrayList<Map<Integer, Person>>();
        list.add(map);

        Set<Integer> keys = map.keySet();
        Iterator<Integer> ite = keys.iterator();
        for (int i = 0; i < list.size(); i++) {
            while (ite.hasNext()) {
                Integer key = ite.next();
                System.out.println(map.get(key).getId() + "\t" + map.get(key).getName() + "\t" + map.get(key).getAge());
            }
        }

    }

}
