/**
 * Project Name:Qbaba

 * File Name:CityImpl.java
 * Package Name:m04.d23.Qbaba.impl
 * Date:2018年4月23日下午4:13:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d23.Qbaba.impl;

import java.util.List;

import org.junit.Test;

import m04.d23.Qbaba.entity.City_info;
import m04.d23.Qbaba.mapper.City_infoMapper;


/**
 * Description:   <br/>
 * Date:     2018年4月23日 下午4:13:54 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class CityImpl extends MyBatisOpen implements City_infoMapper {



    @Override
    public List<City_info> selectCityAll() {
        List<City_info> list= session.selectList("m04.d23.Qbaba.impl.CityImpl.selectCityAll");
     
        return list;
    }

    @Override
    public List<City_info> selectCityById(int provincecode) {
        
        List<City_info> list= session.selectList("m04.d23.Qbaba.impl.CityImpl.selectCityById",provincecode);
        
        return list;
    }
    @Test
    public void Test(){
        System.out.println(selectCityById(1));
    }
   
}

