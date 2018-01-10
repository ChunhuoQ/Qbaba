/**
 * Project Name:Qbaba
 * File Name:Buyer.java
 * Package Name:m01.d08.liupeng
 * Date:2018年1月9日上午11:22:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;
/**
 * Description:   <br/>
 * Date:     2018年1月9日 上午11:22:41 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Buyer {
    /**
     * 购买者姓名
     */
    private String name;

    /**
     * 购买者买票数量
     */
    private int num;

    public Buyer(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

