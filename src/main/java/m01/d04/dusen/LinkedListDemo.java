/**
 * Project Name:dt59homework
 * File Name:LinkedListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:44:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d04.dusen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午4:44:01 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class LinkedListDemo {
    private final static Logger LOG = Logger.getLogger(LinkedListDemo.class);
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add("你好");
        list.add("想啥呢");
        list.add(123);
        list.add("无聊");
        list.add("0-0");
        list.add("剑");
        int a=list.size();
        LOG.info("此集合长度："+a);
        LOG.info("第5个元素："+list.get(4));
        /**
         * set（）<br/>
         * 用指定的元素替代此列表中指定位置上的元素。
         */
        Object object=list.set(4, "-0-");
        LOG.info("第五个元素："+list.get(4));
        int b=list.size();
        LOG.info("此集合长度："+b);
        LOG.info("```````````````````````````````````");
        /**
         * add()<br/>
         * 在此列表中指定的位置插入指定的元素。
         */
        list.add(1,"0.0");
        LOG.info("第二个元素是："+list.get(1));
        /**
         * remove(int index)<>
         * 删除指定位置的元素
         */
        list.remove(1);
        LOG.info("第二个元素是："+list.get(1));
        LOG.info("`````````````````````````````````");
        /**
         * 使用迭代器  把 所有元素输出一遍
         */
        Iterator ite=list.iterator();
        int i=1;
        while(ite.hasNext()){
            LOG.info("第"+(i++)+"个元素:"+ite.next());
        }
        /**
         * indexOf（元素）；<br/>
         * 是否有此元素，有就返回索引  没有 返回  -1；<br/>
         */
        int c=list.indexOf("0.0");
        LOG.info("是否有这个元素："+c);
        /**.
         * clear()
         * 清空元素
         */
        list.clear();
        LOG.info("此列表长度："+list.size());
    }

}

