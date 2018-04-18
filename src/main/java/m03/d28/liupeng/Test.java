/**
 * Project Name:TestSystem2018
 * File Name:Test.java
 * Package Name:main.java.m03.d28.liupeng
 * Date:2018年3月28日下午2:37:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.liupeng;

import java.util.List;
import java.util.Scanner;

import m03.d28.liupeng.dao.QuestionInfoDao;
import m03.d28.liupeng.dao.impl.QuestionInfoDaoImpl;
import m03.d28.liupeng.entity.QuestionInfo;

/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午2:37:07 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {

        QuestionInfoDao qif = new QuestionInfoDaoImpl();
        System.out.println("**************欢迎使用试题管理系统*************");
        boolean fg = true;
        while (fg) {
        System.out.println("请选择操作：");
        System.out.println("1、列出所有试题");
        System.out.println("2、按科目查询");
        System.out.println("3、按题干模糊查询");
        System.out.println("4、添加试题");
        System.out.println("5、删除试题");
        System.out.println("6、退出系统");
        System.out.print("请选择：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
        case 1: {
            List<QuestionInfo> list = qif.getAllInfo();
            for (QuestionInfo qiif : list) {
                System.out.println(qiif.getQuestionId() + "、" + qiif.getQuestion() + "\n\t" + qiif.getOptionA()
                        + "\n\t" + qiif.getOptionB() + "\n\t" + qiif.getOptionC() + "\n\t" + qiif.getOptionD() + "\n\t"
                        + "答案："
                        + qiif.getAnswer());
            }
            break;
        }
        case 2: {
            System.out.print("请输入科目：(1.java 2.C# 3.jsp):");
            int num1 = sc.nextInt();
            List<QuestionInfo> list = qif.getAllInfo1(num1);
            for (QuestionInfo qiif : list) {
                System.out.println(qiif.getQuestionId() + "、" + qiif.getQuestion() + "\n\t" + qiif.getOptionA()
                        + "\n\t" + qiif.getOptionB() + "\n\t" + qiif.getOptionC() + "\n\t" + qiif.getOptionD() + "\n\t"
                        + "答案：" + qiif.getAnswer());
            }
            break;
        }
        case 3: {
            System.out.print("请输入题干：");
            String like = sc.next();
            List<QuestionInfo> list = qif.getAllInfo2(like);
            for (QuestionInfo qiif : list) {
                System.out.println(qiif.getQuestionId() + "、" + qiif.getQuestion() + "\n\t" + qiif.getOptionA()
                        + "\n\t" + qiif.getOptionB() + "\n\t" + qiif.getOptionC() + "\n\t" + qiif.getOptionD() + "\n\t"
                        + "答案：" + qiif.getAnswer());
            }
            break;
        }
        case 4: {
            QuestionInfo qi = new QuestionInfo();
            System.out.print("请输入科目：(1.java 2.C# 3.jsp):");
            qi.setSubject(sc.nextInt());
            System.out.print("请输入新的题干：");
            qi.setQuestion(sc.next());
            System.out.print("请输入新的选项A：");
            qi.setOptionA(sc.next());
            System.out.print("请输入新的选项B：");
            qi.setOptionB(sc.next());
            System.out.print("请输入新的选项C：");
            qi.setOptionC(sc.next());
            System.out.print("请输入新的选项D：");
            qi.setOptionD(sc.next());
            System.out.print("请输入新答案：");
            qi.setAnswer(sc.next());
            int flag = qif.addInfo(qi);
            if (flag > 0) {
                System.out.println("添加成功！");
            } else {
                System.out.println("添加失败！");
            }
            break;
        }
        case 5: {
            System.out.println("请输入要删除的试题编号:");
            int id = sc.nextInt();
            int flag = qif.deleteInfo(id);
            if (flag > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败！");
            }

            break;
        }
            case 6: {
                System.out.println("**************退出试题管理系统*************");
                fg = false;
                break;
            }
        }
        }
    }

}

