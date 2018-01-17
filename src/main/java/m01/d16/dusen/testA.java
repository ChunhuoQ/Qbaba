/**
 * Project Name:workspace
 * File Name:CaiCaiKan.java
 * Package Name:exception
 * Date:2018年1月16日下午4:15:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.dusen;

import java.util.Random;
import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2018年1月16日 下午4:15:01 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class testA {

    public static void main(String[] args) {
        Random ran=new Random();
        int b=ran.nextInt(100);
        A a1=new A();
        System.out.println("亲运行本程序 猜猜大小 看看运气 测测风水");
        a1.das(b);
    }

}

