/**
 * Project Name:workspace
 * File Name:A.java
 * Package Name:exception
 * Date:2018年1月16日下午4:18:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.dusen;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月16日 下午4:18:08 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class A {
    public void das(int b){
    int c=b;
    Scanner sca=new Scanner(System.in);
    System.out.println("请输入：");
    if(sca.hasNextInt()){
        int i=1;
        while(true){
            int a=sca.nextInt();
            if(a>c){
                System.out.println("大了");
            }if(a<c){
                System.out.println("小了");
            }if(a==c){
                System.out.println("猜对了"+"数字是"+b+"第"+i+"次");
                break;
            }
            i++;
        }
    }else{
        System.out.println("请输入0~100的数字");
    }        
}}
