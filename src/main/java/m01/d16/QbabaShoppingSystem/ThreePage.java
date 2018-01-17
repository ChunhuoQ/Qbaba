/**
 * Project Name:shoppingSystem
 * File Name:ThreePage.java
 * Package Name:shoppingSystem
 * Date:2018��1��5������11:06:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.QbabaShoppingSystem;

import java.awt.AWTException;

/**
 * Description:   <br/>
 * Date:     2018��1��5�� ����11:06:14 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class ThreePage extends TwocePage{
    double lastMoney;
    public void Pay(){
        System.out.println("����  "+money+"Ԫ");
        System.out.print("������֧�����룺");
        String select1=scanner.next();
        if(select1.equals(getPASSWORD())){
            try {
                new Safety().cleanConsole();
            } catch (AWTException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
            print();

            System.out.println("֧���ɹ�!�������"+lastMoney+".RMB");
            System.out.println("��л���Qbaba�����֧�֣�����������");
            System.out.println("=====��ı���Ԥ����������յ���=====");
            System.out.println("------------˳����-----------");
         }
        else{
           System.out.println("����������������룡");
        }
    }
    public void scannerPay(){
        
        if(scanner.hasNextInt()){
            int select=scanner.nextInt();
            if(select==1){
                System.out.println("����  "+lastMoney+"Ԫ");
                
                
                for(;;){
                    System.out.print("������֧�����룺");
                String select1=scanner.next();
                if(select1.equals(getPASSWORD())){
                    try {
                        new Safety().cleanConsole();
                    } catch (AWTException e) {

                        // Auto-generated catch block
                        e.printStackTrace();

                    }
                    print();

                    System.out.println("֧���ɹ�!�������"+lastMoney+".RMB");
                    System.out.println("��л���Qbaba�����֧�֣�����������");
                    System.out.println("=====��ı���Ԥ����������յ���=====");
                    System.out.println("------------˳����-----------");break;
                 }
                else{
                   System.out.println("����������������룡");
                }}
                
                 
               
            }
            
            else if(select==2){
                try {
                    new Safety().cleanConsole();
                } catch (AWTException e) {

                    // Auto-generated catch block
                    e.printStackTrace();

                }
                shoppingList();
                for(;;){
                     System.out.println("ѡ����Ҫ���빺�ﳵ�ı�����");
                    System.out.println("1�����2����Ϸ��Y430p3�����(��0������һ��)");
                String select1=scanner.next();
                if(select1.equals("0")){
                    
                    try {
                        new Safety().cleanConsole();
                    } catch (AWTException e) {

                        // Auto-generated catch block
                        e.printStackTrace();

                    }
                    
                    
                    PayOut();
                    scannerPay();
                    }else{
                        try {
                            new Safety().cleanConsole();
                        } catch (AWTException e) {

                            // Auto-generated catch block
                            e.printStackTrace();

                        }if(select1.equals("1")){
                            PayOut1();lastMoney=this.money*2;
                        }
                        else if(select1.equals("2")){ PayOut2();lastMoney=money+money1;}
                        else if(select1.equals("3")){
                            PayOut3();
                            lastMoney=money+money2;}
                        System.out.println("��Ĺ��ﳵ���±��������~");
                        selectOut();
                        
                        scannerPay();
                    }
                
                  break;
                 }
                
            }
            else if(select==3){
                functionOut();
                String select1=scanner.next();
                retrunFirstPage(select1);
                
              }
            else if(select==4){
                loginOut();
                scannerdo();
                
            }
            else if(select==0){
                last();
            }
            }}
        
        
        
    
    
    
    
    
    
    public void scannerUserInfo(){
        
        
        if(scanner.hasNextInt()){
        int select=scanner.nextInt();
        if(select==2){
            functionOut();
            String select1=scanner.next();
            retrunFirstPage(select1);
             
           
        }
        else if(select ==1){
            System.out.print("�������µ��ǳƣ�");
            String User=scanner.next();
            setPET(User);
            System.out.println("�޸ĳɹ���");
            userInfoOut();
            scannerUserInfo();
            
        }
        else if(select ==3){
            System.out.print("�������µ����룺");
            String Password=scanner.next();
            setPASSWORD(Password);
            System.out.println("�޸ĳɹ������µ�¼��");
            System.out.println("----------��ӭ����Qbabaϵ�y----------");
            System.out.println("Nav.:" + "\t��\t¼\tҳ\t��");
            System.out.println("�������û��������");
            new Safety().Administrator();
            
        }
        else if(select ==4){
            
            loginOut() ;
            scannerdo();
            
        }
else if(select ==5){
            
    System.out.println("----------��ӭ�´ι��RQbaba����---------");
    System.out.println("---------------�˳��ɹ���----------");
    System.out.println("----------��ӭ�´ι��RQbaba����---------");
        }
        }
        
        
        
    }
    
    
    
}

