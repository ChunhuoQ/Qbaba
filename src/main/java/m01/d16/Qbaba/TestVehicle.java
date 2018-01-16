/**
 * Project Name:Qbaba
 * File Name:TestVehicle.java
 * Package Name:m01.d16.Qbaba
 * Date:2018年1月16日下午4:41:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.Qbaba;
/**
 * Description:   <br/>
 * Date:     2018年1月16日 下午4:41:01 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class TestVehicle {

    public static void main(String[] args) {
        Vehicle publicCar= new Vehicle();
        publicCar.setSpeed(20);
        publicCar.setSize(6);
        publicCar.move();
        publicCar.speedUp();
        publicCar.speedDown();
        publicCar.speedStop();
    }

}

