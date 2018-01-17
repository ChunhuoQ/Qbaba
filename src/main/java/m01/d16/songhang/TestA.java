/**
 * Project Name:Qbaba
 * File Name:TestA.java
 * Package Name:m01.d16.songhang
 * Date:2018年1月17日下午2:02:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.songhang;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月17日 下午2:02:50 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestA {
    public static void main(String[] args) {

        A a = new A();
        a.setV(100);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入比较的数值：");
        int b = input.nextInt();
        if (b > a.v) {
            System.out.println("大了");
        } else if (b < a.v) {
            System.out.println("小了");
        } else {
            System.out.println("相等");
        }
        input.close();
    }

}
