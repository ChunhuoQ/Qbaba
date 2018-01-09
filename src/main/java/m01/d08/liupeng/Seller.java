/**
 * Project Name:Qbaba
 * File Name:Seller.java
 * Package Name:m01.d08.liupeng
 * Date:2018年1月9日上午11:26:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月9日 上午11:26:47 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Seller extends Thread {
    private final static Logger LOG = Logger.getLogger(Box.class);

    private Buyer buyer;

    private Box box;

    public Seller(Buyer buyer, Box box) {
        this.buyer = buyer;
        this.box = box;
    }

    public void sell() {
        // Object object = new Object();
        int num = box.getNum();
        do {
            synchronized (this) {
                if (num != 0) {
                    box.setNum(num - 1);
                    buyer.setNum(buyer.getNum() + 1);
                    LOG.info(buyer.getName() + "买了" + buyer.getNum() + "张票");
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } while (box.getNum() > 0);

    }

    @Override
    public void run() {
        sell();
    }

}

