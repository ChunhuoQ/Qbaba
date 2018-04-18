/**
 * Project Name:Demojsp3
 * File Name:page.java
 * Package Name:com.dt59.entity
 * Date:2018��4��10������4:41:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.lvruiling.com.dt59.entity;

/**
 * Description: <br/>
 * Date: 2018��4��10�� ����4:41:53 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Page {
    private int currentpage;

    private int pagesize = 3;

    private int sumsize;

    private int lastpage;

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

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
