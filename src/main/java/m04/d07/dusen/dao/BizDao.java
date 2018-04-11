/**
 * Project Name:xinwen2
 * File Name:BizDao.java
 * Package Name:com.xin.dao
 * Date:2018年4月8日上午9:59:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.xin.dao;

import java.util.List;

import com.xin.entity.CommentInfo;
import com.xin.entity.NewsInfo;
import com.xin.entity.UserInfo;

/**
 * Description:   <br/>
 * Date:     2018年4月8日 上午9:59:28 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public interface BizDao {
    boolean denglu(UserInfo user);
    List<NewsInfo> all();
    int re(int id);
    int add(Object t);
    List<CommentInfo> all1();
}

