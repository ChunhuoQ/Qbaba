/**
 * Project Name:Qbaba
 * File Name:test.java
 * Package Name:m05.d14.test
 * Date:2018年5月14日上午11:15:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d14.test;

import java.util.List;
import java.util.Scanner;

import m05.d14.impl.StuImpl;
import m05.d14.opjo.Stu;

/**
 * Description:   <br/>
 * Date:     2018年5月14日 上午11:15:14 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class test {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        
        StuImpl sl=new StuImpl();
        
        Stu stu3=new Stu();
        System.out.println("请输入需要插入的id");
        stu3.setSid(scanner.nextShort());
        System.out.println("请输入名字");
        stu3.setSname(scanner.next());
        System.out.println("请输入年龄");
        stu3.setSage(scanner.nextShort());
        System.out.println("请输入身份号");
        stu3.setScard(scanner.next());
        System.out.println("请输入班级的Id");
        stu3.setSgid(scanner.nextShort());
        int flag=sl.insertStu(stu3);
        if(flag==1){
            System.out.println("添加成功！\n添加结果如下：");
            
        }else{
            System.out.println("添加失败！");
        }
        
        List<Stu> lists=sl.selectAllStu();
        List<Stu> listsg=sl.selectDouble();
        System.out.println("请输入模糊查询的字眼");
        List<Stu> listsl=sl.selectStuByLike(scanner.next());
        System.out.println(lists);
        System.out.println("----STU表-----");
        for(int j=0;j<lists.size();j++){
            Stu stu4 = lists.get(j);
            System.out.println('\t'+stu4.getSname()+'\t'+stu4.getSage()+"\t"+stu4.getScard()+"\t"+stu4.getSgid());
        }
        System.out.println("----STU和Grade表联合查询-----");
        for(int i=0;i<listsg.size();i++){
            
         Stu stu1 = listsg.get(i);
        System.out.println(stu1.getSid()+"\t"+stu1.getSname()+"\t"+stu1.getSage()+"\t"+stu1.getGclass());
        
        }     
        System.out.println("----STU和Grade表联合传参模糊查询-----");
        for(int o=0;o<listsl.size();o++){
            Stu stu2 = listsl.get(o);
            System.out.println(stu2.getSid()+"\t"+stu2.getSname()+"\t"+stu2.getSage()+"\t"+stu2.getGclass());
            
        }
        //  Auto-generated method stub
            scanner.close();
    }

}

