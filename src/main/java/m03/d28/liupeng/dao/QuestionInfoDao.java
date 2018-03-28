/**
 * Project Name:Qbaba
 * File Name:QuestionInfoDao.java
 * Package Name:m03.d28.liupeng.dao
 * Date:2018年3月28日下午3:18:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.liupeng.dao;

import java.util.List;

import m03.d28.liupeng.entity.QuestionInfo;

/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午3:18:13 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public interface QuestionInfoDao<T> {

    List<QuestionInfo> getAllInfo();

    List<QuestionInfo> getAllInfo1(int sub);

    List<QuestionInfo> getAllInfo2(String like);

    int addInfo(T t);

    int deleteInfo(int id);
}

