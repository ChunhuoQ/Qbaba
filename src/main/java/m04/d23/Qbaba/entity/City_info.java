package m04.d23.Qbaba.entity;

public class City_info {
    private Integer citycode;

    private Integer sort;

    private Integer provincecode;

    private String namecn;

    
    
    
    public City_info() {
        
        super();
        //  Auto-generated constructor stub
        
    }

    public City_info(Integer citycode, Integer sort, Integer provincecode, String namecn) {
        super();
        this.citycode = citycode;
        this.sort = sort;
        this.provincecode = provincecode;
        this.namecn = namecn;
    }

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "City_info [citycode=" + citycode + ", sort=" + sort + ", provincecode=" + provincecode + ", namecn="
                + namecn + "]";
    }

    public Integer getCitycode() {
        return citycode;
    }

    public void setCitycode(Integer citycode) {
        this.citycode = citycode;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(Integer provincecode) {
        this.provincecode = provincecode;
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }
}