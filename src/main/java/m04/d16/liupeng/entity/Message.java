/**
 * Project Name:PinHong
 * File Name:Message.java
 * Package Name:com.liupeng.entity
 * Date:2018年4月16日下午2:36:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.liupeng.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月16日 下午2:36:29 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Message {
    private int mid;

    private String mtitle;

    private String mcontent;

    private String mname;

    private String mdate;

    private int rcount;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

}

