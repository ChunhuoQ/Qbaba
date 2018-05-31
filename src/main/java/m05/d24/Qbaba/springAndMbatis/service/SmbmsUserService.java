/**
 * Project Name:Qbaba
 * File Name:SmbmsUserService.java
 * Package Name:m05.d24.Qbaba.springAndMbatis.service.impl
 * Date:2018年5月24日下午2:51:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d24.Qbaba.springAndMbatis.service;

import org.springframework.stereotype.Component;


import m05.d24.Qbaba.springAndMbatis.opjo.SmbmsUser;

/**
 * Description:   <br/>
 * Date:     2018年5月24日 下午2:51:32 <br/>
 * @author   Qbaba
 * @version
 * @see
 */

public interface SmbmsUserService {

    public abstract SmbmsUser selectByPrimaryKey(Integer id);

}
