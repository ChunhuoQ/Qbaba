/**
 * Project Name:Qbaba
 * File Name:twoceThread.java
 * Package Name:m01.d08.Qbaba
 * Date:2018年1月8日下午4:27:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.Qbaba;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:27:38 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class twoceThread implements Runnable{
    private long number;
    
    public twoceThread(long number) throws InterruptedException{
        
        
        
        this.number=number;
        
       
        
    }
    
    
    
    

    @Override
    public void run() {

        
         
        
        System.out.println("用户："+number);
        
        
    }







    
    
    
    
    
    
}

