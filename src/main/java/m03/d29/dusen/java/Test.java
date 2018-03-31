/**
 * Project Name:jdbc_demo2
 * File Name:Test.java
 * Package Name:m03.d29.dusen.java
 * Date:2018年3月30日上午10:28:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d29.dusen.java;

import java.util.List;
import java.util.Scanner;

import m03.d29.dusen.dao.QuestionInfoDao;
import m03.d29.dusen.dao.impl.QuestionInfoDaoImpl;
import m03.d29.dusen.entity.QuestionInfo;

/**
 * Description: <br/>
 * Date: 2018年3月30日 上午10:28:51 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Test {
    QuestionInfoDao qf = new QuestionInfoDaoImpl();

    public static void main(String[] args) {
        Test ts = new Test();
       
         ts.init();
    }
    Scanner sca = new Scanner(System.in);
    public void init() {
        boolean x= true;
        while (x) {
            System.out.println("*******************************欢迎使用试题管理系统****************************************\n\n");
            System.out.println("请选择操作(1.列出所有试题  2.按科目查询  3.按题干模糊查询  4.添加试题  5.删除试题  6.退出系统):");
            int num = sca.nextInt();
            switch (num) {
            case 1:
                cha1();
                break;
            case 2:
                cha2();
                break;
            case 3:
                cha3();
                break;
            case 4:
                cha4();
                break;
            case 5:
                cha5();
                break;
            case 6:
                x=false;
                break;
            }
        }
    }
    public void cha1() {
        List<QuestionInfo> list = qf.cha();
        for (QuestionInfo ff : list) {
            System.out.println(ff.getQuestionId() + "、" + ff.getQuestion() + "\n选项A:" + ff.getOptionA() + "\n选项B:"
                    + ff.getOptionB() + "\n选项C:" + ff.getOptionC() + "\n选项D:" + ff.getOptionD() + "\n答案："
                    + ff.getAnswer());
        }
    }

    public void cha2() {
        System.out.println("你说查询的内容以失踪");
    }

    public void cha3() {
        System.out.println("请输入题干:");
        String cont = sca.next();
        List<QuestionInfo> list2 = qf.getMhu(cont);
        for (QuestionInfo ff : list2) {
            System.out.println(ff.getQuestionId() + "、" + ff.getQuestion() + "\n选项A:" + ff.getOptionA() + "\n选项B:"
                    + ff.getOptionB() + "\n选项C:" + ff.getOptionC() + "\n选项D:" + ff.getOptionD() + "\n答案："
                    + ff.getAnswer());
        }
    }

    public void cha4() {
        System.out.println("你说查询的内容以失踪");
    }

    public void cha5() {
        System.out.println("你说查询的内容以失踪");
    }

    public void cha6() {
    }
}
