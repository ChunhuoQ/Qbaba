package m05.d17.mapper;

import m05.d17.opjo.SmbmsAddress;

public interface SmbmsAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsAddress record);

    int insertSelective(SmbmsAddress record);

    SmbmsAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmbmsAddress record);

    int updateByPrimaryKey(SmbmsAddress record);
}