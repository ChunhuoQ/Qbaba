/**
 * Project Name:Demo_pro_jdbc_fc_01
 * File Name:QuestionInfoDao.java
 * Package Name:cn.dt59.dao
 * Date:2018年3月28日下午5:51:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.songhang.dt59.dao;

import java.util.List;

import m03.d28.songhang.dt59.entity.QuestionInfo;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午5:51:22 <br/>
 * 
 * @author songhang
 * @version
 * @see 创建DAO接口QuestionInfoDao，<br/>
 *      定义查询所有试题，按科目查询试题，按题干模糊查询试题，<br/>
 *      添加试题，删除试题、按试题编号查询试题的方法。<br/>
 */
public interface QuestionInfoDao<T> {
    List<QuestionInfo> getAllQuestion(String str);// 定义查询所有试题

    int deleteQuestion(int id);

    int addQuestion(T t);
}
