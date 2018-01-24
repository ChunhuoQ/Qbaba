/**
 * Project Name:Qbaba
 * File Name:Queue.java
 * Package Name:m01.d24
 * Date:2018年1月24日下午6:04:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.Qbaba;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Description: <br/>
 * Date: 2018年1月24日 下午6:04:34 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class Queue {

    private String element;

    public Queue() {

    }

    public void add(String element) {
        this.element = element;
    }

    /**
     * element.
     *
     * @return the element
     */
    public String getElement() {
        return element;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");
        ListIterator str = list.listIterator(0);

        while (str.hasNext()) {
            String emp = (String) str.next();
            System.out.println(emp);
        }
    }

  

  

}
