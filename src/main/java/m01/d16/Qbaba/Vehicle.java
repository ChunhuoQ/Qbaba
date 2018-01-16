/**
 * Project Name:Qbaba
 * File Name:Vehicle.java
 * Package Name:m01.d16.Qbaba
 * Date:2018年1月16日下午4:33:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.Qbaba;

/**
 * Description: <br/>
 * Date: 2018年1月16日 下午4:33:49 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class Vehicle {
    private int speed;

    private int size;

    public void move() {

        System.out.println("大小：（" + size + "m x " + size + "m） 的公交车，正以" + speed + "码的速度在公路行驶中....");

    }

    /**
     * speed.
     *
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * speed
     * 
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * size
     *
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    public void speedUp() {

        this.speed = speed + 10;
        System.out.println("司机踩油门了...公交加速，现速：" + speed + "码。");
        for (int i = 0; i < 5; i++) {
            System.out.println("正常行驶中....");
        }
    }

    public void speedDown() {

        this.speed = speed - 20;
        System.out.println("轻踩刹车...公交减速，现速：" + speed + "码。");
        for (int i = 0; i < 5; i++) {
            System.out.println("正常行驶中....");
        }
    }

    public void speedStop() {

        this.speed = 0;
        System.out.println("紧急刹车...至公交停止，现速：" + speed + "码。" + "\n叮！珞喻路马家庄到了，下车请走好，请关门起步。");
    }

}
