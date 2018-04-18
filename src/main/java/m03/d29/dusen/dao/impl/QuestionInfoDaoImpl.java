/**
 * Project Name:jdbc_demo2
 * File Name:QuestionInfoDaoImpl.java
 * Package Name:m03.d29.dusen.dao.impl
 * Date:2018年3月30日上午10:18:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.dusen.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import m03.d29.dusen.dao.BaseDao;
import m03.d29.dusen.dao.QuestionInfoDao;
import m03.d29.dusen.entity.QuestionInfo;

/**
 * Description:   <br/>
 * Date:     2018年3月30日 上午10:18:59 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class QuestionInfoDaoImpl extends BaseDao implements QuestionInfoDao{

    @Override
    public List<QuestionInfo> cha() {
        List<QuestionInfo> list=new ArrayList<QuestionInfo>();
        try {
            String sql="CALL cha";
            cs=getCon().prepareCall(sql);
            rs=cs.executeQuery();
            while(rs.next()){
                QuestionInfo qi=new QuestionInfo();
                qi.setQuestionId(rs.getInt(1));
                qi.setQuestion(rs.getString(2));
                qi.setOptionA(rs.getString(3));
                qi.setOptionB(rs.getString(4));
                qi.setOptionC(rs.getString(5));
                qi.setOptionD(rs.getString(6));
                qi.setSubject(rs.getInt(7));
                qi.setAnswer(rs.getString(8));
                list.add(qi);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }finally{
            close(con, cs, rs);
        }
       
        return list;
    }

    @Override
    public List<QuestionInfo> getAllsu(int a) {
        
        return null;
    }

    @Override
    public List<QuestionInfo> getMhu(String cont) {
        List<QuestionInfo> list=new ArrayList<QuestionInfo>();
        String sql="CALL mohu(?);";
        try {
            cs=getCon().prepareCall(sql);
            cs.setString(1, "%"+cont+"%");
            rs=cs.executeQuery();
            while(rs.next()){
                QuestionInfo qi=new QuestionInfo();
                qi.setQuestionId(rs.getInt(1));
                qi.setQuestion(rs.getString(2));
                qi.setOptionA(rs.getString(3));
                qi.setOptionB(rs.getString(4));
                qi.setOptionC(rs.getString(5));
                qi.setOptionD(rs.getString(6));
                qi.setSubject(rs.getInt(7));
                qi.setAnswer(rs.getString(8));
                list.add(qi);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
      
        //  Auto-generated method stub
        return list;
    }

    @Override
    public int add(Object t) {
        
        //  Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteInfo(int id) {
        
        //  Auto-generated method stub
        return 0;
    }

 
}

