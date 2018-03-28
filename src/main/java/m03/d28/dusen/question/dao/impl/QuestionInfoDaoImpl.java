/**
 * Project Name:jdbc_demo1
 * File Name:QuestionInfoDaoImpl.java
 * Package Name:com.question.dao.impl
 * Date:2018年3月28日下午3:41:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.question.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.question.dao.BaseDao;
import com.question.dao.QuestionInfoDao;
import com.question.entity.QuestionInfo;

/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午3:41:43 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class QuestionInfoDaoImpl extends BaseDao implements QuestionInfoDao<Object>{

    
    /**
     *查询试题
     *
     * @see com.question.dao.QuestionInfoDao#getQuestionInfo()
     */
    @Override
    public List<QuestionInfo> getQuestionInfo() {
        List<QuestionInfo> list=new ArrayList<QuestionInfo>();
        try {
            String sql="SELECT * FROM question_info";
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
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
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return list;
    }
    /**
     * 根据科目查题目
     */
    @Override
    public List<QuestionInfo> getAllsu(int a) {
        List<QuestionInfo> list=new ArrayList<QuestionInfo>();
        String sql="SELECT * FROM question_info WHERE subject=?";
        try {
            pst=getCon().prepareStatement(sql);
            pst.setInt(1,a);
            rs=pst.executeQuery();
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
        } catch (SQLException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
        return list;
    }
    @Override
    public List<QuestionInfo> getMhu(String cont) {
        List<QuestionInfo> list=new ArrayList<QuestionInfo>();
        String sql="SELECT * FROM question_info WHERE question LIKE ?";
        try {
            pst=getCon().prepareStatement(sql);
            pst.setString(1,"%"+cont+"%");
            rs=pst.executeQuery();
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
        } catch (SQLException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
        return list;
    }
    
    @Override
    public int add(Object t) {
        int flag=0;
        String sql=" INSERT INTO question_info(questionId,question,optionA,optionB,optionC,optionD,SUBJECT,answer) VALUES(?,?,?,?,?,?,?,?)";
        Object[] obj=new Object[8];
        if(t instanceof QuestionInfo){
            QuestionInfo qf=(QuestionInfo)t;
            obj[0]=qf.getQuestionId();
            obj[1]=qf.getQuestion();
            obj[2]=qf.getOptionA();
            obj[3]=qf.getOptionB();
            obj[4]=qf.getOptionC();
            obj[5]=qf.getOptionD();
            obj[6]=qf.getSubject();
            obj[7]=qf.getAnswer();
        }
        flag=controlDml(sql,obj);
        return flag;
    }
    @Override
    public int deleteInfo(int id){
        int flag=0;
        try { 
         String sql="DELETE FROM question_info WHERE questionId=?";
         Object[] obj=new Object[1];
         obj[0]=id;
         flag=controlDml(sql, obj); 
        } catch (Exception e) {
            // TODO: handle exception
        }
        return flag;
    }
}

