package m05.d14.opjo;

public class Stu extends Grade{
    private Short sid;

    private String sname;

    private Short sage;

    private String scard;

    private Short sgid;

    public Short getSid() {
        return sid;
    }

    public void setSid(Short sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Short getSage() {
        return sage;
    }

    public void setSage(Short sage) {
        this.sage = sage;
    }

    public String getScard() {
        return scard;
    }

    public void setScard(String scard) {
        this.scard = scard == null ? null : scard.trim();
    }

    public Short getSgid() {
        return sgid;
    }

    public void setSgid(Short sgid) {
        this.sgid = sgid;
    }

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Stu [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", scard=" + scard + ", sgid=" + sgid + "]";
    }
    
    
    
}