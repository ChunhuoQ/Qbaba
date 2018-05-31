/**
 * Project Name:Qbaba
 * File Name:SmbmsUserServiceImpl.java
 * Package Name:m05.d24.Qbaba.springAndMbatis.service.impl
 * Date:2018年5月24日下午2:45:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d24.Qbaba.springAndMbatis.service.impl;


import m05.d24.Qbaba.springAndMbatis.service.SmbmsUserService;
import m05.d24.Qbaba.springAndMbatis.mapper.SmbmsUserMapper;
import m05.d24.Qbaba.springAndMbatis.opjo.SmbmsUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:   <br/>
 * Date:     2018年5月24日 下午2:45:13 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
@Service
public class SmbmsUserServiceImpl implements SmbmsUserService {
     @Autowired
     private SmbmsUserMapper user;
     
    /**
     *
     * @see m05.d24.Qbaba.springAndMbatis.service.SmbmsUserService#selectByPrimaryKey(java.lang.Integer)
     */
    @Override
    public SmbmsUser selectByPrimaryKey(Integer id){
        return user.selectByPrimaryKey(id);
    }
}

