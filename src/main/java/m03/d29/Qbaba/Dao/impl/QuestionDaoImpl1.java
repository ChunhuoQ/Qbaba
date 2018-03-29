/**
 * Project Name:Qbaba
 * File Name:BizDaoImpl.java
 * Package Name:m03.d28.Qbaba.impl
 * Date:2018年3月28日下午1:51:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.Qbaba.Dao.impl;

import java.util.ArrayList;
import java.util.List;

import m03.d28.Qbaba.Dao.BaseDao;
import m03.d28.Qbaba.Dao.QuestionDao;
import m03.d28.Qbaba.entity.QuestionInfoDaoImpl;
import m03.d29.Qbaba.Dao.BaseDao1;
import m03.d29.Qbaba.Dao.QuestionDao1;
import m03.d29.Qbaba.entity.QuestionInfoDaoImpl1;



/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午1:51:57 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class QuestionDaoImpl1 extends BaseDao1 implements QuestionDao1  {
    
    
    @Override
    public List getAllQuestionInfoDaoImpl(String str) {
        List<QuestionInfoDaoImpl> list= new ArrayList<QuestionInfoDaoImpl>();
    try {
        
        String sql=str;
        pst=getCon().prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            QuestionInfoDaoImpl fo=new QuestionInfoDaoImpl();
            fo.setQuestionId(rs.getInt(1));
            fo.setQuestion(rs.getString(2));
            fo.setOptionA(rs.getString(3));
            fo.setOptionB(rs.getString(4));
            fo.setOptionC(rs.getString(5));
            fo.setOptionD(rs.getString(6));
            fo.setSubject(rs.getInt(7));
            fo.setAnswer(rs.getString(8));
            list.add(fo);
        }
    } catch (Exception e) {
       e.printStackTrace();
    }finally{
        close(con,pst,rs);
    }
        return list;
    }




    @Override
    public int deleteQuestionInfoDaoImpl(int id) {
        int falg=0;
        
            try {
            String sql="DELETE FROM question_info WHERE questionId=?";
            Object[] obj=new Object[1];
            obj[0]=id;
            falg=controlDml(sql,obj);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return falg;
    }

    @Override
    public int saveQuestionInfoDaoImpl(Object t) {
        int flag=0;
        try {
            String sql="INSERT INTO question_info(question,optionA,optionB,optionC,optionD,SUBJECT,answer) VALUES(?,?,?,?,?,?,?)";
            Object[] obj=new Object[7];
            if(t instanceof QuestionInfoDaoImpl){
                QuestionInfoDaoImpl ff=(QuestionInfoDaoImpl)t;
                obj[0]=ff.getQuestion();
                obj[1]=ff.getOptionA();
                obj[2]=ff.getOptionB();
                obj[3]=ff.getOptionC();
                obj[4]=ff.getOptionD();
                obj[5]=ff.getSubject();
                obj[6]=ff.getAnswer();
            }
            flag=controlDml(sql,obj); 
        } catch (Exception e) {
           e.printStackTrace();
        }
        return flag;
    }




    @Override
    public void callprocedure() {
        
        int result=0;
        try {
            String sql="CALL cre_all";
            cstate=getCon().prepareCall(sql);
            rs= cstate.executeQuery();
            
            
            
            List<QuestionInfoDaoImpl1> list=new ArrayList<QuestionInfoDaoImpl1>();
            QuestionDaoImpl1 qdl=  new QuestionDaoImpl1();
            QuestionInfoDaoImpl1 fo=new QuestionInfoDaoImpl1();
            while(rs.next()){
            fo.setQuestionId(rs.getInt(1));
            fo.setQuestion(rs.getString(2));
            fo.setOptionA(rs.getString(3));
            fo.setOptionB(rs.getString(4));
            fo.setOptionC(rs.getString(5));
            fo.setOptionD(rs.getString(6));
            fo.setSubject(rs.getInt(7));
            fo.setAnswer(rs.getString(8));
            list.add(fo);
            }
            
            for (QuestionInfoDaoImpl1 fo1 : list) {
                
                System.out.println(fo1.getQuestionId() + "." + fo1.getQuestion() + "\n" + fo1.getOptionA() + "\n"
                        + fo1.getOptionB() + "\n" + fo1.getOptionC() + "\n" + fo1.getOptionD() + "\n" + fo1.getAnswer());
            }
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }



//注意 --CALL cre_qeu('变量名')
    @Override
    public void callprocedure2(String subject) {
        
        try {
            String sql="CALL cre_qeu('"+subject+"')";
            cstate= getCon().prepareCall(sql);
            rs=cstate.executeQuery();//执行
            List<QuestionInfoDaoImpl1> list=new ArrayList<QuestionInfoDaoImpl1>();
            QuestionDaoImpl1 qdl=  new QuestionDaoImpl1();
            QuestionInfoDaoImpl1 fo=new QuestionInfoDaoImpl1();
            while(rs.next()){
            fo.setQuestionId(rs.getInt(1));
            fo.setQuestion(rs.getString(2));
            fo.setOptionA(rs.getString(3));
            fo.setOptionB(rs.getString(4));
            fo.setOptionC(rs.getString(5));
            fo.setOptionD(rs.getString(6));
            fo.setSubject(rs.getInt(7));
            fo.setAnswer(rs.getString(8));
            list.add(fo);
            }
            
            for (QuestionInfoDaoImpl1 fo1 : list) {
                
                System.out.println(fo1.getQuestionId() + "." + fo1.getQuestion() + "\n" + fo1.getOptionA() + "\n"
                        + fo1.getOptionB() + "\n" + fo1.getOptionC() + "\n" + fo1.getOptionD() + "\n" + fo1.getAnswer());
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

    
    
}

