/**
 * Project Name:Qbaba
 * File Name:Number.java
 * Package Name:m01.d17
 * Date:2018年1月17日下午8:16:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d17.Qbaba;

import org.apache.log4j.Logger;



/**
 * Description:   <br/>
 * Date:     2018年1月17日 下午8:16:23 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Number {
    private int n1;
    private int n2;
    int num;
    
    public Number(){
        
        this.n1=5;
        this.n2=10;
    }
    
    
    public  void addition(){
        int num=n1+n2;
        
    }
    public  void subtration(){
        int num=n1-n2;
        
    }
    public  void addmultiplication(){
        int num=n1*n2;
        
    }
    public  void division(){
        int num=n2/n1;
        
    }
    private static final Logger LOG=Logger.getLogger(Number.class);
   public static void main(String[] args) {
       
       Number num= new Number();
       num.addition();
       LOG.info(num.num);
        num.addmultiplication();
       LOG.info(num.num);
       num.division();
       LOG.info(num.num);
       num.subtration();
       LOG.info(num.num);
}}






