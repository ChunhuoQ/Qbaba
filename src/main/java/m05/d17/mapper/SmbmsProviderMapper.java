package m05.d17.mapper;

import java.util.List;

import m05.d17.opjo.SmbmsProvider;

public interface SmbmsProviderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsProvider record);

    int insertSelective(SmbmsProvider record);

    SmbmsProvider selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmbmsProvider record);

    int updateByPrimaryKey(SmbmsProvider record);
    
    List<String> selectByPrimaryProName();
}