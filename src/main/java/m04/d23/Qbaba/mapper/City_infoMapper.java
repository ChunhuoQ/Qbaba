package m04.d23.Qbaba.mapper;

import java.util.List;

import m04.d23.Qbaba.entity.City_info;



public interface City_infoMapper {
    
    List<City_info> selectCityAll();
    
    List<City_info> selectCityById(int provincecode);
}