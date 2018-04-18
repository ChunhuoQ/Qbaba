/**
 * Project Name:Qbaba
 * File Name:QuestionInfoDao.java
 * Package Name:m03.d28.Qbaba.Dao
 * Date:2018年3月28日下午1:50:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.Qbaba.Dao;

import java.util.List;

import m03.d28.Qbaba.entity.QuestionInfoDaoImpl;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午1:50:35 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public interface QuestionDao<T> {
    List<QuestionInfoDaoImpl> getAllQuestionInfoDaoImpl(String str);

    int deleteQuestionInfoDaoImpl(int id);

    int saveQuestionInfoDaoImpl(T t);

}
