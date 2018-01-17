/**
 * Project Name:Qbaba
 * File Name:NumGame.java
 * Package Name:m01.d16.liupeng
 * Date:2018年1月16日下午3:54:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.liupeng;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月16日 下午3:54:28 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 01.类的成员变量 <br/>
 * 猜数字游戏一个类A有一个成员变量v有一个初值100。<br/>
 * 定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。<br/>
 */
public class NumGame {

    private final static Logger LOG = Logger.getLogger(NumGame.class);

    public static void main(String[] args) {

        A a = new A();
        Scanner scanner = new Scanner(System.in);
        LOG.info("游戏开始，请输入你猜的数字：");

        boolean flag = true;
        do{
            int i = scanner.nextInt();
            if (i > a.getNum()) {
                LOG.info("大了");
                LOG.info("请继续猜：");
            } else if (i < a.getNum()) {
                LOG.info("小了");
                LOG.info("请继续猜：");
            } else {
                LOG.info("猜测成功");
                LOG.info("游戏结束！");
                flag = false;
            }

        } while (flag);
        scanner.close();
    }

}

