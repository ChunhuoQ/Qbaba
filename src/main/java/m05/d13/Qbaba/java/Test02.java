package m05.d13.Qbaba.java;

import java.util.List;

import java.util.Scanner;

import m05.d13.Qbaba.dao.impl.BizDaoImpl;
import m05.d13.Qbaba.entity.Stu2;


public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BizDaoImpl bdi=new BizDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("�������꼶��ţ�");
		int gid=sc.nextInt();
		List<Stu2> list= bdi.getAllStu2(gid);
		for (Stu2 s2 : list) {
			System.out.println(s2.getSid()+"\t"+s2.getSname()+"\t"+s2.getScard());
		}
	}

}
