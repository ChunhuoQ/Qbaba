package m05.d28.com.dt59.mapper;

import m05.d28.com.dt59.ojpo.AuctionRecord;

public interface AuctionRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuctionRecord record);

    int insertSelective(AuctionRecord record);

    AuctionRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuctionRecord record);

    int updateByPrimaryKey(AuctionRecord record);
}