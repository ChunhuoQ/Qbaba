/**
 * Project Name:NewsSystem1.1
 * File Name:Page.java
 * Package Name:com.liupeng.entity
 * Date:2018年4月10日上午10:02:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.liupeng.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月10日 上午10:02:10 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Page {
    private int currentpage;// 当前页

    private int pagesize = 3;// 每页显示条数

    private int sumsize;// 总条数

    private int lastpage;// 尾页的页面数

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
        if (lastpage % pagesize == 0) {
            this.lastpage = lastpage / pagesize;
        } else {
            this.lastpage = lastpage / pagesize + 1;
        }
    }

}

