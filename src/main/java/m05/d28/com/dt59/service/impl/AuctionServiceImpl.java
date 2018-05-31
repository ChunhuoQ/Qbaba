/**
 * Project Name:Qbaba
 * File Name:AuctionServiceImpl.java
 * Package Name:m05.d28.com.dt59.service.impl
 * Date:2018年5月29日下午5:29:24
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d28.com.dt59.service.impl;




import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import m05.d28.com.dt59.mapper.AuctionMapper;
import m05.d28.com.dt59.ojpo.Auction;
import m05.d28.com.dt59.service.AuctionService;

/**
 * Description:   <br/>
 * Date:     2018年5月29日 下午5:29:24 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
@Service
public class AuctionServiceImpl implements AuctionService{
    
    @Autowired
    AuctionMapper am;
    
    @Override
    public int deleteByPrimaryKey(Integer auctionid) {
        
        //  Auto-generated method stub
        return am.deleteByPrimaryKey(auctionid);
    }

    @Override
    public int insert(Auction record) {
        
        //  Auto-generated method stub
        return am.insert(record);
    }

    @Override
    public int insertSelective(Auction record) {
        
        //  Auto-generated method stub
        return am.insertSelective(record);
    }

    @Override
    public Auction selectByPrimaryKey(Integer auctionid) {
        
        //  Auto-generated method stub
        return am.selectByPrimaryKey(auctionid);
    }

    @Override
    public int updateByPrimaryKeySelective(Auction record) {
        
        //  Auto-generated method stub
        return am.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Auction record) {
        
        //  Auto-generated method stub
        return am.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Auction record) {
        
        //  Auto-generated method stub
        return am.updateByPrimaryKey(record);
    }

    @Override
    public List<Auction> selectAuctionAll() {
        
        //  Auto-generated method stub
        return am.selectAuctionAll();
    }

    @Override
    public List<Auction> selectByDynamic(Auction au) {
        
        //  Auto-generated method stub
        return am.selectByDynamic(au);
    }

    @Override
    public Auction selectBlob(int auctionid) {
        
        //  Auto-generated method stub
        return am.selectBlob(auctionid);
    }

    @Override
    public Auction selectAuctionById(int auctionid) {
        
        //  Auto-generated method stub
        return am.selectAuctionById(auctionid);
    }
    

}

