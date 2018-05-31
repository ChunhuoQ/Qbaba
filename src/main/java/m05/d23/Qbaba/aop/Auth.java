/**
 * Project Name:Qbaba
 * File Name:Auth.java
 * Package Name:m05.d23.Qbaba.aop
 * Date:2018年5月24日下午1:23:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d23.Qbaba.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Description:   <br/>
 * Date:     2018年5月24日 下午1:23:43 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Auth {
    private String username="admin";//admin 
    private String password="123456";//123456
    public void isLogin(ProceedingJoinPoint pjp){
        try {
        if("admin".equals(username)&&"123456".equals(password)){
            System.out.println("恭喜您，登录成功");
           pjp.proceed();
        }else{
            System.out.println("亲，您逗我玩吗？");
        }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}