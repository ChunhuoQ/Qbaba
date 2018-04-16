/**
 * Project Name:PinHong
 * File Name:BizServiceImpl.java
 * Package Name:com.liupeng.service.impl
 * Date:2018年4月12日下午10:38:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.liupeng.service.impl;

import java.util.List;

import m04.d16.liupeng.dao.BizDao;
import m04.d16.liupeng.entity.Message;
import m04.d16.liupeng.entity.News;
import m04.d16.liupeng.entity.Page;
import m04.d16.liupeng.entity.Product;
import m04.d16.liupeng.entity.Revert;
import m04.d16.liupeng.entity.User;
import m04.d16.liupeng.service.BizService;

/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午10:38:22 <br/>
 * @author   LiuPeng
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
    public List<News> getAllNews() {

        // Auto-generated method stub
        return bizDao.getAllNews();
    }

    @Override
    public List<Product> getAllProduct() {

        // Auto-generated method stub
        return bizDao.getAllProduct();
    }

    @Override
    public List<User> getAllUser() {

        // Auto-generated method stub
        return bizDao.getAllUser();
    }

    @Override
    public boolean validateUser(User user) {

        // Auto-generated method stub
        return bizDao.validateUser(user);
    }

    @Override
    public List<Product> getProductByPage(Page page) {

        // Auto-generated method stub
        return bizDao.getProductByPage(page);
    }

    @Override
    public int getProductSize() {

        // Auto-generated method stub
        return bizDao.getProductSize();
    }

    @Override
    public List<Message> getAllMessage() {

        // Auto-generated method stub
        return bizDao.getAllMessage();
    }

    @Override
    public List<Revert> getAllRevert(int id) {

        // Auto-generated method stub
        return bizDao.getAllRevert(id);
    }

    @Override
    public List<Message> getAllMessageById(int id) {

        // Auto-generated method stub
        return bizDao.getAllMessageById(id);
    }

}

