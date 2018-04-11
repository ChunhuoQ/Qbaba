/**
 * Project Name:NewsSystem1.1
 * File Name:BizServiceImpl.java
 * Package Name:com.liupeng.service.impl
 * Date:2018年4月5日下午9:00:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.liupeng.service.impl;

import java.util.List;

import m04.d10.liupeng.dao.Bizdao;
import m04.d10.liupeng.entity.CommentInfo;
import m04.d10.liupeng.entity.NewsInfo;
import m04.d10.liupeng.entity.Page;
import m04.d10.liupeng.entity.UserInfo;
import m04.d10.liupeng.service.BizService;

/**
 * Description:   <br/>
 * Date:     2018年4月5日 下午9:00:11 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class BizServiceImpl implements BizService {

    private Bizdao bizDao;

    public Bizdao getBizdao() {
        return bizDao;
    }

    public void setBizdao(Bizdao bizDao) {
        this.bizDao = bizDao;
    }

    @Override
    public boolean validateUser(UserInfo user) {

        // Auto-generated method stub
        return bizDao.validateUser(user);
    }

    @Override
    public List<NewsInfo> getNews() {

        // Auto-generated method stub
        return bizDao.getNews();
    }

    @Override
    public int delNewsInfoById(int id) {

        // Auto-generated method stub
        return bizDao.delNewsInfoById(id);
    }

    @Override
    public int upDataNewsInfoById(int type_id, String title, String author, String summary, String content, int id) {

        // Auto-generated method stub
        return bizDao.upDataNewsInfoById(type_id, title, author, summary, content, id);
    }

    @Override
    public List<CommentInfo> getCommentInfo() {

        // Auto-generated method stub
        return bizDao.getCommentInfo();
    }

    @Override
    public List<NewsInfo> getNewsInfoByPage(Page page) {

        // Auto-generated method stub
        return bizDao.getNewsInfoByPage(page);
    }

    @Override
    public int getNewsInfoSize() {

        return bizDao.getNewsInfoSize();


    }

}

