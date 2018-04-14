package m04.d12.Qbaba.mapper;

import java.util.List;

import m04.d12.Qbaba.entity.News;

public interface NewsMapper {
 
    List<News> selectNewsAll();
    List<News> getNewsByLimit();
    int getNewsByAllNum();
}