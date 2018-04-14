package m04.d12.Qbaba.entity;

public class User {
    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", ustatus=" + ustatus + ", upic=" + upic
                + "]";
    }

    private Integer uid;

    private String uname;

    private String upwd;

    private String ustatus;

    private String upic;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus == null ? null : ustatus.trim();
    }

    public String getUpic() {
        return upic;
    }

    public void setUpic(String upic) {
        this.upic = upic == null ? null : upic.trim();
    }
}