/**
 * Project Name:Qbaba
 * File Name:TestBox.java
 * Package Name:m01.d08.liupeng
 * Date:2018年1月9日上午11:57:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月9日 上午11:57:23 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class TestBox {

    private final static Logger LOG = Logger.getLogger(Box.class);

    public static void main(String[] args) {

        Box b = new Box(20);

        Buyer buyer1 = new Buyer("刘朋");
        Buyer buyer2 = new Buyer("高世庆");
        Buyer buyer3 = new Buyer("杜森");
        Buyer buyer4 = new Buyer("宋杭");
        Buyer buyer5 = new Buyer("吕瑞铃");
        for (int i = 0; i < 10; i++) {
            Seller seller1 = new Seller(buyer1, b);
            seller1.start();

            Seller seller2 = new Seller(buyer2, b);
            seller2.start();

            Seller seller3 = new Seller(buyer3, b);
            seller3.start();

            Seller seller4 = new Seller(buyer4, b);
            seller4.start();

            Seller seller5 = new Seller(buyer5, b);
            seller5.start();
        }

    }

}

