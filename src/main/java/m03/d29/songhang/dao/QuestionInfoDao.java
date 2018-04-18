/**
 * Project Name:Qbaba
 * File Name:QuestionInfoDao.java
 * Package Name:m03.d29.songhang.dao
 * Date:2018年3月30日下午10:01:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.songhang.dao;

import java.util.List;

import m03.d29.songhang.entity.QuestionInfo;

/**
 * Description: <br/>
 * Date: 2018年3月30日 下午10:01:17 <br/>
 * 
 * @author songhang
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
