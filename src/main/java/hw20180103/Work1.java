/**
 * Project Name:dt59homework
 * File Name:Work1.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:18:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:18:40 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 * 
 */
/*
 * 场景一 ：当有的学生 只学习  有的学生   还抽烟<br/>
 * 写一个 接口类  学习 。再 写一个接口类 抽烟 <br/>
 * 不是没一个学生都抽烟  
 * 
 *场景二：动物  有的东西  有的 吃肉   有的吃草  <br/>
 *写一个   吃肉  的接口类   再写一个 吃草的接口类    <br/>
 *
 *场景三：小学生    有的 玩游戏  有的学习<br/>
 *写一个   玩游戏的接口类  <br/>
 *写一个  学习的 接口类 <br/>
 *
 *
 */

public class Work1 {

}

/**
 * 场景一<br/>
 * 学校老师
 */

interface School {
    /**
     * 老师教学<br/>
     * Description: <br/>
     *
     * @author DuSen
     * @return 老师教学生学什么
     */
    public abstract String teacher();

}

/**
 * 场景二<br/>
 * 学生学习
 */
interface Student {
    /**
     * 学生<br/>
     * Description: <br/>
     *
     * @author DuSen
     * @return 学习什么东西
     */
    public abstract String study();

}

/**
 * 场景三<br/>
 * 有的学生在学校抽烟
 */
interface Student1 {
    /**
     * 有的学生在学校抽烟<br/>
     * Description: <br/>
     *
     * @author DuSen
     */
    public abstract void smoking();
}