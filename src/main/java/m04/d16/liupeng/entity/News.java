/**
 * Project Name:PinHong
 * File Name:News.java
 * Package Name:com.liupeng.entity
 * Date:2018年4月12日下午10:03:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.liupeng.entity;

import java.util.Date;

/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午10:03:53 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class News {
    private int nid;

    private String ntitle;

    private String ncontent;

    private Date ndate;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
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

