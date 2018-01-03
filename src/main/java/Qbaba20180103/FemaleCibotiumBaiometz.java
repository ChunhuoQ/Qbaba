/**
 * Project Name:Shiqing-Gao
 * File Name:FemaleCibotiumBaiometz.java
 * Package Name:Qbaba20180103
 * Date:2018年1月3日下午2:26:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Qbaba20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午2:26:07 <br/>
 * @author   Qbaba
 * @version 
 * @see      创建一个实现类 雌性金毛狗;
 */
import java.util.Random;
import org.apache.log4j.Logger;
public class FemaleCibotiumBaiometz implements CibotiumBaiometz{
    
private final static Logger LOG=Logger.getLogger(FemaleCibotiumBaiometz.class);
    
final static String name="泷泽萝拉";
static int age;//变量 ： 年龄。


    @Override
    public String multiply() {
        
       LOG.info("\n金毛“"+nameself+"”和同品种雌性金毛“"+name+"”交配中...");
       
        return null;
    }

    /**
     * 
     *  狗狗一胎生几个不是固定的，所以加一个后代数量系统随机的方法；
     * @see Qbaba20180103.CibotiumBaiometz#unbornQuantity()
     * 一窝生崽子的数量。
     */
    @Override
    public int unbornQuantity() {
        
        Random ran=new Random();
        
        int Number=ran.nextInt();
        
        int unbornNumber=  Math.abs(Number%3+1);
        
        return unbornNumber;
    }
    
    
    
    public  int pregnancy(){
        
       return 4;
    }
    
    /**
     * 狗狗2岁才成年，方可繁衍！狗狗寿命不会超过10年！
     * Description: <br/>
     *
     * @author Qbaba
     * @param age
     * @return 设置一个获取和控制年龄的方法
     */

    public int honneyAge(int age){
        if(age>=0){
        if(age>=2&&age<10){
            
            this.age=age;
            
            multiply();
            
            LOG.info("\n"+pregnancy()+"个月之后。。。。。。。。");
            LOG.info("\n可喜可贺：\n"+this.age+"岁的母金毛“"+name+"”一窝生了"+unbornQuantity()+"个纯种金毛崽儿！");
        
        }
        else if(age<2){
            
            LOG.info("\n狗狗2岁成年！才能繁衍！配对失败...");
            
        }
        else{
            
            LOG.info("\n狗狗寿命不会超过十年...配对失败...");
            
        }}
        else {
            LOG.info("\n请输入正确的年龄数值！配对失败...");
        }
        return age;
    }
    
}

