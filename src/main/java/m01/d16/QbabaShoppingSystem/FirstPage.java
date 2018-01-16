/**
 * Project Name:shoppingSystem
 * File Name:Print.java
 * Package Name:shoppingSystem
 * Date:2018��1��2������9:23:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.QbabaShoppingSystem;

import java.awt.AWTException;
import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018��1��2�� ����9:23:38 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class FirstPage extends ManyPrint {
    Scanner scanner = new Scanner(System.in);

    private int verifly;

    /**
     * verifly.
     *
     * @return the verifly
     */
    public int getVerifly() {
        return verifly;
    }

    public void scannerdo() {

        for (; true;) {
            if (scanner.hasNextInt()) {
                int firstNum = scanner.nextInt();
                Verifly(firstNum);
                break;
            } else {
                System.out.print("��������ȷ��ֵ:");
            }
        }
        scanner.close();

    }

    public void Verifly(int verifly) {
        Safety safety = new Safety();
        this.verifly = verifly;
        switch (verifly) {
        case 1:

            try {
                new Safety().cleanConsole();
            } catch (AWTException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
            System.out.println("----------��ӭ����Qbabaϵ�y----------");
            System.out.println("Nav.:" + "\t��\t¼\tҳ\t��");
            System.out.println("�������û��������");
            safety.Administrator();

            break;
        case 0:
            System.out.println("----------��ӭ�´ι��RQbaba����---------");
            System.out.println("---------------�˳��ɹ���----------");
            System.out.println("----------��ӭ�´ι��RQbaba����---------");
            break;
        default:
            while (verifly != 0 || verifly != 1) {

                System.out.print("���������ֵ:");

                scannerdo();
            }
            break;
        }

    }
    public void retrunFirstPage(String twocePage){
        
        if(twocePage.equals("1")){
            Safety safety=new Safety();
            try {
                new Safety().cleanConsole();
            } catch (AWTException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
            System.out.println("----------��ӭ����Qbabaϵ�y----------");
            System.out.println("Nav.:" + "\t��\t¼\tҳ\t��");
            System.out.println("�������û��������");
            safety.Administrator();
            
        }
        else if(twocePage.equals("2")){
            try {
                new Safety().cleanConsole();
            } catch (AWTException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
            
            userInfoOut();
            
            new ThreePage().scannerUserInfo();
            
            
            
            
        }
        else if(twocePage.equals("3")){
            try {
                new Safety().cleanConsole();
            } catch (AWTException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
            print();
            System.out.println("Nav.:" +"\t��\t��\t��");
            System.out.println("---��������רӪ�꡵��");
            System.out.println("----------�Ǳ�����˫��15.6�ʴ������");
            System.out.println("----------˫����ʺ��������ƻ��˶");
            System.out.println("----------------�����(USB�ɳ��)");
            System.out.println("----------------��"+money+"(ԭ�ۡ�149)");
            System.out.println("---------------->>>>>>>����X1");
            new ThreePage().Pay();
            
        }
        else if(twocePage.equals("4")){
            try {
                new Safety().cleanConsole();
            } catch (AWTException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
            PayOut();
            new  ThreePage().scannerPay();
        }
        else if(twocePage.equals("5")){
            loginOut();
            scannerdo();
        }
        else if(twocePage.equals("0")){
            last();
        }
        else{
            System.out.print("��������ȷ���:");
            new TwocePage().scanerTwocePage();
        }
        
    }

}
