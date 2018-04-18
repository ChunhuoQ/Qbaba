/**
 * Project Name:Qbaba
 * File Name:RevertDaoImpl.java
 * Package Name:m04.d12.Qbaba.impl
 * Date:2018年4月16日下午9:06:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.Qbaba.impl;

import java.util.List;

import org.junit.Test;

import m04.d12.Qbaba.entity.Message;
import m04.d12.Qbaba.entity.Revert;
import m04.d12.Qbaba.mapper.RevertMapper;

/**
 * Description:   <br/>
 * Date:     2018年4月16日 下午9:06:47 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class RevertDaoImpl extends MyBatisOpen implements RevertMapper{

    @Override
    public List<Revert> selectRevAll() {
        
        List<Revert> list = session.selectList("m04.d12.Qbaba.impl.RevertDaoImpl.selectRevAll");
        //  Auto-generated method stub
        return list;
    }

@Override
public List<Revert> reveListById(String id) {
    int id1=Integer.valueOf(id);
    List<Revert> list=session.selectList("m04.d12.Qbaba.impl.RevertDaoImpl.reveListById",id1);
    return list;
   
}

@Override
public void insertRev(Revert revert) {
    
    int i=session.insert("m04.d12.Qbaba.impl.RevertDaoImpl.insertRev",revert);
    System.out.println(i);
}

@Override
public int reveByNum() {
    
    int num=session.selectOne("m04.d12.Qbaba.impl.RevertDaoImpl.reveByNum");
    return num;
}



}

