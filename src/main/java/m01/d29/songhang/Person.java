/**
 * Project Name:Qbaba
 * File Name:Person.java
 * Package Name:m01.d29.songhang
 * Date:2018年1月29日下午4:01:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d29.songhang;

/**
 * Description: <br/>
 * Date: 2018年1月29日 下午4:01:06 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Person {
    private int id;

    private String name = "小明";

    public int age = 10;

    public String address = "东湖";

    public Person() {// 无参的构造方法
        System.out.println("无参的构造方法");
    }

    public Person(int a, int b) {// 无参的构造方法
        System.out.println("有参的构造方法:" + (a + b));
    }

    private Person(String name) {
        System.out.println("姓名：" + name);
    }

}
