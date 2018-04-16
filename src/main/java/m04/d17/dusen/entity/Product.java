/**
 * Project Name:pinhong1
 * File Name:Product.java
 * Package Name:com.entity
 * Date:2018年4月12日下午10:30:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.dusen.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月12日 下午10:30:54 <br/>
 * @author   lenovopc
 * @version
 * @see
 */
public class Product {
    private int pid;
    private String pname;
    private String pdrand;
    private String pmodel;
    private double pprice;
    private String ppicture;
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
    public String getPdrand() {
        return pdrand;
    }
    public void setPdrand(String pdrand) {
        this.pdrand = pdrand;
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
    public String getPdes() {
        return pdes;
    }
    public void setPdes(String pdes) {
        this.pdes = pdes;
    }
    
}

