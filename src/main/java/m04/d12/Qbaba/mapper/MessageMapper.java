package m04.d12.Qbaba.mapper;

import m04.d12.Qbaba.entity.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}