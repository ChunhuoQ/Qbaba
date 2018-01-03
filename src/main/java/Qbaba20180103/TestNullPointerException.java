/**
 * Project Name:Shiqing-Gao
 * File Name:NullPointerException.java
 * Package Name:Qbaba20180103
 * Date:2018年1月3日下午4:46:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Qbaba20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午4:46:43 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class TestNullPointerException {

    public static void main(String[] args) throws NullPointerException{

        try{
            String  name=null;
            String x="小王头";
            name.equals(x);
         }
         catch(NullPointerException ee)
         {  
            throw new NullPointerException("这串代码空指针异常！");
            
             }
    }

}

