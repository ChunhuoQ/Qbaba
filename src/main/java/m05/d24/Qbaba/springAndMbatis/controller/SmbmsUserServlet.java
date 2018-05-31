/**
 * Project Name:Qbaba
 * File Name:SmbmsUserServiceImpl.java
 * Package Name:m05.d24.Qbaba.springAndMbatis.controller
 * Date:2018年5月25日上午10:56:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d24.Qbaba.springAndMbatis.controller;

import m05.d24.Qbaba.springAndMbatis.service.SmbmsUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:   <br/>
 * Date:     2018年5月25日 上午10:56:43 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
@Component("smbmsUserServlet")
public class SmbmsUserServlet {
    @Autowired
    private SmbmsUserService sus;
    public void doGet(){
       System.out.println(sus.selectByPrimaryKey(1)); 
    }
    
}

