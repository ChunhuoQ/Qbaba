/**
 * Project Name:Qbaba
 * File Name:MessageDapImpl.java
 * Package Name:m04.d12.Qbaba.impl
 * Date:2018年4月16日下午3:19:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.Qbaba.impl;

import java.util.List;

import org.junit.Test;

import m04.d12.Qbaba.entity.Message;
import m04.d12.Qbaba.mapper.MessageMapper;
import m04.d12.Qbaba.mapper.NewsMapper;

/**
 * Description:   <br/>
 * Date:     2018年4月16日 下午3:19:45 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class MessageDapImpl extends MyBatisOpen implements MessageMapper{

    @Override
    public List<Message> selectMesAll() {
        
        List<Message> listmes=session.selectList("m04.d12.Qbaba.impl.MessageDapImpl.selectMesAll");
        return listmes;
    }

    @Override
    public List<Message> messListById(String id) {
        int id1=Integer.valueOf(id);
        List<Message> listmes=session.selectList("m04.d12.Qbaba.impl.MessageDapImpl.messListById",id1);
        return listmes;
    }
    


@Override
public void updatemess(Integer id) {
    
   session.update("m04.d12.Qbaba.impl.MessageDapImpl.updatemess",id);
   session.commit();
    
}
}

