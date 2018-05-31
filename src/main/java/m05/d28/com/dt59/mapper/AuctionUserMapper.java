package m05.d28.com.dt59.mapper;

import java.util.HashMap;
import java.util.Map;

import m05.d28.com.dt59.ojpo.AuctionUser;

public interface AuctionUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(AuctionUser record);

    int insertSelective(AuctionUser record);

    AuctionUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(AuctionUser record);

    int updateByPrimaryKey(AuctionUser record);
    
    int selectByUserAndPwd(AuctionUser user);
}