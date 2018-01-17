/**
 * Project Name:shoppingSystem
 * File Name:Safety.java
 * Package Name:shoppingSystem
 * Date:2018��1��5������12:01:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.QbabaShoppingSystem;

import java.awt.AWTException;

/**
 * Description: <br/>
 * Date: 2018��1��5�� ����12:01:21 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class Safety extends TwocePage {

    

    public void Administrator() {

        System.out.print("user��");
        String user = scanner.next();
        getSafetyUser(user);
        System.out.print("password��");
        String password = scanner.next();
        setSafetyPassword(password);

    }

    public void getSafetyUser(String user) {
        
            if (user.equals(getUSER())) {
                System.out.println("�û�����ȷ��");
                
            } else {
                System.out.println("�û�����������䡣");
                Administrator();
            
           
        }

    }

    public void setSafetyPassword(String password) {

        if (password.equals(getPASSWORD())) {
            System.out.print("������ȷ��");

            try {
                new Safety().cleanConsole();
            } catch (AWTException e) {

                e.printStackTrace();
            }

            functionOut();
            scanerTwocePage();
        } else {

            System.out.println("������������䡣");

            Administrator();

        }

    }
    
}
