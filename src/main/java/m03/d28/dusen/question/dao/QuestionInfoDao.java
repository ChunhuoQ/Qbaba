/**
 * Project Name:jdbc_demo1
 * File Name:QuestionInfoDao.java
 * Package Name:com.question.dao.impl
 * Date:2018年3月28日下午3:02:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.question.dao;

import java.util.List;

import com.question.entity.QuestionInfo;

/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午3:02:59 <br/>
 * @author   DuSen
 * @version
 * @param <QuestionInfo>
 * @see
 */
public interface QuestionInfoDao<T> {
    List<QuestionInfo> getQuestionInfo();
    List<QuestionInfo> getAllsu(int a);
    List<QuestionInfo> getMhu(String cont);
    public int add(Object t);
    public int deleteInfo(int id);
}

