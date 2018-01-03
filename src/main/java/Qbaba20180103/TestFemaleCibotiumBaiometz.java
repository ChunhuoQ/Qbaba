/**
 * Project Name:Shiqing-Gao
 * File Name:TestFemaleCibotiumBaiometz.java
 * Package Name:Qbaba20180103
 * Date:2018年1月3日下午3:05:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Qbaba20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午3:05:04 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class TestFemaleCibotiumBaiometz {

    private final static Logger LOG=Logger.getLogger(TestFemaleCibotiumBaiometz.class);
    
    public static void main(String[] args) throws Exception {//捕捉方法异常抛到异常里边去
        
        Scanner scanner= new Scanner(System.in);
        
        FemaleCibotiumBaiometz muJinMao= new FemaleCibotiumBaiometz();
        
        LOG.info("\n成年雄性金毛“"+muJinMao.nameself+"”处于发情期！下面为它寻找合适年龄的雌性金毛繁衍~");
        
        LOG.info("\n请输入雌性金毛“"+muJinMao.name+"”的年龄：");
        
        try{
        int age=scanner.nextInt();
        
        muJinMao.honneyAge(age);
        
        }
        catch(RuntimeException ee){
            
            throw new Exception("配对失败...配对失败...配对失败...\n\t\t\t您得。。。。。。..............输入年龄...输入年龄...输入年龄...输入年龄...");
            
        }finally{
            scanner.close();
        }
        
        
        }
    }



