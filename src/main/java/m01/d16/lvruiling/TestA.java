/**
 * Project Name:Demo
 * File Name:TestA.java
 * Package Name:Demo20180116
 * Date:2018年1月16日下午4:34:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.lvruiling;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月16日 下午4:34:53 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestA {
    private final static Logger LOG = Logger.getLogger(TestA.class);

    public static void main(String[] args) {
        LOG.info("请输入数字：");
        Scanner scanner = new Scanner(System.in);

        A a = new A();
        do {
            int c = scanner.nextInt();
            if (c == a.v) {
                LOG.info("恭喜你猜对了！");

            }
            if (c > a.v) {
                LOG.info("太大了！");

            }
            if (c < a.v) {
                LOG.info("太小了！");

            }
        } while (true);
    }
}
