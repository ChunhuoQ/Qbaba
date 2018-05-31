package m05.d14.mapper;

import java.util.HashMap;
import java.util.List;

import m05.d14.opjo.Stu;

public interface StuMapper {
    List<Stu> selectAllStu();
    List<Stu> selectDouble();
    List<Stu> selectStuByLike(String name);
    int insertStu(Stu stu);
    List<HashMap<String,Object>> selectAllStu2();
}