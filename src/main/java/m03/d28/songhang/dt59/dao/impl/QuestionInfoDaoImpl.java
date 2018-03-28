/**
 * Project Name:Demo_pro_jdbc_fc_01
 * File Name:QuestionInfoDaoImpl.java
 * Package Name:cn.dt59.dao.impl
 * Date:2018年3月28日下午6:25:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.songhang.dt59.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m03.d28.songhang.dt59.dao.BaseDao;
import m03.d28.songhang.dt59.dao.QuestionInfoDao;
import m03.d28.songhang.dt59.entity.QuestionInfo;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午6:25:33 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class QuestionInfoDaoImpl extends BaseDao implements QuestionInfoDao {

    @Override
    public List<QuestionInfo> getAllQuestion(String str) {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "SELECT*FROM question_info";
            pst = getCon().prepareStatement(sql);
            rsu = pst.executeQuery();
            while (rsu.next()) {
                QuestionInfo info = new QuestionInfo();
                info.setQuestionId(rsu.getInt(1));
                info.setQuestion(rsu.getString(2));
                info.setQuestionA(rsu.getString(3));
                info.setQuestionB(rsu.getString(4));
                info.setQuestionC(rsu.getString(5));
                info.setQuestionD(rsu.getString(6));
                info.setSubject(rsu.getInt(7));
                info.setAnswer(rsu.getString(8));
                list.add(info);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public int deleteQuestion(int id) {
        int flog = 0;
        try {
            String sql = "DELETE FROM question_info WHERE questionId=?";
            Object[] obj = new Object[1];
            obj[0] = id;
            flog = controlDml(sql, obj);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return flog;
    }

    @Override
    public int addQuestion(Object t) {
        int flag = 0;
        try {
            String sql = "INSERT INTO question_info(question,optionA,optionB,optionC,optionD,SUBJECT,answer) VALUES(?,?,?,?,?,?,?)";
            Object[] obj = new Object[7];
            if (t instanceof QuestionInfo) {
                QuestionInfo ff = (QuestionInfo) t;

                obj[0] = ff.getQuestion();
                obj[1] = ff.getQuestionA();
                obj[2] = ff.getQuestionB();
                obj[3] = ff.getQuestionC();
                obj[4] = ff.getQuestionD();
                obj[5] = ff.getSubject();
                obj[6] = ff.getAnswer();
            }
            flag = controlDml(sql, obj);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return flag;
    }
}
