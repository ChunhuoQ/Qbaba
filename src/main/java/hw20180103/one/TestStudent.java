/**
 * Project Name:dt59homework
 * File Name:TestSchool.java
 * Package Name:hw20180103.one
 * Date:2018年1月3日下午3:07:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.one;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:07:07 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestStudent {
    private final static Logger LOG = Logger.getLogger(TestStudent.class);

    public static void main(String[] args) {
        School student = new Student();
        Exam student2 = new Student();
        LOG.info(student.study());
        LOG.info(student2.exam());
        School teacher = new Teacher();
        Exam teacher2 = new Teacher();
        LOG.info(teacher.study());
        LOG.info(teacher2.exam());

    }
}
