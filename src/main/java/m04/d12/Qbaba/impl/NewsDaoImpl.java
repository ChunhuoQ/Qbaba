/**
 * Project Name:Qbaba
 * File Name:NewsDaoImpl.java
 * Package Name:m04.d12.Qbaba.mapper
 * Date:2018年4月13日上午1:13:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.Qbaba.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




import java.util.Map;

import org.junit.Test;





import m04.d12.Qbaba.entity.News;
import m04.d12.Qbaba.mapper.NewsMapper;

/**
 * Description:   <br/>
 * Date:     2018年4月13日 上午1:13:19 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class NewsDaoImpl extends MyBatisOpen implements NewsMapper {
    
    News news=new News();
    
    @Override
    public List<News> selectNewsAll() {
        List<News> list=session.selectList("m04.d12.Qbaba.impl.NewsDaoImpl.selectNewsAll");
        return list;
    }
    
    @Test
    public List<News> getNowView(int nowPage){
        int all=getNewsByAllNum();
        
        int last = all%3==0?all/3:all/3+1;
        news.setAllNum(all);
        news.setAllPage(last);
        news.setNowPage(nowPage);
       List<News> list= getNewsByLimit();
       System.out.println("所有页数："+all); 
       System.out.println("尾页:"+last);
       System.out.println("当前页："+news.getNowPage());
       System.out.println("lsit:"+list);
       return list;
    }

    public List<News> getNewsByLimit() {
        
         
         
         List<News> list=session.selectList("m04.d12.Qbaba.impl.NewsDaoImpl.getNewsByLimit",news);
        //  Auto-generated method stub
        return list;
    }

    @Override  
    public int getNewsByAllNum() {
        
    int all =  session.selectOne("m04.d12.Qbaba.impl.NewsDaoImpl.getNewsByAllNum");
     
        return all;
    }
}

