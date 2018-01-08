/**
 * Project Name:Qbaba
 * File Name:ManyThread.java
 * Package Name:m01.d08.Qbaba
 * Date:2018年1月8日下午3:17:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.Qbaba;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:17:13 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class ManyThread extends Thread{

     long number;
    
    public  ManyThread(long number){
       
        this.number=number;
        
       }
    
    public void run (){
        
        System.out.println("输出为："+number);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
    }
    
    
}

