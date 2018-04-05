/**
 * Project Name:Mybatis
 * File Name:Student.java
 * Package Name:main.java.m04.d04
 * Date:2018年4月4日下午4:38:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d04.Qbaba.entity;

import java.io.Serializable;

/**
 * Description:   <br/>
 * Date:     2018年4月4日 下午4:38:27 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class News implements Serializable{
/**
     * serialVersionUID:
     */
    private static final long serialVersionUID = -3661354076930876321L;
private String username;
private String password;

/**
 * username.
 *
 * @return  the username
 */
public String getUsername() {
    return username;
}
public News(String username, String password) {
    super();
    this.username = username;
    this.password = password;
   
}
public News() {
    
    super();
    //  Auto-generated constructor stub
    
}
/**
 * username
 *
 * @param   username    the username to set
 */
public void setUsername(String username) {
    this.username = username;
}
/**
 * password.
 *
 * @return  the password
 */
public String getPassword() {
    return password;
}
/**
 * password
 *
 * @param   password    the password to set
 */
public void setPassword(String password) {
    this.password = password;
}

}

