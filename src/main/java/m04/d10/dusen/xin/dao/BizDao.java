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
import com.xin.entity.Page;
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
    List<NewsInfo> all();//查看
    int re(int id);//删除
    int add(Object t);//修改
    List<CommentInfo> all1();//显示
    List<NewsInfo> getNewsInfoByPage(Page page);
    int jishu();//计数
    
    
}

