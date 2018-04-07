/**
 * Project Name:Qbaba
 * File Name:BizServiceImpl.java
 * Package Name:m04.d03.service.impl
 * Date:2018年4月3日下午5:40:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.service.impl;

import java.util.List;

import m04.d03.dao.BizDao;
import m04.d03.entity.NewsInfo;
import m04.d03.entity.UesrInfo;
import m04.d03.service.BizService;

/**
 * Description: <br/>
 * Date: 2018年4月3日 下午5:40:04 <br/>
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
    public boolean vaildataUser(UesrInfo user) {

        // Auto-generated method stub
        return bizdao.vaildataUser(user);
    }

    @Override
    public List<NewsInfo> all() {

        // Auto-generated method stub
        return bizdao.all();
    }

}
