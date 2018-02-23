/**
 * Project Name:Qbaba
 * File Name:Person.java
 * Package Name:m01.d24.liupeng
 * Date:2018年1月24日下午10:11:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.liupeng;
/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午10:11:01 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Person {
    private int id;

    private String name;

    private int salary;

    public Person() {
    }

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

