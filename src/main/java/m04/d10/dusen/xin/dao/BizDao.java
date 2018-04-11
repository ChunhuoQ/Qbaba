/**
 * Project Name:xinwen2
 * File Name:BizDao.java
 * Package Name:com.xin.dao
 * Date:2018年4月8日上午9:59:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.dusen.xin.dao;

import java.util.List;

import m04.d10.dusen.xin.entity.CommentInfo;
import m04.d10.dusen.xin.entity.NewsInfo;
import m04.d10.dusen.xin.entity.Page;
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
    List<NewsInfo> all();//查看
    int re(int id);//删除
    int add(Object t);//修改
    List<CommentInfo> all1();//显示
    List<NewsInfo> getNewsInfoByPage(Page page);
    int jishu();//计数
    
    
}

