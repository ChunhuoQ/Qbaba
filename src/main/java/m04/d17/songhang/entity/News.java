/**
 * Project Name:Qbaba
 * File Name:News.java
 * Package Name:m04.d12.songhang.entity
 * Date:2018年4月12日下午7:32:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.songhang.entity;

import java.util.Date;

/**
 * Description: <br/>
 * Date: 2018年4月12日 下午7:32:46 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class News {
    private int nid;

    private String ntite;

    private String ncontent;

    private Date ndate;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNtite() {
        return ntite;
    }

    public void setNtite(String ntite) {
        this.ntite = ntite;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public Date getNdate() {
        return ndate;
    }

    public void setNdate(Date ndate) {
        this.ndate = ndate;
    }

}
