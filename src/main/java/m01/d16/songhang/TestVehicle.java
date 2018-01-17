/**
 * Project Name:Qbaba
 * File Name:TestVehicle.java
 * Package Name:m01.d16.songhang
 * Date:2018年1月17日下午2:04:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.songhang;


/**
 * Description: <br/>
 * Date: 2018年1月17日 下午2:04:13 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestVehicle {

    public static void main(String[] args) {

        Vehicle str = new Vehicle(40, 100);
        System.out.println(str.getSpeed());
        System.out.println(str.getSize());
        str.speedup();
        str.speeddown();

    }

}
