/**
 * Project Name:Qbaba
 * File Name:Junit.java
 * Package Name:m03.d28.Qbaba.junit4
 * Date:2018年3月28日下午1:59:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.Qbaba.junit4;

import java.util.List;
import java.util.Scanner;

import m03.d28.Qbaba.Dao.QuestionDao;
import m03.d28.Qbaba.Dao.impl.QuestionDaoImpl;
import m03.d28.Qbaba.entity.QuestionInfoDaoImpl;
import m03.d29.Qbaba.Dao.impl.QuestionDaoImpl1;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午1:59:51 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class Junit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuestionDao qd = new QuestionDaoImpl();
        boolean a=true;
        while(a){
        System.out.println("请选择操作(1.列出所有试题 2.按科目查询 3.按题干模糊查询4.添加试题5.删除试题6.退出)");
        int out1 = scanner.nextInt();
        if (out1 == 1) {
            QuestionDaoImpl1 qdl=  new QuestionDaoImpl1();
            qdl.callprocedure();
        } else if (out1 == 2) {
            System.out.println("请输入科目(1.java 2.c# 3.JSP)");
            int out2 = scanner.nextInt();
           
                List<QuestionInfoDaoImpl> list1 = qd.getAllQuestionInfoDaoImpl("SELECT * FROM question_info WHERE SUBJECT="+out2);
                for (QuestionInfoDaoImpl fo : list1) {
                    System.out
                            .println(fo.getQuestionId() + "." + fo.getQuestion() + "\n" + fo.getOptionA() + "\n"
                                    + fo.getOptionB() + "\n" + fo.getOptionC() + "\n" + fo.getOptionD() + "\n"
                                    + fo.getAnswer());
                }
            
    }else if(out1==3){
        System.out.println("请输入题干：");
        String out3 = scanner.next();
        QuestionDaoImpl1 qdl=  new QuestionDaoImpl1();
        qdl.callprocedure2(out3);
    }else if(out1==4){
        QuestionInfoDaoImpl qd1=  new QuestionInfoDaoImpl();
        System.out.println("请输入新的科目(1.java 2.c# 3.JSP)：");
        qd1.setSubject(scanner.nextInt());
        System.out.println("请输入新的题干：");
        qd1.setQuestion(scanner.next());
        System.out.println("请输入新的选项A：");
        qd1.setOptionA(scanner.next());
        System.out.println("请输入新的选项B：");
        qd1.setOptionB(scanner.next());
        System.out.println("请输入新的选项C：");
        qd1.setOptionC(scanner.next());
        System.out.println("请输入新的选项D：");
        qd1.setOptionD(scanner.next());
        System.out.println("请输入新的答案：");
        qd1.setAnswer(scanner.next());
        int flag= qd.saveQuestionInfoDaoImpl(qd1);
        if(flag==1){
        System.out.println("添加成功");
    } else{
        System.out.println("添加失败！");
    }   
        }else if(out1==5){
            boolean b=true;
            while(b){   
            System.out.println("请输入您想删除的题目编号：");
            int flag= qd.deleteQuestionInfoDaoImpl(scanner.nextInt());
            if(flag==1){
                System.out.println("删除成功");
                System.out.println("结果为：");
                List<QuestionInfoDaoImpl> list1 = qd.getAllQuestionInfoDaoImpl("SELECT * FROM question_info");
                for (QuestionInfoDaoImpl fo : list1) {
                    System.out
                            .println(fo.getQuestionId() + "." + fo.getQuestion() + "\n" + fo.getOptionA() + "\n"
                                    + fo.getOptionB() + "\n" + fo.getOptionC() + "\n" + fo.getOptionD() + "\n"
                                    + fo.getAnswer());
                }
              b=false;
            } else{
                System.out.println("对不起，没有需要删除的编号！");
            } 
            }
            }else if(out1==6){
                System.out.println("退出成功");
                break;
            }
        }
        scanner.close();
    }
}
