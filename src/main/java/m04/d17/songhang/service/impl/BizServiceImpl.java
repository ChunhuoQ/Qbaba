/**
 * Project Name:Demo_dt59_serverlt_01
 * File Name:BizServiceImpl.java
 * Package Name:cn.dt59.service.impl
 * Date:2018年4月12日下午9:58:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.songhang.service.impl;

import java.util.List;

import m04.d17.songhang.dao.BizDao;
import m04.d17.songhang.entity.Message;
import m04.d17.songhang.entity.News;
import m04.d17.songhang.entity.Page;
import m04.d17.songhang.entity.Product;
import m04.d17.songhang.entity.Revert;
import m04.d17.songhang.entity.User;
import m04.d17.songhang.service.BizService;

/**
 * Description: <br/>
 * Date: 2018年4月12日 下午9:58:33 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class BizServiceImpl implements BizService {
    private BizDao bizDao;

    public BizDao getBizDao() {
        return bizDao;
    }

    public void setBizDao(BizDao bizDao) {
        this.bizDao = bizDao;
    }

    @Override
    public List<News> getNewsAll() {

        return bizDao.getNewsAll();
    }

    @Override
    public List<Product> getProductAll() {

        // Auto-generated method stub
        return bizDao.getProductAll();
    }

    @Override
    public boolean validataUser(User user) {

        // Auto-generated method stub
        return bizDao.validataUser(user);
    }

    @Override
    public String getUstatus(User user) {

        // Auto-generated method stub
        return bizDao.getUstatus(user);
    }

    @Override
    public List<Product> getNewsInfoPageById(Page page) {

        // Auto-generated method stub
        return bizDao.getNewsInfoPageById(page);
    }

    @Override
    public int getsum() {

        // Auto-generated method stub
        return bizDao.getsum();
    }

    @Override
    public List<Message> getAllMessage() {

        // Auto-generated method stub
        return bizDao.getAllMessage();
    }

    @Override
    public List<Revert> getAllRevert() {

        // Auto-generated method stub
        return bizDao.getAllRevert();
    }

    @Override
    public Message getMessageById(int id) {

        // Auto-generated method stub
        return bizDao.getMessageById(id);
    }

}
