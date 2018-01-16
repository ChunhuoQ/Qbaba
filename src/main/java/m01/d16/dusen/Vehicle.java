/**
 * Project Name:workspace
 * File Name:Vehicle.java
 * Package Name:exception
 * Date:2018年1月16日下午5:09:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.dusen;

/**
 * Description: <br/>
 * Date: 2018年1月16日 下午5:09:45 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Vehicle {
    /**
     * speed 速度
     */
    private int speed;

    /**
     * siza这是体积
     */
    private double siza;

    public void move() {
        System.out.println("这一辆可以动的车");
    }

    public void setSpeed(int speed) {
        this.speed=speed;
        System.out.println("这辆车的速度" +this.speed);
    }

    public void speedUp(int speed) {
        this.speed=this.speed+speed;
        System.out.println("这辆车加速" +this.speed);
    }

    public void speeDown(int speed) {
        if (speed < this.speed) {
           System.out.println("此时车数为"+(this.speed-speed));
        }else{
            System.out.println("车被撞停了");
        }
    }

}
