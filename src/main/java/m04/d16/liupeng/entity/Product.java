/**
 * Project Name:PinHong
 * File Name:Product.java
 * Package Name:com.liupeng.entity
 * Date:2018年4月12日下午10:05:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.liupeng.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午10:05:53 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Product {
    private int pid;

    private String pname;

    private String pbrand;

    private String pmodel;

    private Double pprice;

    private String ppicture;

    public String getPpicture() {
        return ppicture;
    }

    public void setPpicture(String ppicture) {
        this.ppicture = ppicture;
    }

    private String pdes;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPbrand() {
        return pbrand;
    }

    public void setPbrand(String pbrand) {
        this.pbrand = pbrand;
    }

    public String getPmodel() {
        return pmodel;
    }

    public void setPmodel(String pmodel) {
        this.pmodel = pmodel;
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }



    public String getPdes() {
        return pdes;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes;
    }

}

