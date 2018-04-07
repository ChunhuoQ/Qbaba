/**
 * Project Name:NewsSystem1.1
 * File Name:UserInfo.java
 * Package Name:com.liupeng.entity
 * Date:2018年4月5日下午8:43:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d04.liupeng.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月5日 下午8:43:12 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class UserInfo {
    private int user_id;

    private String username;

    private String password;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

