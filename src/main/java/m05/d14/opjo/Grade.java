package m05.d14.opjo;

import java.util.Set;

public class Grade {
    private Integer gid;

    private String gclass;
    
    private Set<Stu> stus;
    
    
    
    /**
     * stu.
     *
     * @return  the stu
     */
    public Set<Stu> getStus() {
        return stus;
    }

    /**
     * stu
     *
     * @param   stu    the stu to set
     */
    public void setStus(Set<Stu> stus) {
        this.stus = stus;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGclass() {
        return gclass;
    }

    public void setGclass(String gclass) {
        this.gclass = gclass == null ? null : gclass.trim();
    }

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Grade [gid=" + gid + ", gclass=" + gclass + "]";
    }
    
}