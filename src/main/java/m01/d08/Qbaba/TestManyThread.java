/**
 * Project Name:Qbaba
 * File Name:TestManyThread.java
 * Package Name:m01.d08.Qbaba
 * Date:2018年1月8日下午4:13:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d08.Qbaba;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:13:38 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class TestManyThread {

  public static void main(String[] args) throws InterruptedException   {
        /*for(int i=4; i<90;i++){
         ManyThread st=new ManyThread(i);
            st.start();
            if(i%2==0){
                System.out.print("vip:");
              st.setPriority(Thread.MAX_PRIORITY);
            }
            else if(i%3==0){
                System.out.print("黑名单:");
                st.setPriority(Thread.MIN_PRIORITY);
    }
            else{
                System.out.print("普通用户");
                st.setPriority(Thread.NORM_PRIORITY);
            }*/
        for(int o=4; o<50;o++){
           
            Thread  sr= new Thread (new twoceThread(o));
               sr.start();
               if(o%9==0){
                   System.out.print("vip");
                 sr.setPriority(Thread.MAX_PRIORITY);
               }
               else if(o%14==0){
                   System.out.print("黑名单");
                   sr.setPriority(Thread.MIN_PRIORITY);
                   Thread.sleep(200);
               }
               
            }
       }
   }
    
    
    
    


