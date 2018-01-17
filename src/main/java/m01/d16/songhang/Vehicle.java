/**
 * Project Name:Qbaba
 * File Name:Vehicle.java
 * Package Name:m01.d16.songhang
 * Date:2018年1月17日下午2:03:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.songhang;


/**
 * Description: <br/>
 * Date: 2018年1月17日 下午2:03:40 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Vehicle {
    private int speed;

    private int size;

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move() {
    }

    public void speedup() {
        Vehicle str = new Vehicle(40, 100);
        str.setSpeed(60);
        System.out.println("这俩车加速了20：" + "变为" + str.getSpeed());
    }

    public void speeddown() {
        Vehicle str = new Vehicle(40, 100);
        str.setSpeed(30);
        System.out.println("这俩车减速了10：" + "变为" + str.getSpeed());
    }

}
