/**
 * Project Name:Demo_dt59_news_01
 * File Name:BizDao.java
 * Package Name:cn.dt59.dao
 * Date:2018年4月8日下午4:14:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.songhang.dao;

import java.util.List;

import m04.d10.songhang.entity.NewsInfo;
import m04.d10.songhang.entity.Page;
import m04.d10.songhang.entity.UserInfo;

/**
 * Description: <br/>
 * Date: 2018年4月8日 下午4:14:28 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public interface BizDao {
    boolean validateUser(UserInfo user);

    List<NewsInfo> all();

    List<NewsInfo> getNewsInfoPageById(Page page);

    int updateNewsInfo(NewsInfo info);

    int getsum();
}
