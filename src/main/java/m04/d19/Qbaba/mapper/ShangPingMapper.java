package m04.d19.Qbaba.mapper;

import m04.d19.Qbaba.entity.ShangPing;

public interface ShangPingMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(ShangPing record);

    int insertSelective(ShangPing record);

    ShangPing selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(ShangPing record);

    int updateByPrimaryKey(ShangPing record);
}