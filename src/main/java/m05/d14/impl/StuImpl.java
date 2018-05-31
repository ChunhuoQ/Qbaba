/**
 * Project Name:Qbaba
 * File Name:StuImpl.java
 * Package Name:m05.d14.impl
 * Date:2018年5月14日上午10:57:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d14.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import m05.d14.mapper.StuMapper;
import m05.d14.opjo.Stu;

/**
 * Description:   <br/>
 * Date:     2018年5月14日 上午10:57:36 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class StuImpl extends MyBatisOpen implements StuMapper{

    @Override
    public List<Stu> selectAllStu() {
        
        List<Stu> list =new ArrayList<Stu>();

            list = session.selectList("m05.d14.impl.StuImpl.selectAllStu");
   
        //  Auto-generated method stub
        return list;
    }


    @Override
    public List<Stu> selectDouble() {
        
        List<Stu> list=session.selectList("m05.d14.impl.StuImpl.selectDouble");
        return list;
    }


    @Override
    public List<Stu> selectStuByLike(String name) {
        List<Stu> list = session.selectList("m05.d14.impl.StuImpl.selectStuByLike",name);
        //  Auto-generated method stub
        return list;
    }


    @Override
    public int insertStu(Stu stu) {
        
      int flag = session.insert("m05.d14.impl.StuImpl.insertStu", stu);
      session.commit();
        return flag;
    }


    @Override
    public List<HashMap<String, Object>> selectAllStu2() {
        
        //  Auto-generated method stub
        return null;
    }

}

