/**
 * Project Name:workspace
 * File Name:Person.java
 * Package Name:m01.d24.collection
 * Date:2018年1月24日下午7:42:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.dusen;
/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午7:42:41 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class Person {
    private String name;
    private int age;
    private int id;
    /**
     * 建立一个学生类 有Id 有name 有 age
     */
    public Person(int id,String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;
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

