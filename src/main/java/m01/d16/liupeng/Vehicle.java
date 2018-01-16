/**
 * Project Name:Qbaba
 * File Name:Vehicle.java
 * Package Name:m01.d16.liupeng
 * Date:2018年1月16日下午4:22:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月16日 下午4:22:35 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 02.类的成员变量 <br/>
 * 请定义一个交通工具(Vehicle)的类其中有: <br/>
 * 属性速度(speed)体积(size)等等 <br/>
 * 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等. <br/>
 * 最后在测试类Vehicle中的main()中实例化一个交通工具对象<br/>
 * 并通过方法给它初始化speed,size的值并且通过打印出来。另外调用加速减速的方法对速度进行改变。
 */
public class Vehicle {

    private final static Logger LOG = Logger.getLogger(Vehicle.class);

    private int speed;

    private int size;

    {
        LOG.info("I'm running!");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        LOG.info("run");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        LOG.info("speedUp");
    }

    public void speedDown() {
        LOG.info("speedDown");
    }

}

