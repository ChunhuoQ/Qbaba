package m04.d19.Qbaba.entity;

public class ShangPing {
    private Integer spid;

    private String spname;

    private Float spprice;

    private String spdesc;

    private String spimg;
    
    private String spcss;
    
    private int num=1;
    
    public ShangPing(Integer spid, String spname, Float spprice, String spdesc, String spimg, String spcss) {
        super();
        this.spid = spid;
        this.spname = spname;
        this.spprice = spprice;
        this.spdesc = spdesc;
        this.spimg = spimg;
        this.spcss = spcss;
       
    }
    
    public ShangPing(Integer spid, String spname, Float spprice, String spdesc, String spimg, String spcss, int num) {
        super();
        this.spid = spid;
        this.spname = spname;
        this.spprice = spprice;
        this.spdesc = spdesc;
        this.spimg = spimg;
        this.spcss = spcss;
        this.num = num;
    }

    /**
     * num.
     *
     * @return  the num
     */
    public int getNum() {
        return num;
    }

    /**
     * num
     *
     * @param   num    the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * spcss.
     *
     * @return  the spcss
     */
    public String getSpcss() {
        return spcss;
    }

    /**
     * spcss
     *
     * @param   spcss    the spcss to set
     */
    public void setSpcss(String spcss) {
        this.spcss = spcss;
    }

    /**
     * spimg.
     *
     * @return  the spimg
     */
    public String getSpimg() {
        return spimg;
    }

    /**
     * spimg
     *
     * @param   spimg    the spimg to set
     */
    public void setSpimg(String spimg) {
        this.spimg = spimg;
    }

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