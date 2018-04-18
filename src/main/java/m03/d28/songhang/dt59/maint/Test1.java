/**
 * Project Name:Demo_pro_jdbc_fc_01
 * File Name:Test.java
 * Package Name:cn.dt59.maint
 * Date:2018年3月28日下午6:37:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.songhang.dt59.maint;

import java.util.List;
import java.util.Scanner;

import m03.d28.songhang.dt59.dao.QuestionInfoDao;
import m03.d28.songhang.dt59.dao.impl.QuestionInfoDaoImpl;
import m03.d28.songhang.dt59.entity.QuestionInfo;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午6:37:12 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("=============欢迎使用试题管理系统==============");
        Scanner sc = new Scanner(System.in);
        QuestionInfoDao<Object> qa = new QuestionInfoDaoImpl();
        boolean a = true;
        while (a) {
            System.out.println("请选择操作(1.列出所有试题 2.按科目查询 3.按题干模糊查询4.添加试题5.删除试题6.退出)");
            int input = sc.nextInt();
            if (input == 1) {
                List<QuestionInfo> list = qa.getAllQuestion("SELECT * FROM question_info");
                for (QuestionInfo qu : list) {
                    System.out.println(qu.getQuestionId() + "." + qu.getQuestion() + "\n" + qu.getQuestionA() + "\n"
                            + qu.getQuestionB() + "\n" + qu.getQuestionC() + "\n" + qu.getQuestionD() + "\n"
                            + qu.getAnswer());
                }
            } else if (input == 2) {
                System.out.println("请输入科目(1.java 2.c# 3.JSP)");
                int out2 = sc.nextInt();
                List<QuestionInfo> list1 = qa.getAllQuestion("SELECT * FROM question_info WHERE SUBJECT=" + out2);
                for (QuestionInfo qu : list1) {
                    System.out.println(qu.getQuestionId() + "." + qu.getQuestion() + "\n" + qu.getQuestionA() + "\n"
                            + qu.getQuestionB() + "\n" + qu.getQuestionC() + "\n" + qu.getQuestionD() + "\n"
                            + qu.getAnswer());
                }
            } else if (input == 3) {
                System.out.println("请输入题干：");
                String out3 = sc.next();
                String sql = "SELECT * FROM question_info  WHERE question LIKE '%" + out3 + "%'";
                List<QuestionInfo> list1 = qa.getAllQuestion(sql);
                for (QuestionInfo qu : list1) {
                    System.out.println(qu.getQuestionId() + "." + qu.getQuestion() + "\n" + qu.getQuestionA() + "\n"
                            + qu.getQuestionB() + "\n" + qu.getQuestionC() + "\n" + qu.getQuestionD() + "\n"
                            + qu.getAnswer());
                }
            } else if (input == 4) {
                QuestionInfo qd1 = new QuestionInfo();
                System.out.println("请输入新的科目(1.java 2.c# 3.JSP)：");
                qd1.setSubject(sc.nextInt());
                System.out.println("请输入新的题干：");
                qd1.setQuestion(sc.next());
                System.out.println("请输入新的选项A：");
                qd1.setQuestionA(sc.next());
                System.out.println("请输入新的选项B：");
                qd1.setQuestionB(sc.next());
                System.out.println("请输入新的选项C：");
                qd1.setQuestionC(sc.next());
                System.out.println("请输入新的选项D：");
                qd1.setQuestionD(sc.next());
                System.out.println("请输入新的答案：");
                qd1.setAnswer(sc.next());
                int flag = qa.addQuestion(qd1);
                if (flag == 1) {
                    System.out.println("添加成功");
                } else {
                    System.out.println("添加失败！");
                }
            } else if (input == 5) {
                boolean b = true;
                while (b) {
                    System.out.println("请输入您想删除的题目编号：");
                    int flag = qa.deleteQuestion(sc.nextInt());
                    if (flag == 1) {
                        System.out.println("删除成功");
                        System.out.println("结果为：");
                        List<QuestionInfo> list1 = qa.getAllQuestion("SELECT * FROM question_info");
                        for (QuestionInfo fo : list1) {
                            System.out.println(fo.getQuestionId() + "." + fo.getQuestion() + "\n" + fo.getQuestionA()
                                    + "\n" + fo.getQuestionB() + "\n" + fo.getQuestionC() + "\n" + fo.getQuestionD()
                                    + "\n" + fo.getAnswer());
                        }
                        b = false;
                    } else {
                        System.out.println("对不起，没有需要删除的编号！");
                    }

                }

            } else if (input == 6) {
                System.out.println("退出成功");
                break;
            }

        }
        sc.close();
    }
}
