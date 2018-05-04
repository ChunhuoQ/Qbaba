package m04.d23.Qbaba.mapper;

import m04.d23.Qbaba.entity.ShangsPing;

public interface ShangsPingMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(ShangsPing record);

    int insertSelective(ShangsPing record);

    ShangsPing selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(ShangsPing record);

    int updateByPrimaryKey(ShangsPing record);
}