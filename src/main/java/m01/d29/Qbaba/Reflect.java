/**
 * Project Name:Qbaba

 * File Name:Reflect.java
 * Package Name:m01.d29.Qbaba
 * Date:2018年1月29日下午3:24:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d29.Qbaba;


import java.lang.reflect.Field;

import m01.d24.dusen.Person;

import org.junit.Test;

/**
 * Description:   <br/>
 * Date:     2018年1月29日 下午3:24:12 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Reflect {
    @Test
    public void Qbaba(){
        System.out.println("Qbaba");
    }
    @Test
    public void Qbaba1(){
        System.out.println("帅");
    }
    
    @SuppressWarnings("rawtypes")
    @Test
    public void Qbaba2(){
        try{
            Class cc =Person.class;
            Object obj =cc.newInstance();
            Field fd=cc.getDeclaredField("name");
            fd.setAccessible(true);
            Object tt=fd.get(obj);
            System.out.println(tt);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void Qbaba3(){
        try{
            Class cc =Class.forName("m01.d29.Qbaba.Person");
            Object obj =cc.newInstance();
            Field [] fd=cc.getFields();
            for(int i=0;i<fd.length;i++){
            fd[i].setAccessible(true);
         
            System.out.println(fd[i].get(obj));
        
            }}catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void Qbaba4(){
        try{
            Class cc =Class.forName("m01.d29.Qbaba.Person");
            Object obj =cc.newInstance();
            Field fd=cc.getField("age");
            fd.set(obj,"20");
            Field [] fd1=cc.getFields();
            for(int i=0;i<fd1.length;i++){
                fd1[i].setAccessible(true);
             
                System.out.println(fd1[i].get(obj));
            
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void Qbaba5(){
        try{
            Class cc =Person.class;
            Object obj =cc.newInstance();
            Field fd=cc.getField("age");
            fd.setInt(obj,20);
            Field [] fd1=cc.getFields();
            for(int i=0;i<fd1.length;i++){
                //fd1[i].setAccessible(true);
             
                System.out.println(fd1[i].get(obj));
            
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void Qbaba6(){
        try{
            Class cc =Person.class;
            Object obj =cc.newInstance();
            Field fd=cc.getField("age");
            fd.setInt(obj,20);
            Field [] fd1=cc.getFields();
            for(int i=0;i<fd1.length;i++){
                //fd1[i].setAccessible(true);
             
                System.out.println(fd1[i].get(obj));
            
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

