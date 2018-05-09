package m04.d23.Qbaba.mapper;

import java.util.List;

import m04.d23.Qbaba.entity.Province_info;


public interface Province_infoMapper {
    
    
    List<Province_info> selectProvinAll();
    
    int selectProvinByName(String namecn);
}