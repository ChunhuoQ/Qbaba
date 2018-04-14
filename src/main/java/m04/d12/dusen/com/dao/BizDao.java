/**
 * Project Name:pinhong1
 * File Name:BizDao.java
 * Package Name:com.dao
 * Date:2018年4月12日下午9:49:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.dusen.com.dao;

import java.util.List;

import m04.d12.dusen.com.entity.News;
import m04.d12.dusen.com.entity.Product;




/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午9:49:54 <br/>
 * @author   lenovopc
 * @version
 * @see
 */
public interface BizDao {
    List<News> getAllNews();
    List<Product> getAllProduct();
}

