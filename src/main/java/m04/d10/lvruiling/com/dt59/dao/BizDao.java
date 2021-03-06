package m04.d10.lvruiling.com.dt59.dao;

import java.util.List;

import m04.d10.lvruiling.com.dt59.entity.CommentInfo;
import m04.d10.lvruiling.com.dt59.entity.NewsInfo;
import m04.d10.lvruiling.com.dt59.entity.Page;
import m04.d10.lvruiling.com.dt59.entity.UserInfo;






public interface BizDao {
    boolean validateUser(UserInfo user);

    List<NewsInfo> getNews();

    int delNewsInfoById(int id);

    int updateNewsInfo(NewsInfo info);

    List<CommentInfo> getAllCommentInfo();

    List<NewsInfo> getNewsInfoBypage(Page page);
}
