/**
 * Project Name:Qbaba
 * File Name:QuestionInfoDaoImpl.java
 * Package Name:m03.d28.Qbaba.entity
 * Date:2018年3月28日下午1:53:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m03.d28.Qbaba.entity;
/**
 * Description:   <br/>
 * Date:     2018年3月28日 下午1:53:59 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class QuestionInfoDaoImpl  {
    private int questionId;
    
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private int subject;
    private String answer;
    
    /**
     * questionId.
     *
     * @return  the questionId
     */
    public int getQuestionId() {
        return questionId;
    }
    /**
     * questionId
     *
     * @param   questionId    the questionId to set
     */
    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
    /**
     * question.
     *
     * @return  the question
     */
    public String getQuestion() {
        return question;
    }
    /**
     * question
     *
     * @param   question    the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    /**
     * optionA.
     *
     * @return  the optionA
     */
    public String getOptionA() {
        return optionA;
    }
    /**
     * optionA
     *
     * @param   optionA    the optionA to set
     */
    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }
    /**
     * optionB.
     *
     * @return  the optionB
     */
    public String getOptionB() {
        return optionB;
    }
    /**
     * optionB
     *
     * @param   optionB    the optionB to set
     */
    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }
    /**
     * optionC.
     *
     * @return  the optionC
     */
    public String getOptionC() {
        return optionC;
    }
    /**
     * optionC
     *
     * @param   optionC    the optionC to set
     */
    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }
    /**
     * optionD.
     *
     * @return  the optionD
     */
    public String getOptionD() {
        return optionD;
    }
    /**
     * optionD
     *
     * @param   optionD    the optionD to set
     */
    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }
    /**
     * subject.
     *
     * @return  the subject
     */
    public int getSubject() {
        return subject;
    }
    /**
     * subject
     *
     * @param   subject    the subject to set
     */
    public void setSubject(int subject) {
        this.subject = subject;
    }
    /**
     * answer.
     *
     * @return  the answer
     */
    public String getAnswer() {
        return answer;
    }
    /**
     * answer
     *
     * @param   answer    the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}

