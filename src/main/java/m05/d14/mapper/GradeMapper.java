package m05.d14.mapper;

import java.util.List;

import m05.d14.opjo.Grade;

public interface GradeMapper {
    int insert(Grade record);
    List<Grade> selectAllClass();
    int insertSelective(Grade record);
}