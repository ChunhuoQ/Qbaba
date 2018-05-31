package m05.d17.mapper;

import m05.d17.opjo.SmbmsRole;

public interface SmbmsRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsRole record);

    int insertSelective(SmbmsRole record);

    SmbmsRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmbmsRole record);

    int updateByPrimaryKey(SmbmsRole record);
}