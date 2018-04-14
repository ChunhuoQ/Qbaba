package m04.d12.Qbaba.entity;

public class Product {
    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", pbrand=" + pbrand + ", pmodel=" + pmodel + ", pprice="
                + pprice + ", ppicture=" + ppicture + ", pdes=" + pdes + "]";
    }

    private Integer pid;

    private String pname;

    private String pbrand;

    private String pmodel;

    private Float pprice;

    private String ppicture;

    private String pdes;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPbrand() {
        return pbrand;
    }

    public void setPbrand(String pbrand) {
        this.pbrand = pbrand == null ? null : pbrand.trim();
    }

    public String getPmodel() {
        return pmodel;
    }

    public void setPmodel(String pmodel) {
        this.pmodel = pmodel == null ? null : pmodel.trim();
    }

    public Float getPprice() {
        return pprice;
    }

    public void setPprice(Float pprice) {
        this.pprice = pprice;
    }

    public String getPpicture() {
        return ppicture;
    }

    public void setPpicture(String ppicture) {
        this.ppicture = ppicture == null ? null : ppicture.trim();
    }

    public String getPdes() {
        return pdes;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes == null ? null : pdes.trim();
    }
}