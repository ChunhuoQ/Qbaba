/**
 * Project Name:Demo_dt59_serverlt_01
 * File Name:User.java
 * Package Name:cn.dt59.entity
 * Date:2018年4月13日下午3:38:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.songhang.entity;

/**
 * Description: <br/>
 * Date: 2018年4月13日 下午3:38:05 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class User {
    private int uid;

    private String uname;

    private String upwd;

    private String ustatus;

    private String upic;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    public String getUpic() {
        return upic;
    }

    public void setUpic(String upic) {
        this.upic = upic;
    }

}
