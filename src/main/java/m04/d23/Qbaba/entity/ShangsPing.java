package m04.d23.Qbaba.entity;

public class ShangsPing {
    private Integer spid;

    private String spname;

    private Float spprice;

    private String spdesc;

    private String spimg;

    private String spcss;

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

    public String getSpimg() {
        return spimg;
    }

    public void setSpimg(String spimg) {
        this.spimg = spimg == null ? null : spimg.trim();
    }

    public String getSpcss() {
        return spcss;
    }

    public void setSpcss(String spcss) {
        this.spcss = spcss == null ? null : spcss.trim();
    }
}