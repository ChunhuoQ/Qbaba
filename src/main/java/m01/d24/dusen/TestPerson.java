/**
 * Project Name:workspace
 * File Name:TestPerson.java
 * Package Name:m01.d24.collection
 * Date:2018年1月24日下午7:45:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.dusen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午7:45:42 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class TestPerson {

    public static void main(String[] args) {
        Person p1=new Person(110, "张三",23);
        Person p2=new Person(120, "李四",22);
        Person p3=new Person(130, "宋江",21);
        Person p4=new Person(140, "吴用",20);
        Person p5=new Person(150, "王五",26);
        List<Person> list = new ArrayList<Person>();
        Map<Integer,Person> map = new HashMap<Integer,Person>();
        Person a=map.put(p1.getId(),p1);
        Person b=map.put(p2.getId(),p2);
        Person c=map.put(p3.getId(),p3);
        Person d=map.put(p4.getId(),p4);
        Person e=map.put(p5.getId(),p5);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        Set<Integer> keys = map.keySet();
         Iterator<Integer> it = keys.iterator();
        for(int i=0;i<list.size();i++){
            while(it.hasNext()){
               Integer key = it.next();
               System.out.println(map.get(key).getId()+"\t"+map.get(key).getName()+"\t"+map.get(key).getAge());
            }
        }
    }

}

