package m04.d10.lvruiling.com.dt59.service.impl;

import java.util.List;

import m04.d10.lvruiling.com.dt59.service.BizService;
import m04.d10.lvruiling.com.dt59.dao.BaseDao;
import m04.d10.lvruiling.com.dt59.dao.BizDao;
import m04.d10.lvruiling.com.dt59.entity.CommentInfo;
import m04.d10.lvruiling.com.dt59.entity.NewsInfo;
import m04.d10.lvruiling.com.dt59.entity.Page;
import m04.d10.lvruiling.com.dt59.entity.UserInfo;

public class BizServiceImpl implements BizService {

    private BizDao bizDao;

    @Override
    public List<NewsInfo> getNewsInfoBypage(Page page) {

        // Auto-generated method stub
        return bizDao.getNewsInfoBypage(page);
    }

    public BizDao getBizDao() {
        return bizDao;
    }

    public void setBizDao(BizDao bizDao) {
        this.bizDao = bizDao;
    }

    public boolean validateUser(UserInfo user) {
        // TODO Auto-generated method stub
        return bizDao.validateUser(user);
    }

    public List<NewsInfo> getNews() {
        // TODO Auto-generated method stub
        return bizDao.getNews();
    }

    public int delNewsInfoById(int id) {
        // TODO Auto-generated method stub
        return bizDao.delNewsInfoById(id);
    }

    public int updateNewsInfo(NewsInfo info) {
        // TODO Auto-generated method stub
        return bizDao.updateNewsInfo(info);
    }

    public List<CommentInfo> getAllCommentInfo() {
        // TODO Auto-generated method stub
        return bizDao.getAllCommentInfo();
    }

}
