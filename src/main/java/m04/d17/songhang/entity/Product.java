/**
 * Project Name:Demo_dt59_serverlt_01
 * File Name:Product.java
 * Package Name:cn.dt59.entity
 * Date:2018年4月13日下午2:27:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.songhang.entity;

/**
 * Description: <br/>
 * Date: 2018年4月13日 下午2:27:53 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Product {
    private int pid;

    private String pname;

    private String pbrand;

    private String pmodel;

    private double pprice;

    private String ppicture;

    private String pdesc;

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

    public double getPprice() {
        return pprice;
    }

    public void setPprice(double pprice) {
        this.pprice = pprice;
    }

    public String getPpicture() {
        return ppicture;
    }

    public void setPpicture(String ppicture) {
        this.ppicture = ppicture;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

}
