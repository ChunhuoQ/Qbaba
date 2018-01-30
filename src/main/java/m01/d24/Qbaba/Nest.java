/**
 * Project Name:Qbaba
 * File Name:Nest.java
 * Package Name:m01.d24
 * Date:2018年1月24日下午6:41:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.Qbaba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月24日 下午6:41:06 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class Nest {
    private String name;

    private int age;

    public Nest() {
    }

    public Nest(int age, String name) {
        this.name = name;
        this.age = age;
    }

    /**
     * name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    private final static Logger LOG = Logger.getLogger(Nest.class);

    public static void main(String[] args) {

        HashMap<Integer, Nest> hm = new HashMap<Integer, Nest>();
        List<HashMap<Integer, Nest>> list = new ArrayList<HashMap<Integer, Nest>>();

        Nest n1 = new Nest(180, "Qbaba");
        Nest n2 = new Nest(178, "宋杭");
        Nest n3 = new Nest(179, "杜森");

        hm.put(n1.getAge(), n1);
        hm.put(n2.getAge(), n1);
        hm.put(n3.getAge(), n1);
        list.add(hm);
  
        for (HashMap<Integer, Nest> hashmap : list) {
            
            LOG.info("好吧我承认这不是遍历。。卡到了");
            LOG.info(hashmap);
        }

    }
}
