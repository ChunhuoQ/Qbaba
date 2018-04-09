/**
 * Project Name:NewsSystem1.1
 * File Name:BizServiceImpl.java
 * Package Name:com.liupeng.service.impl
 * Date:2018年4月5日下午9:00:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d04.liupeng.service.impl;

import java.util.List;

import m04.d04.liupeng.dao.Bizdao;
import m04.d04.liupeng.entity.NewsInfo;
import m04.d04.liupeng.entity.UserInfo;
import m04.d04.liupeng.service.BizService;

/**
 * Description:   <br/>
 * Date:     2018年4月5日 下午9:00:11 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class BizServiceImpl implements BizService {

    private Bizdao bizDao;

    public Bizdao getBizdao() {
        return bizDao;
    }

    public void setBizdao(Bizdao bizDao) {
        this.bizDao = bizDao;
    }

    @Override
    public boolean validateUser(UserInfo user) {

        // Auto-generated method stub
        return bizDao.validateUser(user);
    }

    @Override
    public List<NewsInfo> getNews() {

        // Auto-generated method stub
        return bizDao.getNews();
    }

}

