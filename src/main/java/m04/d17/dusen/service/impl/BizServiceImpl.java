/**
 * Project Name:pinhong1
 * File Name:BizServiceImpl.java
 * Package Name:com.service.impl
 * Date:2018年4月12日下午10:01:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.dusen.service.impl;

import java.util.List;

import javax.swing.text.Position.Bias;

import m04.d17.dusen.dao.BizDao;
import m04.d17.dusen.entity.Message;
import m04.d17.dusen.entity.News;
import m04.d17.dusen.entity.Page;
import m04.d17.dusen.entity.Product;
import m04.d17.dusen.entity.Revert;
import m04.d17.dusen.entity.Use;
import m04.d17.dusen.service.BizService;


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

    @Override
    public boolean getUser(Use use) {
        
        //  Auto-generated method stub
        return bizDao.getUser(use);
    }

    @Override
    public List<Use> getAllUse() {
        
        //  Auto-generated method stub
        return bizDao.getAllUse();
    }

    @Override
    public String getQuanXian(Use use) {
        
        //  Auto-generated method stub
        return bizDao.getQuanXian(use);
    }

    @Override
    public List<Product> fen(Page page) {
        
        //  Auto-generated method stub
        return bizDao.fen(page);
    }

    @Override
    public int count() {
        
        //  Auto-generated method stub
        return bizDao.count();
    }

    @Override
    public List<Message> getAllMessage() {
        
        //  Auto-generated method stub
        return bizDao.getAllMessage();
    }

    @Override
    public int addRevert(Revert rev) {
        
        //  Auto-generated method stub
        return bizDao.addRevert(rev);
    }

    @Override
    public List<Message> getAllMessage(int mid) {
        
        //  Auto-generated method stub
        return bizDao.getAllMessage(mid);
    }

    @Override
    public List<Revert> getAllRevert(int mid) {
        
        //  Auto-generated method stub
        return bizDao.getAllRevert(mid);
    }

}

