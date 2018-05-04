package m04.d23.Qbaba.mapper;

import m04.d23.Qbaba.entity.Shopping;

public interface ShoppingMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    Shopping selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKey(Shopping record);
}