/**
 * Project Name:Qbaba
 * File Name:MobiDaoImpl.java
 * Package Name:m05.d23.Qbaba.aop
 * Date:2018年5月23日下午11:04:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d23.Qbaba.aop;
/**
 * Description:   <br/>
 * Date:     2018年5月23日 下午11:04:21 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class MobiDaoImpl {

    public void select(){
        System.out.println("查询余额！");

    }
    public void zhuanZhang(){
        System.out.println("转账！");
    }
    public String inset(){
        System.out.println("存钱失败！");
        return "存钱失败，您存放的是假钞！";
    }
}

