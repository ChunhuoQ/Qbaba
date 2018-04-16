/**
 * Project Name:pinhong1
 * File Name:BizDao.java
 * Package Name:com.dao
 * Date:2018年4月12日下午9:49:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.dusen.dao;

import java.util.List;

import m04.d17.dusen.entity.Message;
import m04.d17.dusen.entity.News;
import m04.d17.dusen.entity.Page;
import m04.d17.dusen.entity.Product;
import m04.d17.dusen.entity.Revert;
import m04.d17.dusen.entity.Use;


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
   
   List<Message> getAllMessage();//留言
   
   int addRevert(Revert rev);
   
   List<Message> getAllMessage(int mid);//留言定位
   
   List<Revert> getAllRevert( int mid);//回复
}

