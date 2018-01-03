/**
 * Project Name:dt59homework
 * File Name:Student.java
 * Package Name:hw20180103.one
 * Date:2018年1月3日下午2:57:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.one;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:57:54 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Student implements School, Exam {

    @Override
    public String study() {

        // Auto-generated method stub
        return "学生每天都要学习新知识";
    }

    @Override
    public String exam() {

        return "学生通过考试来检测学习情况";
    }

}
