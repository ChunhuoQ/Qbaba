/**
 * Project Name:Qbaba
 * File Name:Province.java
 * Package Name:m04.d23.Qbaba.impl
 * Date:2018年4月23日下午5:35:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d23.Qbaba.impl;

import java.util.List;

import m04.d23.Qbaba.entity.Province_info;
import m04.d23.Qbaba.mapper.Province_infoMapper;

import org.junit.Test;



/**
 * Description:   <br/>
 * Date:     2018年4月23日 下午5:35:01 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class ProvinceImpl extends MyBatisOpen implements Province_infoMapper{

    @Override
    public List<Province_info> selectProvinAll(){
        
        List<Province_info> list=session.selectList("m04.d23.Qbaba.impl.ProvinceImpl.selectProvinAll");
        return list;
    }

    
       


        @Override
        public int selectProvinByName(String namecn) {
            
            int province= session.selectOne("m04.d23.Qbaba.impl.ProvinceImpl.selectProvinByName",namecn);
            return province;
        }
 
}

