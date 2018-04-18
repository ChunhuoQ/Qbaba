/**
 * Project Name:Qbaba
 * File Name:ProductDaoImpl.java
 * Package Name:m04.d12.Qbaba.impl
 * Date:2018年4月13日下午6:33:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.Qbaba.impl;

import java.util.List;




import org.junit.Test;

import m04.d12.Qbaba.entity.ProPage;
import m04.d12.Qbaba.entity.Product;
import m04.d12.Qbaba.mapper.ProductMapper;

/**
 * Description:   <br/>
 * Date:     2018年4月13日 下午6:33:16 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class ProductDaoImpl extends MyBatisOpen implements ProductMapper {

  
    @Override
    public List<Product> selectProAll() {
        
        List<Product> list = session.selectList("m04.d12.Qbaba.impl.ProductDaoImpl.selectProAll");
        return list;
    }
 
    @Override
    public List<Product> selectProLimit(ProPage pro) {
        
        List<Product> list = session.selectList("m04.d12.Qbaba.impl.ProductDaoImpl.selectProLimit",pro);
        return list;
       
    }

    @Override
    public int getAllPage() {
       int all = session.selectOne("m04.d12.Qbaba.impl.ProductDaoImpl.getAllPage");
        return all;
    }
   
    public List<Product> getByView(int nowPage){
        ProPage page =new ProPage();
        int allPage=getAllPage();
        int lastPage=allPage%3==0?allPage/3:allPage/3+1;
        page.setLastPage(lastPage);
        page.setAllPage(allPage);
        page.setNowPage(nowPage);
        
        List<Product> listpro=selectProLimit(page);
        return listpro;
    }
    
    
    
}

