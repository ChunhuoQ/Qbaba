/**
 * Project Name:shoppingSystem
 * File Name:TwocePage.java
 * Package Name:shoppingSystem
 * Date:2018��1��4������11:26:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.QbabaShoppingSystem;

/**
 * Description: <br/>
 * Date: 2018��1��4�� ����11:26:52 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class TwocePage extends FirstPage {
    
    
    

    public void scanerTwocePage() {
String twoceSelect = scanner.next();
       
            
            retrunFirstPage(twoceSelect);
         

            scanerTwocePage();
            
        }
    }


