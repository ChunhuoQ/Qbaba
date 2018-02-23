/**
 * Project Name:Qbaba
 * File Name:Queue.java
 * Package Name:m01.d24.songhang
 * Date:2018年1月24日下午7:31:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.songhang;

import java.util.LinkedList;

/**
 * Description: <br/>
 * Date: 2018年1月24日 下午7:31:58 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Queue {

    LinkedList<Object> list = new LinkedList<Object>();// 添加的方法

    public void add(Object obj) {
        list.addFirst(obj);// 保证每个都是第一个，先进
    }

    public Object get() {
        return list.removeLast();// 先出

    }

    public static void main(String[] args) {

        Queue qq = new Queue();
        qq.add("a");
        qq.add("b");
        qq.add("c");

        try {
            for (int i = 0;; i++) {
                System.out.println(qq.get());
            }
        } catch (Exception e) {

            // Auto-generated catch block
            System.out.println("结束!");

        }

    }

}
