/**
 * Project Name:Qbaba
 * File Name:S.java
 * Package Name:m04.d19.Qbaba.impl
 * Date:2018年4月19日下午3:33:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d19.Qbaba.impl;

import java.util.List;

import org.junit.Test;

import m04.d19.Qbaba.entity.ShangPing;
import m04.d19.Qbaba.mapper.ShangPingMapper;

/**
 * Description:   <br/>
 * Date:     2018年4月19日 下午3:33:12 <br/>
 * @author   Qbaba
 * @version
 * @see 
 */
public class SpDaoImpl extends MyBatisOpen implements ShangPingMapper{

    @Override
    public List<ShangPing> selectPsAll() {
        
        List<ShangPing> list=session.selectList("m04.d19.Qbaba.impl.SpDaoImpl.selectPsAll");
        return list;
    }

    @Override
    public List<ShangPing> selectPsById(Integer id) {
        
        List<ShangPing> list=session.selectList("m04.d19.Qbaba.impl.SpDaoImpl.selectPsById",id);
        return list;
    }

    
}

