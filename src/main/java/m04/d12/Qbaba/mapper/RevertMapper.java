package m04.d12.Qbaba.mapper;

import m04.d12.Qbaba.entity.Revert;

public interface RevertMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Revert record);

    int insertSelective(Revert record);

    Revert selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Revert record);

    int updateByPrimaryKey(Revert record);
}