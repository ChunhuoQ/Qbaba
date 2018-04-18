/**
 * Project Name:pinhong1
 * File Name:BizDao.java
 * Package Name:com.dao
 * Date:2018年4月12日下午9:49:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.dusen.dao;

import java.util.List;

import m04.d16.dusen.entity.News;
import m04.d16.dusen.entity.Page;
import m04.d16.dusen.entity.Product;
import m04.d16.dusen.entity.Use;


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
    boolean getUser(Use use);
    List<Use> getAllUse();
    
   String getQuanXian(Use use);
   
   List<Product> fen(Page page);
   
   int count();//总条数
   
}

