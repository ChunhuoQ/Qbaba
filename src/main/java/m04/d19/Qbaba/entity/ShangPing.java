package m04.d19.Qbaba.entity;

public class ShangPing {
    private Integer spid;

    private String spname;

    private Float spprice;

    private String spdesc;

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname == null ? null : spname.trim();
    }

    public Float getSpprice() {
        return spprice;
    }

    public void setSpprice(Float spprice) {
        this.spprice = spprice;
    }

    public String getSpdesc() {
        return spdesc;
    }

    public void setSpdesc(String spdesc) {
        this.spdesc = spdesc == null ? null : spdesc.trim();
    }
}