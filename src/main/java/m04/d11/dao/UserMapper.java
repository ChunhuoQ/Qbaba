package m04.d11.dao;

import m04.d11.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}