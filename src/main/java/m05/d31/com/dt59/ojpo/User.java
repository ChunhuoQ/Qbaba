/**
 * Project Name:Qbaba
 * File Name:User.java
 * Package Name:m05.d31.com.dt59.ojpo
 * Date:2018年5月31日上午8:49:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d31.com.dt59.ojpo;
/**
 * Description:   <br/>
 * Date:     2018年5月31日 上午8:49:01 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class User {

    private int id;
    
    private String name;
    
    private char sex;

    /**
     * id.
     *
     * @return  the id
     */
    public int getId() {
        return id;
    }

    /**
     * id
     *
     * @param   id    the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * name.
     *
     * @return  the name
     */
    public String getName() {
        return name;
    }

    /**
     * name
     *
     * @param   name    the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sex.
     *
     * @return  the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * sex
     *
     * @param   age    the age to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + "]";
    }
    
    
    
}

