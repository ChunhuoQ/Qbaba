package m04.d23.Qbaba.entity;

public class Province_info {
    private String provincecode;

    private String namecn;

    private String countrycode;

    private Integer sort;

    
    
    public Province_info() {
        
        super();
        //  Auto-generated constructor stub
        
    }

    public Province_info(String provincecode, String namecn, String countrycode, Integer sort) {
        super();
        this.provincecode = provincecode;
        this.namecn = namecn;
        this.countrycode = countrycode;
        this.sort = sort;
    }

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Province_info [provincecode=" + provincecode + ", namecn=" + namecn + ", countrycode=" + countrycode
                + ", sort=" + sort + "]";
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode == null ? null : provincecode.trim();
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}