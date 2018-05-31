/**
 * Project Name:Qbaba
 * File Name:LoginServiceImpl.java
 * Package Name:m05.d28.com.dt59.service.impl
 * Date:2018年5月29日下午3:23:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d28.com.dt59.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import m05.d28.com.dt59.mapper.AuctionUserMapper;
import m05.d28.com.dt59.ojpo.AuctionUser;
import m05.d28.com.dt59.service.LoginService;

/**
 * Description:   <br/>
 * Date:     2018年5月29日 下午3:23:55 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
@Service
public class LoginServiceImpl implements LoginService{
    
    @Autowired
    private AuctionUserMapper aum;
    
    @Override
    public int deleteByPrimaryKey(Integer userid) {
        
        //  Auto-generated method stub
        return aum.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(AuctionUser record) {
        
        //  Auto-generated method stub
        return aum.insert(record);
    }

    @Override
    public int insertSelective(AuctionUser record) {
        
        //  Auto-generated method stub
        return aum.insertSelective(record);
    }

    @Override
    public AuctionUser selectByPrimaryKey(Integer userid) {
        
        //  Auto-generated method stub
        return aum.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByPrimaryKeySelective(AuctionUser record) {
        
        //  Auto-generated method stub
        return aum.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AuctionUser record) {
        
        //  Auto-generated method stub
        return aum.updateByPrimaryKey(record);
    }

    @Override
    public int selectByUserAndPwd(AuctionUser user) {
        
        //  Auto-generated method stub
        return aum.selectByUserAndPwd(user);
    }

}

