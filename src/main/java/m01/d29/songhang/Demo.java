/**
 * Project Name:Qbaba
 * File Name:Demo.java
 * Package Name:m01.d29.songhang
 * Date:2018年1月29日下午3:39:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d29.songhang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.junit.Test;

/**
 * Description: <br/>
 * Date: 2018年1月29日 下午3:39:32 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Demo {
    @Test
    public void show() {
        System.out.println("你吃饭了吗");
    }

    @Test
    public void show1() {
        System.out.println("hello");
    }

    @Test
    public void show3() {
        try {
            // 1.用反射加载类
            // 包名+类名：全限定名
            Class cc = Class.forName("m01.d29.songhang.Person");// 要是根目录的路径
            // 2实例化：把字节码文件进行实例化处理newInstance()
            Object ij = cc.newInstance();
            Field field = cc.getDeclaredField("name");// 得到一个字段，name是自定义的 需要用到
            field.setAccessible(true);// 暴力访问，也就是私有的也要访问
            Object tt = field.get(ij);
            System.out.println("tt:" + tt);

        } catch (Exception e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
    }

    @Test
    public void show4() {
        try {
            // 1.用反射加载类
            // 包名+类名：全限定名
            Class cc = Class.forName("m01.d29.songhang.Person");// 要是根目录的路径
            // 2实例化：把字节码文件进行实例化处理newInstance()
            Object ij = cc.newInstance();

            // Field field = cc.getDeclaredField("name");// 得到一个字段，name是自定义的
            // 需要用到
            // /field.setAccessible(true);// 暴力访问，也就是私有的也要访问
            // Object tt = field.get(ij);
            Field[] fd = cc.getFields();
            for (int i = 0; i < fd.length; i++) {
                Object tt = fd[i].get(ij);
                System.out.println("tt:" + tt);
            }

        } catch (Exception e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
    }

    @Test
    public void show5() {
        try {
            // 1.用反射加载类
            // 包名+类名：全限定名
            Class cc = Class.forName("m01.d29.songhang.Person");// 要是根目录的路径
            // 2实例化：把字节码文件进行实例化处理newInstance()
            Object ij = cc.newInstance();

            // Field field = cc.getDeclaredField("name");// 得到一个字段，name是自定义的
            // 需要用到
            // /field.setAccessible(true);// 暴力访问，也就是私有的也要访问
            // Object tt = field.get(ij);
            Constructor con = cc.getDeclaredConstructor();

        } catch (Exception e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
    }

    public void show6() {
        try {
            // 1.用反射加载类
            // 包名+类名：全限定名
            Class cc = Class.forName("m01.d29.songhang.Person");// 要是根目录的路径
            // 2实例化：把字节码文件进行实例化处理newInstance()
            // Object ij = cc.newInstance();

            // Field field = cc.getDeclaredField("name");// 得到一个字段，name是自定义的
            // 需要用到
            // /field.setAccessible(true);// 暴力访问，也就是私有的也要访问
            // Object tt = field.get(ij);
            Constructor con = cc.getDeclaredConstructor(int.class, int.class);
            Object ij = con.newInstance(10, 20);
            // System.out.println(ij);
        } catch (Exception e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
    }
}
