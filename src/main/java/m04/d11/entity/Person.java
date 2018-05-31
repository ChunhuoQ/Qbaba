/**
 * Project Name:Qbaba
 * File Name:Person.java
 * Package Name:m04.d11.entity
 * Date:2018年5月22日下午5:12:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d11.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Description:   <br/>
 * Date:     2018年5月22日 下午5:12:41 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Person {

   private String name;
    
   private String love;
   
   private int age;
   
   private char sex;
   
  

public Person() {
    
    super();
    //  Auto-generated constructor stub
    
}



/**
 *
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
    return "Person [name=" + name + ", love=" + love + ", age=" + age + ", sex=" + sex + "]";
}



public Person(String name, String love, int age, char sex) {
    super();
    this.name = name;
    this.love = love;
    this.age = age;
    this.sex = sex;
}



/**
 * name.
 *
 * @return  the name
 */
public String getName() {
    return name;
}



/**
 * name
 *
 * @param   name    the name to set
 */
public void setName(String name) {
    this.name = name;
}



/**
 * love.
 *
 * @return  the love
 */
public String getLove() {
    return love;
}



/**
 * love
 *
 * @param   love    the love to set
 */
public void setLove(String love) {
    this.love = love;
}



/**
 * age.
 *
 * @return  the age
 */
public int getAge() {
    return age;
}



/**
 * age
 *
 * @param   age    the age to set
 */
public void setAge(int age) {
    this.age = age;
}



/**
 * sex.
 *
 * @return  the sex
 */
public char getSex() {
    return sex;
}



/**
 * sex
 *
 * @param   sex    the sex to set
 */
public void setSex(char sex) {
    this.sex = sex;
}


   
}

