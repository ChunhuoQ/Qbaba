package m05.d13.Qbaba.dao;

import java.util.List;


import m05.d13.Qbaba.entity.Stu;
import m05.d13.Qbaba.entity.Stu2;

public interface BizDao {
	List<Stu> getStu();
	
	List<Stu2> getAllStu2(int gid);
}
