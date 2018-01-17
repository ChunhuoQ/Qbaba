/**
 * Project Name:Qbaba
 * File Name:TestVehicle.java
 * Package Name:m01.d16.liupeng
 * Date:2018年1月16日下午4:34:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月16日 下午4:34:56 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class TestVehicle {

    private final static Logger LOG = Logger.getLogger(TestVehicle.class);

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.setSpeed(100);

        vehicle.setSize(5);

        LOG.info("校车的速度是" + vehicle.getSpeed());

        LOG.info("校车的体积是" + vehicle.getSize());

        vehicle.speedDown();

        vehicle.speedUp();

    }

}

