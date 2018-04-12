/**
 * Project Name:xinwen2
 * File Name:BizDao.java
 * Package Name:com.xin.dao
 * Date:2018年4月8日上午9:59:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d07.dusen.dao;

import java.util.List;

import m04.d10.dusen.xin.entity.CommentInfo;
import m04.d10.dusen.xin.entity.NewsInfo;
import m04.d10.dusen.xin.entity.UserInfo;


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

