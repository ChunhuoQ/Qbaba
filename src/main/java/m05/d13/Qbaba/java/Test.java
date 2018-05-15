package m05.d13.Qbaba.java;

import java.util.List;



import m05.d13.Qbaba.dao.impl.BizDaoImpl;
import m05.d13.Qbaba.entity.Stu;

public class Test {

	/**
	 * ���ԣ�����oracle  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BizDaoImpl bdi=new BizDaoImpl();
		List<Stu> list=bdi.getStu();
		for (Stu stu : list) {
			System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSdate());
		}
	}

}
