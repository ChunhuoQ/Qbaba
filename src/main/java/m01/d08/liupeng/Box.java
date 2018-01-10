/**
 * Project Name:Qbaba
 * File Name:Box.java
 * Package Name:m01.d08.liupeng
 * Date:2018年1月9日上午11:29:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月9日 上午11:29:11 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Box {
    private final static Logger LOG = Logger.getLogger(Box.class);
    private int num;

    /**
     * Creates a new instance of Box. <br/>
     * 定义票的数量
     * 
     * @param num
     */
    public Box(int num) {
        this.num = num;
    }

    /**
     * Creates a new instance of Box. <br/>
     * 可以查询票的数量
     * 
     * @param num
     */
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



}

