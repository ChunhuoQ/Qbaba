/**
 * Project Name:Qbaba
 * File Name:UserDaoImpl.java
 * Package Name:m04.d12.Qbaba.impl
 * Date:2018年4月14日下午4:10:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.Qbaba.impl;



import java.util.List;


import org.junit.Test;

import m04.d12.Qbaba.entity.User;
import m04.d12.Qbaba.mapper.UserMapper;

/**
 * Description:   <br/>
 * Date:     2018年4月14日 下午4:10:58 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class UserDaoImpl extends MyBatisOpen implements UserMapper {
    
    
    @Override
    public List<User> selectUserAll() {
        List<User> listuser=session.selectList("m04.d12.Qbaba.impl.UserDaoImpl.selectUserAll");
        //  Auto-generated method stub
        return listuser;
    }

    @Override
    public boolean getviliteUser(User user) {
        boolean flag1;
        int flag=session.selectOne("m04.d12.Qbaba.impl.UserDaoImpl.getviliteUser",user);
        if(flag>0){
          flag1=true;  
        }else{
            flag1=false; 
        }
        
        return flag1;
    }

  /*  @Test
     public void go(){
         List<User> list=selectUserAll();
         System.out.println(list);
     }
*/

    
}

