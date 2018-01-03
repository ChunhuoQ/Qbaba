/**
 * Project Name:dt59homework
 * File Name:Teacher.java
 * Package Name:hw20180103.one
 * Date:2018年1月3日下午3:04:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.one;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:04:25 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Teacher implements School, Exam {

    @Override
    public String study() {

        // Auto-generated method stub
        return "老师每天都要学习如何教学生学习知识";
    }

    @Override
    public String exam() {

        return "老师通过考试进行教学资格审核";
    }

}
