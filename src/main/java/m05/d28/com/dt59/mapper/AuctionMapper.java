package m05.d28.com.dt59.mapper;

import java.util.List;

import m05.d28.com.dt59.ojpo.Auction;

public interface AuctionMapper {
    int deleteByPrimaryKey(Integer auctionid);

    int insert(Auction record);

    int insertSelective(Auction record);

    Auction selectByPrimaryKey(Integer auctionid);

    int updateByPrimaryKeySelective(Auction record);

    int updateByPrimaryKeyWithBLOBs(Auction record);

    int updateByPrimaryKey(Auction record);
    
    List<Auction> selectAuctionAll();
    
    List<Auction> selectByDynamic(Auction au);
    
    Auction selectBlob(int auctionid);
    
    Auction selectAuctionById(int auctionid);
}