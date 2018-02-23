/**
 * Project Name:Qbaba
 * File Name:Person.java
 * Package Name:m01.d24.songhang
 * Date:2018年1月24日下午10:08:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.songhang;

/**
 * Description: <br/>
 * Date: 2018年1月24日 下午10:08:19 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Person {
    private String name;

    private int age;

    private int id;

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
