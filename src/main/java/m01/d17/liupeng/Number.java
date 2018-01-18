/**
 * Project Name:Qbaba
 * File Name:Number.java
 * Package Name:m01.d17.liupeng
 * Date:2018年1月18日下午8:57:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月18日 下午8:57:57 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 04.构造方法 编写Java程序模拟简单的计算器。 <br/>
 * 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。<br/>
 * 编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、<br/>
 * 乘multiplication、除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。<br/>
 * 在main方法中创建Number类的对象调用各个方法并显示计算结果。
 */
public class Number {

    private final static Logger LOG = Logger.getLogger(Number.class);

    private int n1;

    private int n2;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int addition() {
        return n1 + n2;
    }

    public int subtration() {
        return n1 - n2;
    }

    public int multiplication() {
        return n1 * n2;
    }

    public int division() {
        return n1 / n2;
    }
    public static void main(String[] args) {

        Number num = new Number(3, 8);
        LOG.info("3+8=" + num.addition());
        LOG.info("3-8=" + num.subtration());
        LOG.info("3*8=" + num.multiplication());
        LOG.info("3/8=" + num.division());
        
    }

}

