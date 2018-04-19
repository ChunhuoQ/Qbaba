/**
 * Project Name:Demo_dt59_serverlt_01
 * File Name:Page.java
 * Package Name:cn.dt59.entity
 * Date:2018年4月15日下午12:48:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.songhang.entity;

/**
 * Description: <br/>
 * Date: 2018年4月15日 下午12:48:33 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Page {
    private int currentpage;// 当前类

    private int pagesize = 3;// 每页显示的条数

    private int sumsize;// 总条数

    private int lastpage;// 尾页

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {

        if (currentpage <= 0) {
            this.currentpage = 1;
        } else {
            if (currentpage > this.lastpage) {
                this.currentpage = this.lastpage;
            } else {
                this.currentpage = currentpage;
            }
        }
    }

    /*
     * if (currentpage <= 0) { this.currentpage = 1; } else { if (currentpage >
     * this.lastpage) { this.currentpage = this.lastpage; } else {
     * this.currentpage = currentpage; } } }
     */

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getSumsize() {
        return sumsize;
    }

    public void setSumsize(int sumsize) {
        this.sumsize = sumsize;
    }

    public int getLastpage() {
        return lastpage;
    }

    public void setLastpage(int lastpage) {
        this.lastpage = lastpage;
    }
}
