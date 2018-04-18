package m04.d10.lvruiling.com.dt59.dao;

import java.util.List;

import m04.d10.liupeng.entity.CommentInfo;
import m04.d10.lvruiling.com.dt59.entity.NewsInfo;
import m04.d10.lvruiling.com.dt59.entity.Page;

public interface BizDao {
    boolean validateUser(m04.d10.lvruiling.com.dt59.entity.UserInfo user);

    List<m04.d10.lvruiling.com.dt59.entity.NewsInfo> getNews();

    int delNewsInfoById(int id);

    int updateNewsInfo(NewsInfo info);

    List<CommentInfo> getAllCommentInfo();

    List<NewsInfo> getNewsInfoBypage(Page page);
}
