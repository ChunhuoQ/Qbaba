/**
 * Project Name:Qbaba
 * File Name:User.java
 * Package Name:m05.d25.com.dt59.opjo
 * Date:2018年5月25日下午11:01:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d25.com.dt59.opjo;
/**
 * Description:   <br/>
 * Date:     2018年5月25日 下午11:01:35 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class User {
private String username;
private String password;
private String phone;
private String emil;
private int authcode;
/**
 * username.
 *
 * @return  the username
 */
public String getUsername() {
    return username;
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
/**
 * phone.
 *
 * @return  the phone
 */
public String getPhone() {
    return phone;
}
/**
 * phone
 *
 * @param   phone    the phone to set
 */
public void setPhone(String phone) {
    this.phone = phone;
}
/**
 * emil.
 *
 * @return  the emil
 */
public String getEmil() {
    return emil;
}
/**
 * emil
 *
 * @param   emil    the emil to set
 */
public void setEmil(String emil) {
    this.emil = emil;
}
/**
 * authcode.
 *
 * @return  the authcode
 */
public int getAuthcode() {
    return authcode;
}
/**
 * authcode
 *
 * @param   authcode    the authcode to set
 */
public void setAuthcode(int authcode) {
    this.authcode = authcode;
}
/**
 *
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
    return "User [username=" + username + ", password=" + password + ", phone=" + phone + ", emil=" + emil
            + ", authcode=" + authcode + "]";
}


}

