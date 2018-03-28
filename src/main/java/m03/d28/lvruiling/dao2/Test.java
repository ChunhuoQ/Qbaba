/**
 * Project Name:Demo
 * File Name:Test.java
 * Package Name:dao2
 * Date:2018��3��28������4:53:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.lvruiling.dao2;

import java.util.List;
import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018��3��28�� ����4:53:06 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择操作(1.列出所有试题 2.按科目查询 3.按题干模糊查询4.添加试题5.删除试题6.退出)");
        questionInfoDao qui = new QuestionInfoDaoImpl();
        QuestionInfo qui1 = new QuestionInfo();
        int num = scanner.nextInt();
        if (num == 1) {
            List<QuestionInfo> list = qui.getAllInfo();
            for (QuestionInfo ff : list) {
                System.out.println(ff.getQuestionId() + ff.getQuestion() + "\n" + ff.getOptionA() + "\n"
                        + ff.getOptionB() + "\n" + ff.getOptionC() + "\n" + ff.getOptionC() + "\n" + ff.getSubject()
                        + "\n" + ff.getAnswer());
            }

        }
        if (num == 2) {
            System.out.println("请输入要筛选的科目，1，2，3");
            String num2 = scanner.next();
            String sql = " SELECT * FROM question_info WHERE SUBJECT=num2";
            List<QuestionInfo> list = qui.getAllInfo();
            for (QuestionInfo ff : list) {
                System.out.println(ff.getQuestionId() + ff.getQuestion() + "\n" + ff.getOptionA() + "\n"
                        + ff.getOptionB() + "\n" + ff.getOptionC() + "\n" + ff.getOptionC() + "\n" + ff.getSubject()
                        + "\n" + ff.getAnswer());
            }
        }
        if (num == 3) {
            System.out.println("请输入题干：");
            String num3 = scanner.next();
            String sql = "SELECT * FROM question_info  WHERE question LIKE '%" + num3 + "%'";
            List<QuestionInfo> list = qui.getAllInfo();
            for (QuestionInfo ff : list) {
                System.out.println(ff.getQuestionId() + ff.getQuestion() + "\n" + ff.getOptionA() + "\n"
                        + ff.getOptionB() + "\n" + ff.getOptionC() + "\n" + ff.getOptionC() + "\n" + ff.getSubject()
                        + "\n" + ff.getAnswer());
            }
        }
        if (num == 4) {
            System.out.println("请输入要修改的编号：");
            qui1.setQuestionId(scanner.nextInt());
            System.out.println("请输入要修改的题目:");
            qui1.setQuestion(scanner.next());
            System.out.println("请输入要修改的选项A：");
            qui1.setOptionA(scanner.next());
            System.out.println("请输入要修改的选项B：");
            qui1.setOptionB(scanner.next());
            System.out.println("请输入要修改的选项C：");
            qui1.setOptionC(scanner.next());
            System.out.println("请输入要修改的选项D：");
            qui1.setOptionD(scanner.next());
            int flag = qui.saveInfo2(qui1);
            if (flag > 0) {
                System.out.println("修改成功！");
            } else {
                System.out.println("修改失败！");
            }
        }
        if (num == 5) {
            System.out.println("请输入要删除的题号：");
            int id = scanner.nextInt();
            int flag = qui.deleteInfo(id);
            System.out.println("删除的结果：" + flag);
            System.out.println("=====================结果是：======================");
            int flag2 = qui.deleteInfo(id);
            List<QuestionInfo> list2 = qui.getAllInfo();
            for (QuestionInfo ff : list2) {
                System.out.println(ff.getQuestionId() + ff.getQuestion() + "\n" + ff.getOptionA() + "\n"
                        + ff.getOptionB() + "\n" + ff.getOptionC() + "\n" + ff.getOptionC() + "\n" + ff.getSubject()
                        + "\n" + ff.getAnswer());
            }
        }
        if (num == 6) {

            System.out.println("退出成功");
        }

    }
}
