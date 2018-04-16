/**
 * Project Name:PinHong
 * File Name:BizDao.java
 * Package Name:com.liupeng.dao
 * Date:2018年4月12日下午10:07:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.liupeng.dao;

import java.util.List;

import m04.d16.liupeng.entity.Message;
import m04.d16.liupeng.entity.News;
import m04.d16.liupeng.entity.Page;
import m04.d16.liupeng.entity.Product;
import m04.d16.liupeng.entity.Revert;
import m04.d16.liupeng.entity.User;

/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午10:07:50 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public interface BizDao {

    List<News> getAllNews();

    List<Product> getAllProduct();

    List<User> getAllUser();

    boolean validateUser(User user);

    List<Product> getProductByPage(Page page);

    int getProductSize();

    List<Message> getAllMessage();

    List<Revert> getAllRevert(int id);

    List<Message> getAllMessageById(int id);
}

