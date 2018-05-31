package m05.d17.mapper;

import java.util.List;

import m05.d17.opjo.SmbmsBill;

public interface SmbmsBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsBill record);

    int insertSelective(SmbmsBill record);

    SmbmsBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmbmsBill record);

    int updateByPrimaryKey(SmbmsBill record);
    
    List<SmbmsBill> selectByPrimaryAll();
}