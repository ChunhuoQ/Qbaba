/**
 * Project Name:Qbaba

 * File Name:Test.java
 * Package Name:m01.d16.Qbaba
 * Date:2018年1月16日下午4:04:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.Qbaba;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月16日 下午4:04:12 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class GuessNumberTest {

    public static void main(String[] args) {

        System.out.println("幸运猜猜猜游戏，系统给一个0~100的数值，您可以输入任意数值，"+ "系统会跟据给出的数值来判断大小，如果相等则胜利！\n请输入您猜的数值：");
        new GuessNumberTest();

    }
    
    

    public GuessNumberTest() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        new GuessNumber(num);
        scanner.close();
    }

}
