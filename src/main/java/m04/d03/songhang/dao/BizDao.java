/**
 * Project Name:Qbaba
 * File Name:BizDao.java
 * Package Name:m04.d03.dao
 * Date:2018年4月3日下午5:05:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.songhang.dao;

import java.util.List;

import m04.d03.songhang.entity.CommentInfo;
import m04.d03.songhang.entity.NewsInfo;
import m04.d03.songhang.entity.UesrInfo;

/**
 * Description: <br/>
 * Date: 2018年4月3日 下午5:05:31 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public interface BizDao {
    boolean vaildataUser(UesrInfo user);

    List<NewsInfo> all();

    List<CommentInfo> showInfo();

    int delNewsInfoById(int id);

    int add(Object obj);
}
