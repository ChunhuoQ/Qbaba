/**
 * Project Name:workspace
 * File Name:Number.java
 * Package Name:extends2
 * Date:2018年1月17日下午8:48:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.dusen;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月17日 下午8:48:55 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Number {
    private final static Logger LOG = Logger.getLogger(Number.class);

    private double n1;

    private double n2;

    public Number(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /**
     * addition 相加
     */
    public void addition() {
        LOG.info("相加得到：" +(n1+n2));
    }
    /**
     * subtration 相减
     */
    public void subtration(){
        LOG.info("相减得到："+(n1-n2));
    }
    /**
     * multiplication 相乘
     */
    public void multiplication(){
        LOG.info("相乘得到："+(n1*n2));
    }
    /**
     * division 除
     */
    public void division(){
        LOG.info("相除得到："+(n1/n2));
    }
    

}
