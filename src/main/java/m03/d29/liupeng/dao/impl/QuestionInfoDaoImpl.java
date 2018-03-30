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

import m03.d28.liupeng.entity.QuestionInfo;
import m03.d29.liupeng.dao.BaseDao;
import m03.d29.liupeng.dao.QuestionInfoDao;

/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午2:38:32 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class QuestionInfoDaoImpl extends BaseDao implements QuestionInfoDao {




    @Override
    public List getAllInfo() {

        // Auto-generated method stub
        return null;
    }

    @Override
    public List getAllInfo1(int sub) {

        // Auto-generated method stub
        return null;
    }

    @Override
    public List getAllInfo2(String like) {

        // Auto-generated method stub
        return null;
    }

    @Override
    public int addInfo(Object t) {

        // Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteInfo(int id) {

        // Auto-generated method stub
        return 0;
    }

    @Override
    public List callProcedureAllInfo() {
        List<QuestionInfo> list = new ArrayList<QuestionInfo>();
        try {
            String sql = "CALL pro_test_01;";
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

    @Override
    public List callProcedureLikeInfo(String str) {

        // Auto-generated method stub
        return null;
    }

}

