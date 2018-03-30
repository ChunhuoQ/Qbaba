/**
 * Project Name:TestSystem2018
 * File Name:QuestionInfoDaoImpl.java
 * Package Name:main.java.m03.d28.liupeng.dao.impl
 * Date:2018年3月28日下午2:38:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.liupeng.dao.impl;

import java.util.ArrayList;
import java.util.List;

import m03.d29.liupeng.dao.BaseDao;
import m03.d29.liupeng.dao.QuestionInfoDao;
import m03.d29.liupeng.entity.QuestionInfo;

/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午2:38:32 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class QuestionInfoDaoImpl extends BaseDao implements QuestionInfoDao {

    // 1、列出所有试题
    @Override
    public List<QuestionInfo> getAllInfo() {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "CALL pro_test_01";
            cstate = getCon().prepareCall(sql);
            rs = cstate.executeQuery();
            while (rs.next()) {
                QuestionInfo qi = new QuestionInfo();
                qi.setQuestionId(rs.getInt(1));
                qi.setQuestion(rs.getString(2));
                qi.setOptionA(rs.getString(3));
                qi.setOptionB(rs.getString(4));
                qi.setOptionC(rs.getString(5));
                qi.setOptionD(rs.getString(6));
                qi.setAnswer(rs.getString(8));
                list.add(qi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        return list;
    }

    // 按科目查询
    @Override
    public List<QuestionInfo> getAllInfo1(int sub) {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "SELECT q.`questionId`,q.`question`,q.`optionA`,q.`optionB`,q.`optionC`,q.`optionD`,q.`answer` FROM question_info q WHERE SUBJECT=?";
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, sub);
            rs = pst.executeQuery();
            while (rs.next()) {
                QuestionInfo qi = new QuestionInfo();
                qi.setQuestionId(rs.getInt(1));
                qi.setQuestion(rs.getString(2));
                qi.setOptionA(rs.getString(3));
                qi.setOptionB(rs.getString(4));
                qi.setOptionC(rs.getString(5));
                qi.setOptionD(rs.getString(6));
                qi.setAnswer(rs.getString(7));
                list.add(qi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
        }
        return list;
    }

    @Override
    public List getAllInfo2(String like) {

        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "CALL pro_test_02(?)";
            cstate = getCon().prepareCall(sql);
            cstate.setString(1, "%" + like + "%");
            rs = cstate.executeQuery();
            while (rs.next()) {
                QuestionInfo qi = new QuestionInfo();
                qi.setQuestionId(rs.getInt(1));
                qi.setQuestion(rs.getString(2));
                qi.setOptionA(rs.getString(3));
                qi.setOptionB(rs.getString(4));
                qi.setOptionC(rs.getString(5));
                qi.setOptionD(rs.getString(6));
                qi.setAnswer(rs.getString(7));
                list.add(qi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs, cstate);
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

