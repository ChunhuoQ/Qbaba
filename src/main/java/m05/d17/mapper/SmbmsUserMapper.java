package m05.d17.mapper;


import java.util.List;

import m05.d17.opjo.SmbmsUser;

public interface SmbmsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsUser record);

    int insertSelective(SmbmsUser record);

    SmbmsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmbmsUser record);

    int updateByPrimaryKey(SmbmsUser record);
    
    List<SmbmsUser> selectByPrimaryNmae(SmbmsUser smbmsUser);
}