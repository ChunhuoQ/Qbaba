/**
 * Project Name:Demo
 * File Name:QuestionInfoDaoImpl.java
 * Package Name:dao2
 * Date:2018��3��28������4:14:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.lvruiling.dao2;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <br/>
 * Date: 2018��3��28�� ����4:14:05 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class QuestionInfoDaoImpl extends BaseDao implements questionInfoDao {

    @Override
    public List<QuestionInfo> getAllInfo() {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "SELECT * FROM question_info";
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                QuestionInfo ff = new QuestionInfo();
                ff.setQuestionId(rs.getInt(1));
                ff.setQuestion(rs.getString(2));
                ff.setOptionA(rs.getString(3));
                ff.setOptionB(rs.getString(4));
                ff.setOptionC(rs.getString(5));
                ff.setOptionD(rs.getString(6));
                ff.setSubject(rs.getInt(7));
                ff.setAnswer(rs.getString(8));

                list.add(ff);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Auto-generated method stub
        return list;
    }

    @Override
    public int deleteInfo(int id) {

        int flag = 0;
        try {
            String sql = "DELETE FROM question_info WHERE questionid=?";
            Object[] obj = new Object[1];
            obj[0] = id;
            flag = controlDml(sql, obj);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public int saveInfo2(Object t) {// t:Info2 实体类
        // TODO Auto-generated method stub
        int flag = 0;
        try {
            String sql = "INSERT INTO question_info(question,optionA,optionB,optionC,optionD,SUBJECT,answer) VALUES(?,?,?,?,?,?,?)";
            Object[] obj = new Object[2];
            if (t instanceof QuestionInfo) {
                QuestionInfo ff = (QuestionInfo) t;
                obj[0] = ff.getQuestion();
                obj[1] = ff.getOptionA();
                obj[2] = ff.getOptionB();
                obj[3] = ff.getOptionC();
                obj[4] = ff.getOptionD();
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
