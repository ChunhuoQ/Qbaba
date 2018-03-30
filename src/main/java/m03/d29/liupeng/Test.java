/**
 * Project Name:Qbaba
 * File Name:Test.java
 * Package Name:m03.d29.liupeng
 * Date:2018年3月30日上午8:51:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.liupeng;

import java.util.List;
import java.util.Scanner;

import m03.d29.liupeng.dao.impl.QuestionInfoDaoImpl;
import m03.d29.liupeng.entity.QuestionInfo;

/**
 * Description:   <br/>
 * Date:     2018年3月30日 上午8:51:40 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {

        QuestionInfoDaoImpl qif = new QuestionInfoDaoImpl();
        System.out.println("**************欢迎使用试题管理系统*************");
        boolean fg = true;
        while (fg) {
            System.out.println("请选择操作：");
            System.out.println("1、列出所有试题");
            System.out.println("3、按题干模糊查询");
            System.out.println("6、退出系统");
            System.out.print("请选择：");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
            case 1: {
                List<QuestionInfo> list = qif.callProcedureAllInfo();
                for (QuestionInfo qiif : list) {
                    System.out.println(qiif.getQuestionId() + "、" + qiif.getQuestion() + "\n\t" + qiif.getOptionA()
                            + "\n\t" + qiif.getOptionB() + "\n\t" + qiif.getOptionC() + "\n\t" + qiif.getOptionD()
                            + "\n\t" + "答案：" + qiif.getAnswer());
                }
                break;
            }
            case 3: {
                System.out.print("请输入题干：");
                String like = sc.next();
                List<QuestionInfo> list = qif.getAllInfo2(like);
                for (QuestionInfo qiif : list) {
                    System.out.println(qiif.getQuestionId() + "、" + qiif.getQuestion() + "\n\t" + qiif.getOptionA()
                            + "\n\t" + qiif.getOptionB() + "\n\t" + qiif.getOptionC() + "\n\t" + qiif.getOptionD()
                            + "\n\t" + "答案：" + qiif.getAnswer());
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

