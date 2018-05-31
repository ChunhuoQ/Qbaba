/**
 * Project Name:Qbaba
 * File Name:role.java
 * Package Name:m04.d11.entity
 * Date:2018年5月22日下午4:38:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d11.entity;
/**
 * Description:   <br/>
 * Date:     2018年5月22日 下午4:38:53 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Role {

    private String admin;
    
    private String vip;
    
    private String user;
    
    

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Role [admin=" + admin + ", vip=" + vip + ", user=" + user + "]";
    }

    /**
     * admin.
     *
     * @return  the admin
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * admin
     *
     * @param   admin    the admin to set
     */
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    /**
     * vip.
     *
     * @return  the vip
     */
    public String getVip() {
        return vip;
    }

    /**
     * vip
     *
     * @param   vip    the vip to set
     */
    public void setVip(String vip) {
        this.vip = vip;
    }

    /**
     * user.
     *
     * @return  the user
     */
    public String getUser() {
        return user;
    }

    /**
     * user
     *
     * @param   user    the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    
}

