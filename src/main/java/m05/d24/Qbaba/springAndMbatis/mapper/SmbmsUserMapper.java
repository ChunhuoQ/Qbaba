package m05.d24.Qbaba.springAndMbatis.mapper;

import m05.d24.Qbaba.springAndMbatis.opjo.SmbmsUser;

public interface SmbmsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsUser record);

    int insertSelective(SmbmsUser record);

    SmbmsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmbmsUser record);

    int updateByPrimaryKey(SmbmsUser record);
}