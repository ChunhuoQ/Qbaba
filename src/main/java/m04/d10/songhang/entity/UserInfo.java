/**
 * Project Name:Demo_dt59_news_01
 * File Name:UserInfo.java
 * Package Name:cn.dt59.entity
 * Date:2018年4月7日下午8:08:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.songhang.entity;

/**
 * Description: <br/>
 * Date: 2018年4月7日 下午8:08:04 <br/>
 * 
 * @author songhang
 * @version
 * @see 建立数据库表UserInfo实体类 传统数据
 */
public class UserInfo {
    private int userid;

    private String username;

    private String userpwd;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

}
