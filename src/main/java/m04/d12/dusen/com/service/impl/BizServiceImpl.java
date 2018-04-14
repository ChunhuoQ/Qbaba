/**
 * Project Name:pinhong1
 * File Name:BizServiceImpl.java
 * Package Name:com.service.impl
 * Date:2018年4月12日下午10:01:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.dusen.com.service.impl;

import java.util.List;

import m04.d12.dusen.com.dao.BizDao;
import m04.d12.dusen.com.entity.News;
import m04.d12.dusen.com.entity.Product;
import m04.d12.dusen.com.service.BizService;


/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午10:01:32 <br/>
 * @author   lenovopc
 * @version
 * @see
 */
public class BizServiceImpl implements  BizService {

    private BizDao bizDao;
    
    public BizDao getBizDao() {
        return bizDao;
    }

    public void setBizDao(BizDao bizDao) {
        this.bizDao = bizDao;
    }

    @Override
    public List<News> getAllNews() {
        
        //  Auto-generated method stub
        return bizDao.getAllNews();
    }

    @Override
    public List<Product> getAllProduct() {
        
        //  Auto-generated method stub
        return bizDao.getAllProduct();
    }

}

