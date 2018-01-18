/**
 * Project Name:Qbaba
 * File Name:Number.java
 * Package Name:m01.d18.songhang
 * Date:2018年1月17日下午7:45:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d18.songhang;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月17日 下午7:45:58 <br/>
 * @author   songhang
 * @version
 * @see
 */
/**
 * 04.构造方法 编写Java程序模拟简单的计算器。<br/>
 * 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。<br/>
 * 编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、<br/>
 * 乘multiplication、除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。 <br/>
 * 在main方法中创建Number类的对象调用各个方法并显示计算结果。<br/>
 */

public class Number {
    private final static Logger LOG = Logger.getLogger(Number.class);

    private int n1;

    private int n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void addition() {
        LOG.info("加法：" + (this.n1 + this.n2));
    }

    public void subtration() {
        LOG.info("减法：" + (this.n1 - this.n2));
    }

    public void multiplication() {
        LOG.info("乘法：" + (this.n1 * this.n2));
    }

    public void division() {
        LOG.info("除法：" + (this.n1 / this.n2));
    }

    public static void main(String[] args) {
        Number number = new Number(265, 29);
        number.addition();
        number.division();
        number.multiplication();
        number.subtration();
    }

}
