/**
 * Project Name:NewsSystem1.1
 * File Name:Bizdao.java
 * Package Name:com.liupeng.dao
 * Date:2018年4月5日下午8:45:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d04.liupeng.dao;

import java.util.List;

import m04.d04.liupeng.entity.NewsInfo;
import m04.d04.liupeng.entity.UserInfo;

/**
 * Description:   <br/>
 * Date:     2018年4月5日 下午8:45:17 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public interface Bizdao {
    boolean validateUser(UserInfo user);

    List<NewsInfo> getNews();
}

