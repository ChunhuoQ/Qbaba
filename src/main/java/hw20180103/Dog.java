/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:39:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:39:23 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
/**
 * 第二题 实现类<br/>
 */
public class Dog implements Pet {

    public String eat() {
        return "狗啃骨头";

    }

}

class Cat implements Pet {
    public String eat() {
        return "小猫吃鱼";
    }
}
