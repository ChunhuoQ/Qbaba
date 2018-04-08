/**
 * Project Name:Qbaba
 * File Name:QuestionInfoDao.java
 * Package Name:m03.d28.Qbaba.Dao
 * Date:2018年3月28日下午1:50:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.Qbaba.Dao;

import java.util.List;

import m04.d03.Qbaba.entity.NewsInfo;
import m04.d03.Qbaba.entity.UserInfoDaoImpl;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午1:50:35 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public interface NewsDao<T> {
    boolean validateUser(UserInfoDaoImpl user);
    List<NewsInfo> getAllNewsInfo();
    int Deletenews(int id);
}
