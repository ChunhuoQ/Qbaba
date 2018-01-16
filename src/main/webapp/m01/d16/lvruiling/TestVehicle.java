/**
 * Project Name:Demo
 * File Name:TestVehicle.java
 * Package Name:Demo20180116
 * Date:2018年1月16日下午5:21:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Demo20180116;

/**
 * Description: <br/>
 * Date: 2018年1月16日 下午5:21:49 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestVehicle {

    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
        ve.setSize(5);
        ve.setSpeed(60);
        ve.move();
        ve.speedDown(100);
        ve.speedUp(20);
    }

}
