/**
 * Project Name:Demo_dt59_news_01
 * File Name:BizServiceImpl.java
 * Package Name:cn.dt59.service.impl
 * Date:2018年4月8日下午5:04:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.songhang.service.impl;

import java.util.List;

import m04.d10.songhang.dao.BizDao;
import m04.d10.songhang.entity.NewsInfo;
import m04.d10.songhang.entity.Page;
import m04.d10.songhang.entity.UserInfo;
import m04.d10.songhang.service.BizService;

/**
 * Description: <br/>
 * Date: 2018年4月8日 下午5:04:36 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class BizServiceImpl implements BizService {
    private BizDao bizdao;

    public BizDao getBizdao() {
        return bizdao;
    }

    public void setBizdao(BizDao bizdao) {
        this.bizdao = bizdao;
    }

    @Override
    public boolean validateUser(UserInfo user) {

        return bizdao.validateUser(user);
    }

    @Override
    public List<NewsInfo> all() {

        // Auto-generated method stub
        return bizdao.all();
    }

    @Override
    public List<NewsInfo> getNewsInfoPageById(Page page) {

        // Auto-generated method stub
        return bizdao.getNewsInfoPageById(page);
    }

    @Override
    public int updateNewsInfo(NewsInfo info) {

        // Auto-generated method stub
        return bizdao.updateNewsInfo(info);
    }

    @Override
    public int getsum() {

        // Auto-generated method stub
        return bizdao.getsum();
    }

}
