package m04.d12.Qbaba.entity;

import java.util.Date;

public class Message {
    private Integer mid;

    private String mtitle;

    private String mcontent;

    private String mname;

    private Date mdate;

    private Integer rcount;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle == null ? null : mtitle.trim();
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent == null ? null : mcontent.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public Integer getRcount() {
        return rcount;
    }

    public void setRcount(Integer rcount) {
        this.rcount = rcount;
    }

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Message [mid=" + mid + ", mtitle=" + mtitle + ", mcontent=" + mcontent + ", mname=" + mname
                + ", mdate=" + mdate + ", rcount=" + rcount + "]";
    }
    
    
}