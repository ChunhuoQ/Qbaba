package m05.d13.Qbaba.dao.impl;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import m05.d13.Qbaba.dao.BaseDao;
import m05.d13.Qbaba.dao.BizDao;
import m05.d13.Qbaba.entity.Stu;
import m05.d13.Qbaba.entity.Stu2;

public class BizDaoImpl extends BaseDao implements BizDao{

	public List<Stu> getStu() {
		// TODO Auto-generated method stub
		List<Stu> list=new ArrayList<Stu>();
		try {
			String sql="select * from student";
			pst=getCon().prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				Stu stu=new Stu();
				stu.setSid(rs.getInt(1));
				stu.setSname(rs.getString(2));
				stu.setSdate(rs.getDate(3));
				list.add(stu);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public List<Stu2> getAllStu2(int gid) {
		List<Stu2> list2=new ArrayList<Stu2>();
		try {
			String sql="{call ups_stu_04(?,?)}";
			cst=getCon().prepareCall(sql);
			cst.setInt(1, gid);
			//��λ�ȡoracle�洢��̷��ص��α�
			cst.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
			//��ִ���ٻ�ȡ���
			cst.execute();
			//�����α���Object���󣬲����ü��ϣ������ǿת��������Resultset����ת��
			//list2= (List<Stu2>)cst.getObject(2);//����һ��Object����
			//Object obj= cst.getObject(2);
			//System.out.println(obj);
			rs= (ResultSet)cst.getObject(2);
			while(rs.next()){
				Stu2 s2=new Stu2();
				s2.setSid(rs.getInt(1));
				s2.setSname(rs.getString(2));
				s2.setSage(rs.getInt(3));
				s2.setScard(rs.getString(4));
				s2.setSgid(rs.getInt(5));
				list2.add(s2);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list2;
	}

}
