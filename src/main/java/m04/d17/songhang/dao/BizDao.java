/**
 * Project Name:Qbaba
 * File Name:BizDao.java
 * Package Name:m04.d12.songhang.dao
 * Date:2018年4月12日下午7:28:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.songhang.dao;

import java.util.List;

import m04.d17.songhang.entity.Message;
import m04.d17.songhang.entity.News;
import m04.d17.songhang.entity.Page;
import m04.d17.songhang.entity.Product;
import m04.d17.songhang.entity.Revert;
import m04.d17.songhang.entity.User;

/**
 * Description: <br/>
 * Date: 2018年4月12日 下午7:28:15 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public interface BizDao {
    List<News> getNewsAll();

    List<Product> getProductAll();

    boolean validataUser(User user);

    String getUstatus(User user);

    List<Product> getNewsInfoPageById(Page page);

    int getsum();

    List<Message> getAllMessage();

    Message getMessageById(int id);

    List<Revert> getAllRevert();
}
