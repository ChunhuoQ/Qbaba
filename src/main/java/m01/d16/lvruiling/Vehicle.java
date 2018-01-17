/**
 * Project Name:Demo
 * File Name:Vehicle.java
 * Package Name:Demo20180116
 * Date:2018年1月16日下午5:04:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.lvruiling;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月16日 下午5:04:26 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Vehicle {
    private final static Logger LOG = Logger.getLogger(Vehicle.class);

    private int speed;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        LOG.info("这是一辆速度为：" + speed + "体积为：" + size + "的车");
    }

    public void speedUp(int a) {
        LOG.info("加速到了" + a);
    }

    public void speedDown(int a) {
        LOG.info("减速到了" + a);

    }
}
