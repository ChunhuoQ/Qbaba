/**
 * Project Name:Qbaba
 * File Name:QuestionInfoDaoImpl.java
 * Package Name:m03.d29.songhang.dao.impl
 * Date:2018年3月30日下午10:12:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.songhang.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m03.d29.songhang.dao.BaseDao;
import m03.d29.songhang.dao.QuestionInfoDao;
import m03.d29.songhang.entity.QuestionInfo;

/**
 * Description: <br/>
 * Date: 2018年3月30日 下午10:12:23 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class QuestionInfoDaoImpl extends BaseDao implements QuestionInfoDao<Object> {

    @Override
    public List<QuestionInfo> getAllInfo() {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "CALL cre_all";
            pst = getcon().prepareCall(sql);
            rsu = pst.executeQuery();
            while (rsu.next()) {
                QuestionInfo qi = new QuestionInfo();
                qi.setQuestionId(rsu.getInt(1));
                qi.setQuestion(rsu.getString(2));
                qi.setOptionA(rsu.getString(3));
                qi.setOptionB(rsu.getString(4));
                qi.setOptionC(rsu.getString(5));
                qi.setOptionD(rsu.getString(6));
                qi.setAnswer(rsu.getString(8));
                list.add(qi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pst, rsu);
        }
        return list;
    }

    @Override
    public List<QuestionInfo> getAllInfo1(int sub) {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "SELECT q.`questionId`,q.`question`,q.`optionA`,q.`optionB`,q.`optionC`,q.`optionD`,q.`answer` FROM question_info q WHERE SUBJECT=?";
            pst = getcon().prepareStatement(sql);
            pst.setInt(1, sub);
            rsu = pst.executeQuery();
            while (rsu.next()) {
                QuestionInfo qi = new QuestionInfo();
                qi.setQuestionId(rsu.getInt(1));
                qi.setQuestion(rsu.getString(2));
                qi.setOptionA(rsu.getString(3));
                qi.setOptionB(rsu.getString(4));
                qi.setOptionC(rsu.getString(5));
                qi.setOptionD(rsu.getString(6));
                qi.setAnswer(rsu.getString(7));
                list.add(qi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pst, rsu);
        }
        return list;

    }

    @Override
    public List<QuestionInfo> getAllInfo2(String like) {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "CALL cre_que_like(?);";
            pst = getcon().prepareCall(sql);
            pst.setString(1, "%" + like + "%");
            rsu = pst.executeQuery();
            while (rsu.next()) {
                QuestionInfo qi = new QuestionInfo();
                qi.setQuestionId(rsu.getInt(1));
                qi.setQuestion(rsu.getString(2));
                qi.setOptionA(rsu.getString(3));
                qi.setOptionB(rsu.getString(4));
                qi.setOptionC(rsu.getString(5));
                qi.setOptionD(rsu.getString(6));
                qi.setAnswer(rsu.getString(7));
                list.add(qi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pst, rsu);
        }
        return list;

    }

    @Override
    public int addInfo(Object t) {

        int flag = 0;
        try {
            String sql = "INSERT INTO question_info(question,optionA,optionB,optionC,optionD,SUBJECT,answer) VALUES(?,?,?,?,?,?,?)";
            Object[] obj = new Object[7];
            if (t instanceof QuestionInfo) {
                QuestionInfo qi = (QuestionInfo) t;
                obj[0] = qi.getQuestion();
                obj[1] = qi.getOptionA();
                obj[2] = qi.getOptionB();
                obj[3] = qi.getOptionC();
                obj[4] = qi.getOptionD();
                obj[5] = qi.getSubject();
                obj[6] = qi.getAnswer();
            }
            flag = controlDml(sql, obj);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public int deleteInfo(int id) {
        int flag = 0;
        try {
            String sql = "DELETE FROM question_info WHERE questionId=?";
            Object[] obj = new Object[1];
            obj[0] = id;
            flag = controlDml(sql, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }

}
