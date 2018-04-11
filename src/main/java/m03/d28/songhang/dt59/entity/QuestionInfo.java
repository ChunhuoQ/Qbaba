
/**
 * Project Name:Demo_pro_jdbc_fc_01
 * File Name:QuestionInfo.java
 * Package Name:cn.dt59.entity
 * Date:2018年3月28日下午5:45:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.songhang.dt59.entity;

/**
 * Description: <br/>
 * Date: 2018年3月28日 下午5:45:47 <br/>
 * 
 * @author songhang
 * @version 创建实体类QuestionInfo，<br/>
 *          根据业务提供需要的构造方法和setter/getter方法。<br/>
 * @see
 */
public class QuestionInfo {
    private int questionId;

    private String question;

    private String questionA;

    private String questionB;

    private String questionC;

    private String questionD;

    private int subject;

    private String answer;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionA() {
        return questionA;
    }

    public void setQuestionA(String questionA) {
        this.questionA = questionA;
    }

    public String getQuestionB() {
        return questionB;
    }

    public void setQuestionB(String questionB) {
        this.questionB = questionB;
    }

    public String getQuestionC() {
        return questionC;
    }

    public void setQuestionC(String questionC) {
        this.questionC = questionC;
    }

    public String getQuestionD() {
        return questionD;
    }

    public void setQuestionD(String questionD) {
        this.questionD = questionD;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
