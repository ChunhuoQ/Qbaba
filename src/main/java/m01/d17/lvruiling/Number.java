/**
 * Project Name:Qbaba
 * File Name:Number.java
 * Package Name:m01.d17.lvruiling
 * Date:2018年1月17日下午4:27:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.lvruiling;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月17日 下午4:27:40 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Number {
    private final static Logger LOG = Logger.getLogger(Number.class);

    private int n1;

    private int n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void addTion() {
        LOG.info("两数相加的结果为：n1 + n2=" + (n1 + n2));
    }

    public void subTration() {
        LOG.info("两数相减的结果为：n1 - n2=" + (n1 - n2));
    }

    public void mulTiplication() {
        LOG.info("两数相乘的结果为：n1 * n2=" + (n1 * n2));
    }

    public void division() {
        LOG.info("两数相除的结果为：n1 / n2=" + (n1 / n2));
    }
}
