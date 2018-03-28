/**
 * Project Name:jdbc_demo1
 * File Name:Test.java
 * Package Name:com.question.java
 * Date:2018年3月28日下午2:56:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.question.java;

import java.util.List;
import java.util.Scanner;

import com.question.dao.BaseDao;
import com.question.dao.QuestionInfoDao;
import com.question.dao.impl.QuestionInfoDaoImpl;
import com.question.entity.QuestionInfo;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午2:56:23 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        QuestionInfoDao bd = new QuestionInfoDaoImpl();

        boolean x = true;
        while (x) {
            System.out.println("*******************************欢迎使用试题管理系统****************************************\n\n");
            System.out.println("请选择操作(1.列出所有试题  2.按科目查询  3.按题干模糊查询  4.添加试题  5.删除试题  6.退出系统):");
            int unm = sca.nextInt();
            switch (unm) {
            case 1: {
                List<QuestionInfo> list = bd.getQuestionInfo();
                for (QuestionInfo ff : list) {
                    System.out.println(ff.getQuestionId() + "、" + ff.getQuestion() + "\n选项A:" + ff.getOptionA()
                            + "\n选项B:" + ff.getOptionB() + "\n选项C:" + ff.getOptionC() + "\n选项D:" + ff.getOptionD()
                            + "\n答案：" + ff.getAnswer());
                }
            }
                break;
            case 2: {
                System.out.println("请输入科目：(1.java 2.C# 3.JSP):");
                int num1 = sca.nextInt();
                List<QuestionInfo> list1 = bd.getAllsu(num1);
                for (QuestionInfo ff : list1) {
                    System.out.println(ff.getQuestionId() + "、" + ff.getQuestion() + "\n选项A:" + ff.getOptionA()
                            + "\n选项B:" + ff.getOptionB() + "\n选项C:" + ff.getOptionC() + "\n选项D:" + ff.getOptionD()
                            + "\n答案：" + ff.getAnswer());
                }
            }
                break;
            case 3: {
                System.out.println("请输入题干:");
                String cont = sca.next();
                List<QuestionInfo> list2 = bd.getMhu(cont);
                for (QuestionInfo ff : list2) {
                    System.out.println(ff.getQuestionId() + "、" + ff.getQuestion() + "\n选项A:" + ff.getOptionA()
                            + "\n选项B:" + ff.getOptionB() + "\n选项C:" + ff.getOptionC() + "\n选项D:" + ff.getOptionD()
                            + "\n答案：" + ff.getAnswer());
                }
            }
                break;
            case 4: {
                QuestionInfo qi = new QuestionInfo();
                System.out.println("请输入科目：(1.java 2.C# 3.JSP):");
                qi.setSubject(sca.nextInt());
                System.out.println("请输入新的题干：");
                qi.setQuestion(sca.next());
                System.out.println("请输入新的选项A：");
                qi.setOptionA(sca.next());
                System.out.println("请输入新的选项B：");
                qi.setOptionB(sca.next());
                System.out.println("请输入新的选项C：");
                qi.setOptionC(sca.next());
                System.out.println("请输入新的选项D：");
                qi.setOptionD(sca.next());
                System.out.println("请输入新的答案：");
                qi.setAnswer(sca.next());
                int flag = bd.add(qi);
                if (flag > 0) {
                    System.out.println("修改成功！");
                } else {
                    System.out.println("修改失败！");
                }
            }
                break;
            case 5: {
                QuestionInfo qi = new QuestionInfo();
                boolean k = true;
                while (k) {
                    System.out.println("请输入需要删除的试题编号：");
                    int cc = sca.nextInt();
                    int flag = bd.deleteInfo(cc);
                    if (flag == 0) {
                        System.out.println("删除失败！");
                    } else {
                        System.out.println("删除成功");
                        k = false;
                    }
                }

            }
                break;
            case 6: {
                x = false;
            }
                break;
            }
        }
    }

}
