/**
 * Project Name:xinwen2
 * File Name:BizServicerImpl.java
 * Package Name:com.xin.service.impl
 * Date:2018年4月8日上午10:19:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.dusen.xin.service.impl;

import java.util.List;

import m04.d10.dusen.xin.dao.BizDao;
import m04.d10.dusen.xin.entity.CommentInfo;
import m04.d10.dusen.xin.entity.NewsInfo;
import m04.d10.dusen.xin.entity.Page;
import m04.d10.dusen.xin.entity.UserInfo;
import m04.d10.dusen.xin.service.BizService;



/**
 * Description:   <br/>
 * Date:     2018年4月8日 上午10:19:34 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class BizServicerImpl implements BizService{
    private BizDao bizdao;
    
    public BizDao getBizdao() {
        return bizdao;
    }

    public void setBizdao(BizDao bizdao) {
        this.bizdao = bizdao;
    }

    @Override
    public boolean denglu(UserInfo user) {
        
        //  Auto-generated method stub
        return bizdao.denglu(user);
    }

    @Override
    public List<NewsInfo> all() {
        
        //  Auto-generated method stub
        return bizdao.all();
    }

    @Override
    public int re(int id) {
        
        //  Auto-generated method stub
        return bizdao.re(id);
    }

    @Override
    public int add(Object t) {
        
        //  Auto-generated method stub
        return bizdao.add(t);
    }

    @Override
    public List<CommentInfo> all1() {
        
        //  Auto-generated method stub
        return bizdao.all1();
    }

    @Override
    public List<NewsInfo> getNewsInfoByPage(Page page) {
        
        //  Auto-generated method stub
        return bizdao.getNewsInfoByPage(page);
    }

    @Override
    public int jishu() {
        
        //  Auto-generated method stub
       return bizdao.jishu();
    }
    

}

