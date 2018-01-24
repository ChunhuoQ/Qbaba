/**
 * Project Name:Qbaba
 * File Name:Queue2.java
 * Package Name:m01.d24.Qbaba
 * Date:2018年1月24日下午9:14:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.Qbaba; 
import java.util.LinkedList;
/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午9:14:04 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Queue2 {private LinkedList list = new LinkedList();

public void add(Object obj){
    list.addFirst(obj);
}

public Object get(){
    return list.removeLast();
}

public static void main(String[] args) {
    Queue2 q = new Queue2();
    q.add("A");
    q.add("B");
    q.add("C");
    
    System.out.println(q.get());
    System.out.println(q.get());
    System.out.println(q.get());
}}

